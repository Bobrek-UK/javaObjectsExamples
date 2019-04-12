
package Task1;

/**
 * This class allows for the representation of address objects. This class
 * contains attributes to store the building number or name, the street, the
 * town and the post code. These attributes are set at construction and can
 * be retrieved or altered through various methods that can be found below
 * 
 * @author Richard Crisp
 * 
 * @version 1.0
 */
public class Address
{
   //building number may include characters due to building divisions,
   //e.g. 1a, 1b. so take house number or name as a combined String
   private String buildingNumberName;
   private String street;
   private String town;
   private String postCode;
   
   //constructor method for new address
   /**
    * Default constructor method for creating an Address object
    * 
    * Inputs are required for each class attribute, building number or name,
    * street, town and postcode. 
    * 
    * @param buildingNum  the street number or name (as a String)
    * @param streetIn  the street, road, close, etc (as a String)
    * @param townIn  the town, city, village, etc (as a String)
    * @param postal  the postal code of this address (as a String)
    */
   public Address (String buildingNum, String streetIn, String townIn, 
                    String postal)
   {
       buildingNumberName = buildingNum;
       street = streetIn;
       town = townIn;
       postCode = postal;
      
   }
   
   /**
    * Set the building number or name for this address object
    * 
    * @param buildingNum the street number or name (as a String)
    */
   public void setBuildingNum (String buildingNum)
   {
       buildingNumberName = buildingNum;
   }
   
   /**
    * Get the building number or name from this address object
    * 
    * @return  the street number or name (as a String)
    */
   public String getBuildingNum()
   {
      return buildingNumberName;
   }
   
    /**
    * Set the street for this address object
    * 
    * @param streetIn the street, road, close, etc (as a String)
    */
   public void setStreet (String streetIn)
   {
       street = streetIn;
   }
   
   /**
    * Get the street from this address object
    * 
    * @return  the street, road, close, etc (as a String)
    */
   public String getStreet()
   {
      return street;
   }
   
    /**
    * Set the town for this address object
    * 
    * @param townIn the town, city, village, etc (as a String)
    */
   public void setTown (String townIn )
   {
       town = townIn;
   }
   
   /**
    * Get the town from this address object
    * 
    * @return  the town, village, city, etc (as a String)
    */
   public String getTown()
   {
      return town;
   }
   
    /**
    * Set the post code for this address object
    * 
    * @param postal the postal code for this address (as a String)
    */
   public void setPostCode (String postal)
   {
       postCode = postal;
   }
   
   /**
    * Get the post code from this address object
    * 
    * @return  the postal code for this address (as a String)
    */
   public String getPostCode()
   {
      return postCode;
   }
  
}
