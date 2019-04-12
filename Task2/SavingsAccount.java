package Task2;


/**
 * This class allows for the representation of savings account objects. This
 * class contains an attributes to store the interest rate that is applicable
 * to the account. This attribute can be set at construction and can be
 * retrieved or altered by the various methods below.
 * 
 * This class also contains a method for applying interest to the account
 * balance. 
 * 
 * @author Richard Crisp
 * @version 1.0
 */
public class SavingsAccount extends BankAccount
{
    // instance variables - replace the example below with your own
    private double interestRate;
    
    /**
     * Default constructor for a savings account object
     * 
     * @param number the bank account number (as a String)
     * @param name the name of the account holder (as a String)
     * @param balance the balance of the account (as a double)
     * @param rate the rate of interest for the account (as a double)
     *
     */
    public SavingsAccount(String number, String name, double balance, double rate)
    {
        // initialise instance variables
        super (number, name, balance);
        
        interestRate = rate;
        
        if (balance < 0)
        {
            //if a negative balance has been entered at construction
            //reset the balance to 0.
            deposit(-balance);   
            
            System.out.println("WARNING! A negative balance has been entered. This balance has been set to 0.00");
        }
    }

    /**
     * A method for recording a withdrawal of funds from a savings account
     * object. A withdrawal may not occur if it would cause the account
     * balance to become negative.
     *
     * @param withdrawIn the amount to withdraw from the account (as a double)  
     */
    @Override
    public void withdraw(double withdrawIn)
    {
                
        if (getAccountBalance() - withdrawIn >= 0)
        {
           super.withdraw(withdrawIn);
        }
        else
        {
            System.out.println("You do not have enough funds to complete this withdrawal");    
        }
    }
    
    /**
     * A method for setting the interest rate applicable to the account
     *
     * @param rate the % percent rate of interest for this account (as a double)  
     */
    public void setInterestRate(double rate)
    {
        interestRate = rate;    
    }
    
    /**
     * A method for retrieving the interest rate applied to the account
     *
     * @return the current rate of interest for this account (as a double)  
     */
    public double getInterestRate()
    {
        return interestRate;   
    }
    
    /**
     * A method to apply interest to the account. No inputs are required as
     * this method uses the previously established interest rate
     * 
     */
    public void applyInterest()
    {
        deposit(getAccountBalance()*(interestRate/100));
        
    }
}
