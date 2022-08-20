package com.cl.controller;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder.In;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cl.dao.EmployeeDao;
import com.cl.dto.Employee;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeDao dao;

	@RequestMapping("register")
	public ModelAndView getModelAndView() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("register.jsp");
		modelAndView.addObject("employee", new Employee());
		return modelAndView;
	}

	@RequestMapping("saveemployee")
	public ModelAndView saveEmployee(@ModelAttribute Employee employee) {
		dao.saveEmployee(employee);
		List<Employee> employees = dao.getAllEmployees();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("display.jsp");
		modelAndView.addObject("employees", employees);
		return modelAndView;
	}

	@RequestMapping("delete")
	public ModelAndView deleteEmployee(@RequestParam int id) {
		dao.deleteEmployee(id);
		List<Employee> employees = dao.getAllEmployees();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("display.jsp");
		modelAndView.addObject("employees", employees);
		return modelAndView;
	}

	@RequestMapping("edit")
	public ModelAndView editEmployee(@RequestParam int id) {
		Employee employee = dao.getEmployeeById(id);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("edit.jsp");
		modelAndView.addObject("employee", employee);
		return modelAndView;
	}

	@RequestMapping("editemployee")
	public ModelAndView viewUpdateEmployee(@ModelAttribute Employee employee) {
		dao.updateEmployee(employee);
		List<Employee> employees = dao.getAllEmployees();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("display.jsp");
		modelAndView.addObject("employees", employees);
		return modelAndView;
	}

	@RequestMapping("remove")
	public ModelAndView removeEmployee() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("remove.jsp");
		return modelAndView;
	}

	@RequestMapping("removeemp")
	public ModelAndView removeEmp(HttpServletRequest request) {
		int id = Integer.parseInt(request.getParameter("id"));
		dao.deleteEmployee(id);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("deletemsg.jsp");
		return modelAndView;
	}
}
