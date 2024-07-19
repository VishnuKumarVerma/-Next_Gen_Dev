package edu.ATM_Machine;

import java.util.Map;
import java.util.Scanner;

public class SignUp {
  Scanner userInput;
  Map<String, User> users;

  public SignUp(Map<String, User> users) {
    this.users = users;
    userInput = new Scanner(System.in);
  }

  public void addUser() {
    System.out.print("Enter your Username: ");
    String userName = userInput.nextLine();
    System.out.print("Enter your cardNumber: ");
    String cardNumber = userInput.nextLine();
    System.out.print("Enter the pin: ");
    String pin = userInput.nextLine();

    User user = new User(userName, cardNumber, pin);
    users.put(cardNumber, user);
    System.out.println("User added Successfully!");
  }

  public void displayUserData() {
    for (Map.Entry<String, User> entry : users.entrySet()) {
      System.out.println("Card Number: " + entry.getKey() + ", Pin: " + entry.getValue().getPin());
    }
  }
}
