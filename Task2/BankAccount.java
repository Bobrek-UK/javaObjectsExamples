package Task2;


/**
 * This class allows for the representation of bank account objects. This
 * class contains attributes to store an account number, the customer's name
 * and the account's balance. These attributes are set at construction and can
 * be retrieved or altered by the various methods below.
 * 
 * This class also contains methods for recording a deposit or withdrawal of
 * funds.
 *
 * @author Richard Crisp
 * @version 1.0
 */
public abstract class BankAccount
{
    // instance variables - replace the example below with your own
    private String accountNumber;
    private String customerName;
    private double accountBalance;

    /**
     * Default constructor for a bank account object
     * 
     * @param number the bank account number (as a String)
     * @param name the name of the account holder (as a String)
     * @param balance the balance of the account (as a double)
     */
    public BankAccount(String number, String name, double balance)
    {
        accountNumber = number;
        customerName = name;
        accountBalance = balance;
        
    }
       
    /**
     * A method for returning the account number of this account
     *
     * @return the account number for this account (as a String)  
     */
    public String getAccountNumber()
    {
        return accountNumber;
    }
    
    /**
     * A method for setting the name of the account holder
     *
     * @param name the name of the account holder (as a String)  
     */
    public void setCustomerName (String name)
    {
        customerName = name;
    }
    
    /**
     * A method for returning the name of the account holder
     *
     * @return name of the account holder (as a String)  
     */
    public String getCustomerName()
    {
        return customerName;
    }
    
    /**
     * A method for returning the account number of this account
     *
     * @return the account number for this account (as a String)  
     */
    public double getAccountBalance()
    {
        return accountBalance;
    }
    
    /**
     * A method for applying a withdrawal of funds to an account
     *
     * @param withdrawIn the amount being withdrawn (as a double)  
     */
    public void withdraw(double withdrawIn)
    {
        accountBalance = ((accountBalance - withdrawIn)*100)/100;
    }
    
    /**
     * A method for applying a deposit of funds to an account
     *
     * @param depositIn the amount being deposited (as a double)  
     */
    public void deposit(double depositIn)
    {
        accountBalance = ((accountBalance + depositIn)*100)/100;
    }
}
