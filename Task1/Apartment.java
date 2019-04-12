package Task1
;

/**
 * This class allows for the representation of apartment objects. This class
 * contains attributes to store the apartment identifier and whether or not
 * the apartment is on the ground floor. These attributes are set at 
 * construction and can be retrieved or altered through various methods
 * that can be found below.
 * This class is a child of the Building class and all constructors for this
 * class take values for the parent constructor
 * 
 * @author Richard Crisp
 * 
 * @version 1.0
 */
public class Apartment extends Building
{
   private String apartIdentifier;
   private boolean isGroundFloor;
   
   //constructor method for new aparment with new address
   /**
    * Default constructor method for creating an apartment object where an
    * address object does not yet exist. ---Important --- This constructor
    * should only be used when an address contains one and ONLY one apartment.
    * For an address that contains multiple appartments, the address object
    * should be constructed first using the constructor method found in the 
    * Address class, and the apartment objects created using the other
    * constructor for this class, which can be found below ---Important--- 
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
    * @param identifier the aparment identifer; e.g., flat 3 (as a String)
    * @param groundFloor is the apartment on the ground floor (as a boolean)
    */
   public Apartment (int bedrooms, int bathrooms,
                     String descriptionIn, double rent, double balance, 
                     String tenant, String identifier, boolean groundFloor,
                     String buildingNum, String streetIn, String townIn,
                     String postal)
   {
       super (bedrooms, bathrooms, descriptionIn, rent, balance, tenant,
              buildingNum, streetIn, townIn, postal);
       apartIdentifier = identifier;
       isGroundFloor = groundFloor;
       
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
    * @param identifier the aparment identifer; e.g., flat 3 (as a String)
    * @param groundFloor is the apartment on the ground floor (as a boolean)
    * @param add the address object related to the building (as an Address)
    */
   public Apartment (int bedrooms, int bathrooms,
                     String descriptionIn, double rent, double balance, 
                     String tenant, String identifier, boolean groundFloor,
                     Address add)
   {
       super (bedrooms, bathrooms, descriptionIn, rent, balance, tenant,
              add);
       apartIdentifier = identifier;
       isGroundFloor = groundFloor;
       
   }
   
   /**
    * Set the apartment identifier for this aparment
    * 
    * @param identifier the apartment identifier (as a String)
    */
   public void setApartIdentifier(String identifier)
   {
       apartIdentifier = identifier;
   }
   
   /**
    * Get the apartment identifier for this apartment
    * 
    * @param return the apartment identifier (as a String)
    */
   public String getApartIdentifier()
   {
       return apartIdentifier;
   }
   
   /**
    * Set whether this apartment is ground floor or not
    * 
    * @param groundFloor is the apartment ground floor? (as a boolean)
    */
      public void setIsGroundFloor(boolean groundFloor)
   {
       isGroundFloor = groundFloor;
   }
   
   /**
    * Get whether this apartment is ground floor or not
    * 
    * @return is the apartment ground floor? (as a boolean)
    */
   public boolean getIsGroundFloor()
   {
       return isGroundFloor;
   }
}
