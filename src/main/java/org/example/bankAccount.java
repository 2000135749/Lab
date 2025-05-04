package org.example;

public class bankAccount {
    private String accountNumber;
    private double balance;
    //constructor
    public bankAccount(String accountNumber){
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }
    //getter for accountNumber
    public String getAccountNumber() {
        return accountNumber;
    }
    //setter for accountNumber
    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }
    //Getter for balance

    public double getBalance() {
        return balance;
    }
    //deposit method
    public void deposit(double amount){
        if (amount>0){
            balance += amount;
        }
        else {
            System.out.println("Deposit amount must be positive");
        }
    }
    //Withdraw method
    public void  withdraw(double amount){
        if (amount>balance){
            System.out.println("Insufficient funds");
        } else if (amount<= 0) {
            System.out.println("Withdrawal amount must be positive");
        }
        else{
            balance -= amount;
        }
    }
}
