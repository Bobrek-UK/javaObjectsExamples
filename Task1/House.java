package Task1
;

/**
 * This class allows for the representation of House objects. This class
 * contains an attribute to store whether or not the apartment is a bungalow.
 * These attributes are set at construction and can be retrieved or altered
 * through various methods that can be found below.
 * This class is a child of the Building class and all constructors for this
 * class take values for the parent constructor
 * 
 * @author Richard Crisp
 * 
 * @version 1.0
 */
public class House extends Building
{
    private boolean isBungalow;   
    
    //constructor method for new building with new address
    /**
    * Default constructor method for creating a building object where an
    * address object does not yet exist. 
    * 
    * @param bedrooms the number of bedrooms in the building (as an int)
    * @param bathrooms  the number of bathrooms in the building (as an int)
    * @param descriptionIn  extra information about the building (as a String)
    * @param rent  the monthly required rent for the building (as a double)
    * @param balance  the current rent balance for the building (as a double)
    * @param tenant  the name of the primary tenant (as a String)
    * @param buildingNum the name or number of the building (as a String)
    * @param streetIn the street, road, etc of the building (as a String)
    * @param townIn the town, city, etc of the building (as a String)
    * @param postal the postal code of the building (as a String)
    * @param bungalow is the house a bungalow? (as a boolean)
    */
    public House (int bedrooms, int bathrooms,
                       String descriptionIn, double rent, double balance,
                       String tenant, boolean bungalow, String buildingNum,
                    String streetIn, String townIn, String postal)
    {
       super (bedrooms, bathrooms, descriptionIn, rent, balance, tenant,
              buildingNum, streetIn, townIn, postal); 
       isBungalow = bungalow;
    
    }
    
    //constructor method for new building with pre-existing address
     /**
    * Default constructor method for creating a building object where an
    * appropriate address object already exists. 
    * 
    * @param bedrooms the number of bedrooms in the building (as an int)
    * @param bathrooms  the number of bathrooms in the building (as an int)
    * @param descriptionIn  extra information about the building (as a String)
    * @param rent  the monthly required rent for the building (as a double)
    * @param balance  the current rent balance for the building (as a double)
    * @param tenant  the name of the primary tenant (as a String)
    * @param add the address object related to the building (as an Address)
    * @param bungalow is the house a bungalow (as a boolean)
    */
    public House (int bedrooms, int bathrooms,
                       String descriptionIn, double rent, double balance,
                       String tenant, boolean bungalow, Address add)
    {
       super (bedrooms, bathrooms, descriptionIn, rent, balance, tenant, add); 
       isBungalow = bungalow;
    
    }
    
    /**
     * Set whether this house is a bungalow or not
     * 
     * @param bunaglow is this house a bungalow? (as a boolean)
     */
    public void setIsBungalow (boolean bungalow)
    {
       isBungalow = bungalow;   
    }
    
    /**
     * Get whether this house is a bungalow or not
     * 
     * @return bunaglow is this house a bungalow? (as a boolean)
     */
    public boolean getIsBungalow ()
    {
       return isBungalow;   
    }
}

