package org.Parker1.Shannu.Threads;
public class Bank {
	int balance;
	public Bank(int amount) {
		this.balance = amount;
	}
	synchronized public void withdraw(int withdrawamount)  {
		if(withdrawamount>balance) {
			System.out.println("insufficient Balance");
			try {
				wait(3000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			withdraw(withdrawamount);
			return;
		}
		balance=balance-withdrawamount;
		System.out.println("Withdrawn Amount: "+withdrawamount);
		System.out.println("Available Balance "+balance);
	}
		synchronized public void deposit(int amt) {
			balance=balance+amt;
			System.out.println("Deposited Amount: "+amt);
			System.out.println("balance remain: "+balance);
			notify();
		}
}
