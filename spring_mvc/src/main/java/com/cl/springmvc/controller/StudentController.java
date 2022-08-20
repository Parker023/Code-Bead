package com.cl.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cl.springmvc.dao.StudentDao;
import com.cl.springmvc.dto.Student;

@Controller
public class StudentController {
	@Autowired
	StudentDao dao;

	@RequestMapping("login")
	public ModelAndView getModelAndView() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("login.jsp");
		modelAndView.addObject("student", new Student());
		return modelAndView;
	}

	@RequestMapping( "savestudent")
	public ModelAndView saveStudent(@ModelAttribute Student student) {
		dao.saveStudent(student);
		List<Student> students=dao.getAllStudents();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("students", students);
		modelAndView.setViewName("view.jsp");
		return modelAndView;
	}
	@RequestMapping("delete")
	public ModelAndView deleteStudent(@RequestParam int id) {
		dao.deleteStudent(id);
		List<Student> students=dao.getAllStudents();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("students", students);
		modelAndView.setViewName("view.jsp");
		return modelAndView;
	}
//	@RequestMapping("deletestd")
//	public ModelAndView remove() {
//		ModelAndView andView=new ModelAndView();
//		andView.setViewName("remove.jsp");
//		return andView;
//	}
//	@RequestMapping("deletestudent")
//	public ModelAndView removeStudent(@RequestAttribute int id) {
//		dao.deleteStudent(id);
//		ModelAndView andView=new ModelAndView();
//		andView.setViewName("removedisplay.jsp");
//		return andView;
//	}
	@RequestMapping("edit")
	public ModelAndView editStudent(@RequestParam int id) {
		Student student=dao.getByID(id);
		ModelAndView andView=new ModelAndView();
		andView.addObject("student", student);
		andView.setViewName("edit.jsp");
		return andView;
	}
	@RequestMapping("updatestudent")
	public ModelAndView viewStudent(@ModelAttribute Student student) {
		dao.updatStudent(student);
		List<Student> students=dao.getAllStudents();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("students", students);
		modelAndView.setViewName("view.jsp");
		return modelAndView;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
