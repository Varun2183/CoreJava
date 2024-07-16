package com.assignment.banking;

//Custom exception for handling insufficient funds scenario
class InsufficientFundsException extends Exception {
 public InsufficientFundsException(String message) {
     super(message);
 }
}

//Custom exception for handling invalid amount scenario
class InvalidAmountException extends Exception {
 public InvalidAmountException(String message) {
     super(message);
 }
}

//BankAccount class representing a bank account
class BankAccount {
 private int accountNumber;
 private double balance;

 // Parameterized constructor to initialize account number and balance
 public BankAccount(int accountNumber, double initialBalance) {
     this.accountNumber = accountNumber;
     if (initialBalance < 0) {
         throw new IllegalArgumentException("Initial balance cannot be negative.");
     }
     this.balance = initialBalance;
 }

 // Method to deposit an amount into the bank account
 public void deposit(double amount) throws InvalidAmountException {
     if (amount <= 0) {
         throw new InvalidAmountException("Deposit amount must be greater than zero.");
     }
     balance += amount;
 }

 // Method to withdraw an amount from the bank account
 public void withdraw(double amount) throws InsufficientFundsException, InvalidAmountException {
     if (amount <= 0) {
         throw new InvalidAmountException("Withdrawal amount must be greater than zero.");
     }
     if (amount > balance) {
         throw new InsufficientFundsException("Insufficient funds for withdrawal.");
     }
     balance -= amount;
 }

 // Method to display the current balance of the bank account
 public void displayBalance() {
     System.out.println("Account Number: " + accountNumber + ", Balance: $" + balance);
 }
}

public class BankingSystem {

	public static void main(String[] args) {
        // Creating a new BankAccount object with an initial balance
        BankAccount account = new BankAccount(12345, 1000.00);

        // Displaying the initial balance
        account.displayBalance();

        try {
            // Attempting to deposit a valid amount
            account.deposit(500.00);
            System.out.println("Deposit successful.");
        } catch (InvalidAmountException e) {
            System.err.println("Deposit error: " + e.getMessage());
        } finally {
            // Displaying the balance after deposit attempt
            account.displayBalance();
        }

        try {
            // Attempting to withdraw a valid amount
            account.withdraw(300.00);
            System.out.println("Withdrawal successful.");
        } catch (InsufficientFundsException | InvalidAmountException e) {
            System.err.println("Withdrawal error: " + e.getMessage());
        } finally {
            // Displaying the balance after withdrawal attempt
            account.displayBalance();
        }

        try {
            // Attempting to withdraw an amount exceeding the current balance
            account.withdraw(1500.00);
        } catch (InsufficientFundsException | InvalidAmountException e) {
            System.err.println("Withdrawal error: " + e.getMessage());
        } finally {
            // Displaying the balance after failed withdrawal attempt
            account.displayBalance();
        }

        try {
            // Attempting to deposit an invalid amount
            account.deposit(-100.00);
        } catch (InvalidAmountException e) {
            System.err.println("Deposit error: " + e.getMessage());
        } finally {
            // Displaying the balance after failed deposit attempt
            account.displayBalance();
        }
    }

	}

