package edu.ATM_Machine;

public class BankAccount {
  private double currentBalance;

  public BankAccount(double currentBalance) {
    this.currentBalance = currentBalance;
  }

  public double balance() {
    return currentBalance;
  }

  // Methods
  public void withdraw(double amount) {
    if (amount >= currentBalance)
      System.out.println("Withdrawl amount is: " + (amount - amount));
    else
      System.out.println("Your bank balance is low! Unable to withdraw");
  }

  public void deposit(double amount) {
    System.out.println("Successfully deposited");
    System.out.println("Your current balance is: " + (amount + currentBalance));
  }

}
