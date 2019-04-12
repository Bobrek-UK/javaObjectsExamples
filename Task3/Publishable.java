package Task3;

/**
 * Publishable Interface Class
 * 
 * Note: This Class is required for Assignment Task 3.
 * 
 * @author Robert Stanley
 * @version 1.0
 */
public interface Publishable
{
      /**
      * Set a publication's title
      * 
      * @param nameIn  The name of a publication
      */
     public void setTitle(String titleIn);
     
     
     
      /**
      * Set a publication's price
      * 
      * @param priceIn  The price of a publication
      */
     public void setPrice(double priceIn);

    
     /**
     * Get a publication's title
     * 
     * @ return The publication title
     */
     public String getTitle(); 
    
     
    
     /**
     * Get a publication's price
     * 
     * @return The price of a publication
     */
     public double getPrice();
     
}