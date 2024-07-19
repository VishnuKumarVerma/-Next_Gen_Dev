package edu.ATM_Machine;

import java.util.Map;
import java.util.Scanner;

public class Login {

  public void userLogin(Map<String, User> users) {
    try (Scanner userInput = new Scanner(System.in)) {
      BankAccount userAccount = new BankAccount(1000);
      System.out.print("Enter the CardNumber: ");
      String cardnumber = userInput.nextLine();
      System.out.print("Enter the pin: ");
      String pin = userInput.nextLine();

      if (users.containsKey(cardnumber)) {
        User user = users.get(cardnumber);
        if (user.getPin().equals(pin)) {
          System.out.println("Login successful");
          System.out.println("1. View current balance");
          System.out.println("2. Withdraw Money");
          System.out.println("3. Deposit Money");
          int choice = userInput.nextInt();
          switch (choice) {
            case 1:
              System.out.println("Current balance: " + userAccount.balance());
              break;
            case 2:
              System.out.print("Enter the amount to withdraw: ");
              double withdrawAmount = userInput.nextDouble();
              if (withdrawAmount <= userAccount.balance()) {
                userAccount.withdraw(withdrawAmount);
                System.out.println("Withdraw successful. New balance: " + userAccount.balance());
              } else {
                System.out.println("Your balance is low! Please add some money.");
              }
              break;
            case 3:
              System.out.print("Enter the amount to deposit: ");
              double depositAmount = userInput.nextDouble();
              userAccount.deposit(depositAmount);
              System.out.println("Deposit successful. New balance: " + userAccount.balance());
              break;
            default:
              System.out.println("Invalid Input!");
          }

        } else {
          System.out.println("Invalid pin");
        }
      } else {
        System.out.println("Invalid CardNumber");
      }
    }
  }
}
