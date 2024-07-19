# ATM Machine Project  

## Overview  

The **ATM Machine** project is a Java-based application that simulates the functionality of an Automated Teller Machine (ATM). It allows users to create accounts, log in with their credentials, check their balance, deposit money, and withdraw funds. This project serves as an educational tool to demonstrate the principles of object-oriented programming, user authentication, and basic banking functionalities.  

---  

## Features  

- **User Registration**: Create new accounts with a unique Card Number and PIN.  
- **User Login**: Access account using a Card Number and PIN.  
- **Balance Inquiry**: Check the current account balance.  
- **Withdrawals**: Withdraw money from the account with balance validation.  
- **Deposits**: Deposit money into the account.  
- **User Management**: Add and display user data.  

---  

## Technologies Used  

- **Java**: Core programming language for implementation.  
- **Java Collections Framework**: To manage user data with `Map` and `LinkedHashMap`.  
- **Scanner**: For handling user input from the console.  

---  

## Project Structure  

edu/
└── ATM_Machine/
├── ATM_Machine.java # Main application file that starts the ATM machine
├── User.java # Represents a user account with attributes
├── BankAccount.java # Handles banking operations like deposit and withdrawal
├── Login.java # Manages user login functionality
└── SignUp.java # Handles user registration

---  

## Class Descriptions  

### 1. ATM_Machine  

- **Purpose**: The entry point for the ATM application. Coordinates the user sign-up and login processes.  
- **Key Methods**:  
  - `main(String[] args)`: Initializes the application, prompts for user actions, and processes user input.  

### 2. User  

- **Purpose**: Represents a user of the ATM with attributes: username, card number, and PIN.  
- **Key Methods**:  
  - `getUserName()`: Returns the user's name.  
  - `getCardNumber()`: Returns the user's card number.  
  - `getPin()`: Returns the user's PIN.  

### 3. BankAccount  

- **Purpose**: Handles banking operations such as checking balance, depositing, and withdrawing money.  
- **Key Methods**:  
  - `balance()`: Returns the current balance.  
  - `withdraw(double amount)`: Withdraws a specified amount if sufficient balance exists.  
  - `deposit(double amount)`: Increases the balance by the deposited amount.  

### 4. Login  

- **Purpose**: Manages the login process for users and facilitates access to banking operations.  
- **Key Methods**:  
  - `userLogin(Map<String, User> users)`: Handles the login procedure and allows users to perform banking activities.  

### 5. SignUp  

- **Purpose**: Handles user registration.  
- **Key Methods**:  
  - `addUser()`: Prompts for user information and stores new users.  
  - `displayUserData()`: Displays the list of registered users.  

---  

## Usage Instructions  

### Compile and Run the Application  

1. Use a Java IDE (like IntelliJ IDEA or Eclipse) or command line to compile the Java files.  
2. Run `ATM_Machine.java` to start the application.  

### User Registration  

- Follow the prompts to input your username, card number, and PIN for registration.  

### User Options  

- After registration, you will be presented with options:  
  - **Display Users Data**: View all registered users.  
  - **Login**: Log into your account to access bank functions.  

### Perform Banking Operations  

- Upon successful login, choose from:  
  - View current balance.  
  - Withdraw money.  
  - Deposit money.  

---  

## Example Input and Output  

### Sample Input  

Welcome!
Enter your Username: JohnDoe
Enter your cardNumber: 123456789
Enter the pin: 1234

Display Users Data
Login
Press any key to Exit!
2
Enter the CardNumber: 123456789
Enter the pin: 1234
Login successful
View current balance
Withdraw Money
Deposit Money
Enter your choice: 1
Current balance: 1000.0

### Sample Output  

User added Successfully!
Card Number: 123456789, Pin: 1234
Login successful
Current balance: 1000.0

---  

## Conclusion  

The **ATM Machine** project illustrates the principles of object-oriented programming and basic software development skills. It showcases how to implement user authentication, account management, and basic financial operations effectively.  

---  

## Future Enhancements  

- **Enhanced Security**: Implement secure password storage and hashing methods.  
- **Data Persistence**: Store user data in a database or file system for permanent access.  
- **Graphical User Interface (GUI)**: Create a user-friendly interface for interacting with the ATM system.  
- **Extended Banking Features**: Include more banking functionalities, such as fund transfers and transaction history.  

This README provides a comprehensive overview and clarity on how to navigate the **ATM Machine** project. Happy coding!  

## Instructions to Use the README

- Copy the above markdown text.
- Paste it into a file named README.md in your project directory.
- You can render this markdown file using GitHub or markdown viewers for a clean and visually appealing layout.
