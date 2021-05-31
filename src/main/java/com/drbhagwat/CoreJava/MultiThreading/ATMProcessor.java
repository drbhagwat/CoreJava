package com.drbhagwat.CoreJava.MultiThreading;

public class ATMProcessor extends Thread {
  private volatile static int cash = 120;

  public void run() {
	withdraw(100);
  }

  public void updateBalance(int withdrawalAmount) {
	synchronized(this) {
	  cash -= withdrawalAmount;
  }
  }

  public void withdraw(int withdrawalAmount) {
	if (validateWithdrawal(withdrawalAmount)) {
	  updateBalance(withdrawalAmount);
	  printCurrentBalance();
	} else {
	  System.out.println("Not enough money in the account");
	}
  }

  public void printCurrentBalance() {
	System.out.println("The current balance in the account is " + cash);
  }

  public boolean validateWithdrawal(int withdrawalAmount) {
	if (withdrawalAmount <= cash) {
	  return true;
	} else {
	  return false;
	}
  }

  public static void main(String[] args) {
	ATMProcessor t1 = new ATMProcessor();
	ATMProcessor t2 = new ATMProcessor();
	t1.start();
	t2.start();
  }
}
