/*
Chapter 9 Assignment 1
Sean Coyne
*/

import java.util.Date;

class Account{

    //A private int data field named id for the account (default 0).
    private int id = 0;
    //A private double data field named balance for the account (default 0).
    private double balance = 0.0;
    //A private double data field named annualInterestRate that stores the current interest rate (default 0).
    //Assume all accounts have the same interest rate.
    private static double annualInterestRate = 0.0;
    //A private Date data field named dateCreated that stores the date when the account was created.
    private java.util.Date dateCreated;

    //A no-arg constructor that creates a default account.
    public Account() {
        dateCreated = new java.util.Date();
    }

    //A constructor that creates an account with the specified id and initial balance.
    public Account(int newId, double newBalance){
        this();
        setID(newId);
        setBalance(newBalance);
    }

    //The accessor and mutator methods for id, balance, and annualInterestRate.
    public int getID(){
        return id;
    }

    public void setID(int newId){
        id=newId;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double newBalance){
        balance=newBalance;
    }

    public double getAnnualInterestRate(){
        return annualInterestRate;
    }

    //Assume all accounts have the same interest rate.
    public static void setAnnualInterestRate(double newAnnualInterestRate){
        annualInterestRate=newAnnualInterestRate;
    }

    //The accessor method for dateCreated.
    public Date getDateCreated(){
        return dateCreated;
    }

    //A method named getMonthlyInterestRate() that returns the monthly interest rate.
    private double getMonthlyInterestRate() {
        return (getAnnualInterestRate()/12.00);
    }

    //This wasn't in the project assignment, but is used in the test, so adding it in
    public double getMonthlyInterest(){
        double monthlyRate = getMonthlyInterestRate();
        return balance * monthlyRate;
    }

    //A method named withdraw that withdraws a specified amount from the account.
    public double withdraw(double withdrawAmount){
        return balance -= withdrawAmount;
    }

    //A method named deposit that deposits a specified amount to the account.
    public double deposit(double depositAmount){
        return balance += depositAmount;
    }
}

 class Test {
    public static void main (String[] args) {
        Account account = new Account(1123, 100);
        Account.setAnnualInterestRate(4.5);

        account.withdraw(4500);
        account.deposit(3000);
        System.out.println("Balance is " + account.getBalance());
        System.out.println("Monthly interest is " +
                account.getMonthlyInterest());
        System.out.println("This account was created at " +
                account.getDateCreated());
    }
}
