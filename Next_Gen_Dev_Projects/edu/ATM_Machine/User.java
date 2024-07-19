package edu.ATM_Machine;

public class User {
  private String userName;
  private String cardNumber;
  private String pin;

  public User(String userName, String cardNumber, String pin) {
    this.userName = userName;
    this.cardNumber = cardNumber;
    this.pin = pin;
  }

  public String getUserName() {
    return userName;
  }

  public String getCardNumber() {
    return cardNumber;
  }

  public String getPin() {
    return this.pin;
  }

  @Override
  public String toString() {
    return "UserName: " + userName + "\nCard number: " + cardNumber + "\n";
  }

}
