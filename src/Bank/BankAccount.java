package Bank;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BankAccount {


    Date date=new Date();
     private String accountNumber;
     private double balance;
     private List<Transaction> transactionHistory= new ArrayList<Transaction>() ;





    public BankAccount(String accountNumber){

    setAccountNumber(accountNumber);


}
    public void deposit(double balance){
                double depositBalance = getBalance();
                depositBalance+=balance;
                transactionHistory.add(new Transaction(date, "Deposit",depositBalance));
                setBalance(depositBalance);
}
//
    public void withdrawal(double amount) {
        double currentBalance = getBalance();
        if (amount > currentBalance) {
            System.out.println("Error:The balance cannot go below 0");
        } else {
            double newBalance = currentBalance - amount;
            setBalance(newBalance);
            transactionHistory.add(new Transaction(new Date(), "Withdrawal", amount));
        }
    }
    public void displayTransactionHistory(){
    }


    public List<Transaction> getTransactionHistory() {
        return transactionHistory;
    }

    public void setTransactionHistory(List<Transaction> transactionHistory) {
        this.transactionHistory = transactionHistory;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


}
