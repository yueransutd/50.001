
// Question 4
// total: 10 points

//===============================================
// todo: complete the following program
//===============================================

import java.util.Date;

public class Account {
    private int id=0;
    private double balance=0;
    private static double annualInterestRate=0;
    private Date dateCreated;

    Account() {
        this.id=id;
        this.balance=balance;
        this.annualInterestRate=annualInterestRate;
        this.dateCreated=new Date();

    }
    Account(int id, double balance) {
        this.id=id;
        this.balance=balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public static void setAnnualInterestRate(double annualInterestRate) {
        Account.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate() {
        return this.annualInterestRate/12;
    }

    public double getMonthlyInterest() {
        return balance*getMonthlyInterestRate()*0.01;
    }

    public void withdraw(double amt) {
        this.balance-=amt;
    }

    public void deposit(double amt) {
        this.balance+=amt;
    }


}




//===============================================
// test case
//===============================================

/*

public class TestAccount{
  public static void main (String[] args) {
    Account account = new Account(1122, 20000);
    Account.setAnnualInterestRate(4.5);
    
    account.withdraw(2500);
    account.deposit(3000);
    System.out.println("Balance is " + account.getBalance());
    System.out.println("Monthly interest is " +
      account.getMonthlyInterest());
  }	
}

Expected output

Balance is 20500.0
Monthly interest is 76.875

*/

