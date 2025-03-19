 /*
 * 24-59312-3
 * Developing basic Java classes with attributes and methods.
 * LabTask - 1(b)
 */
import java.lang.*;
public class Account {
    private int accountNumber;
    private String accountHolderName;
    private double balance;
    // Default constructor
    public Account(){

    }
    // Set methods
    public void setAccountNumber(int an){
        accountNumber = an;
    }
    public void setAccountHolderName(String ahn){
        accountHolderName = ahn;
    }
    public void setBalance(double b){
        balance = b;
    }
    // Get methods
    public int getAccountNumber(){
        return accountNumber;
    }
    public String getAccountHolderName(){
        return accountHolderName;
    }
    public double getBalance(){
        return balance;
    }
    // Paramitarized constructor
    public Account(int acn,String name,double bal){
        accountNumber = acn;
        accountHolderName = name;
        balance = bal;
    }
    // Show methods
    public void showDetails(){
        System.out.println("Account number: "+accountNumber);
        System.out.println("Name: "+accountHolderName);
        System.out.println("Balance: "+balance);
    }
}
