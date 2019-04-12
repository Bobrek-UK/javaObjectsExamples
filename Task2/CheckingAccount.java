package Task2;


/**
 * This class allows for the representation of checking account objects. This
 * class contains an attribute to store the fees that are owed by the account.
 * These attributes are set at construction and can be retrieved or altered by
 * the various methods below.
 * 
 * This class also contains methods for recording the addition of new fees or
 * the application of these fees to the account balance.
 *
 * @author Richard Crisp
 * @version 1.0
 */
public class CheckingAccount extends BankAccount
{
    // instance variables - replace the example below with your own
    private double feesOwed;

    /**
     * Default constructor for a checking account object with no fees
     * 
     * @param number the bank account number (as a String)
     * @param name the name of the account holder (as a String)
     * @param balance the balance of the account (as a double)
     *
     */
    public CheckingAccount(String number, String name, double balance)
    {
        // initialise instance variables
        super(number, name, balance);
        
        feesOwed = 0;
    }
    
     /**
     * Default constructor for a checking account object with initial fees
     * 
     * @param number the bank account number (as a String)
     * @param name the name of the account holder (as a String)
     * @param balance the balance of the account (as a double)
     * @param fees the initial owed fees for the account (as a double)
     *
     */
    public CheckingAccount(String number, String name, double balance, double fees)
    {
        super(number, name, balance);
           
        feesOwed = fees;
    }
        
    /**
     * A method for retrieving the total fees owed for a checking account object
     *
     * @return the total fees owed for the account (as a double)  
     */
    public double getFeesOwed()
    {
       return feesOwed;   
    }
    
    /**
     * A method for adding a new fee to a checking account object.
     *
     * @param feeIn the amount to withdraw from the account (as a double)  
     */
    public void addFee (double feeIn)
    {
        feesOwed = feesOwed + feeIn;
    }
    
    /**
     * A method for applying the fees owed to an account. Once the fees have
     * been withdrawn from the account the fees owed for the account are 
     * cleared.
     *   
     */
    public void applyFees ()
    {
        withdraw(feesOwed);
        feesOwed = 0;
    }
}
