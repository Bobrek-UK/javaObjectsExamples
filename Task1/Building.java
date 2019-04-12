package Task1;

/**
 * This class allows for the representation of building objects. This class is
 * an abstract superclass that needs an appropriate subclass for construction.
 * This class holds attributes for holding details regarding a buildings number
 * of bedrooms, number of bathrooms, a brief description of the building (for
 * example; "has garden and driveway" or "no central heating, maisonette"),
 * the required monthly rent for the property, the current rental balance
 * (whether the property tenant is in credit or arrears), the name of the
 * current tenant and for holding details of a related address object.
 * 
 * @author Richard Crisp
 * 
 * @version 1.0
 */
abstract class Building
{
    private int numberBedrooms;
    private int numberBathrooms;
    private String description;
    private double monthlyRent;
    private double rentBalance;
    private String tenantName;
    private Address address;
   
    
   //constructor method for creating a building and a new address at once
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
    */
   public Building (int bedrooms, int bathrooms,
                    String descriptionIn, double rent,
                    double balance, String tenant, String buildingNum,
                    String streetIn, String townIn, String postal)
   {
       numberBedrooms = bedrooms;
       numberBathrooms = bathrooms;
       description = descriptionIn;
       monthlyRent = rent;
       rentBalance = balance;
       tenantName = tenant;
       address = new Address(buildingNum,streetIn,townIn, 
                    postal);
   }
   
    //constructor method for creating a building for a prexisting address
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
    */
   public Building (int bedrooms, int bathrooms,
                    String descriptionIn, double rent,
                    double balance, String tenant, Address add)
   {
       numberBedrooms = bedrooms;
       numberBathrooms = bathrooms;
       description = descriptionIn;
       monthlyRent = rent;
       rentBalance = balance;
       tenantName = tenant;
       address = add;
      
   }
   
   /**
    * Set description information for a building object
    * 
    * @param descriptionIn extra information about the building (as a String)
    */
    public void setDescription(String descriptionIn)
   {
      description = descriptionIn;
   }
   
   /**
    * Get description information from a building object
    * 
    * @return description information (as a String)
    */
   public String getDescription()
   {
      return description;
   }
   
   /**
    * Set number of bedrooms for a building object
    * 
    * @param bedrooms the number of bedrooms in the building (as an int)
    */
   public void setNumberBedrooms(int bedrooms)
   {
      numberBedrooms = bedrooms; 
   }
   
   /**
    * Get the number of bedrooms from a building object
    * 
    * @return number of bedrooms (as an int)
    */
   public int getNumberBedrooms ()
   {
      return numberBedrooms; 
   }
   
   /**
    * Set number of bathrooms for a building object
    * 
    * @param bathrooms the number of bathrooms in the building (as an int)
    */
   public void setNumberBathroms(int bathrooms)
   {
      numberBathrooms = bathrooms;
   }
   
   /**
    * Get number of bathrooms from a building object
    * 
    * @return number of bathrooms (as an int)
    */
   public int getNumberBathrooms()
   {
      return numberBathrooms;
   } 
   
   /**
    * Set the required monthly rent for a building object
    * 
    * @param rent the required monthly rent for the building (as a double)
    */
   public void setMonthlyRent(double rent)
   {
       monthlyRent = rent;
   }
   
   /**
    * Get the required monthly rent from a building object
    * 
    * @return the required monthly rent (as a double)
    */
   public double getMonthlyRent()
   {
      return monthlyRent;
   }
   
   /**
    * Set the rent balance for a building object
    * 
    * @param balance the current rent balance for the building (as a double)
    */
   public void setRentBalance(double balance)
   {
      rentBalance = balance;  
   }
   
   /**
    * Get the current rent balance from a building object
    * 
    * @return the current rent balance (as a double)
    */
   public double getRentBalance()
   {
      return rentBalance;
   }
   
   /**
    * Set the primary tenant for a building object
    * 
    * @param tenant the name of the building's primary tenant (as a String)
    */
    public void setTenantName(String tenant)
   {
       tenantName = tenant;
   }
 
   /**
    * Get the primary tenant name from a building object
    * 
    * @return the primary tenant name (as a String)
    */
   public String getTenantName()
   {
       return tenantName;
   }
   
}
