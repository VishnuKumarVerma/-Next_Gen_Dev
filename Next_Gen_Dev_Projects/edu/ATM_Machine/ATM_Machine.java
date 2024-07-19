package edu.ATM_Machine;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ATM_Machine {
  private static Map<String, User> users;

  public static void main(String[] args) {
    users = new LinkedHashMap<>();
    SignUp signUp = new SignUp(users);
    Login login = new Login();

    try (Scanner userInput = new Scanner(System.in)) {
      System.out.println("Welcome!");
      signUp.addUser();
      System.out.println("1. Display Users Data");
      System.out.println("2. Login");
      System.out.println("Press any key to Exit!");
      int choose = userInput.nextInt();
      switch (choose) {
        case 1:
          signUp.displayUserData();
          break;
        case 2:
          login.userLogin(users);
          break;
        default:
          System.out.println("Thanks!");
          break;
      }
    }
  }
}
