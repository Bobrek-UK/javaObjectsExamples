package Task3;


/**
 * This class allows for the representation of magazine objects. This
 * class contains an attribute for storing the content type that a 
 * magazine contains. This attribute is set at construction and can
 * be retrieved or altered by the various methods below. 
 * 
 * @author Richard Crisp
 * @version 1.0
 */
public class Magazine extends Publication
{
    //create an attribute for storing the type of magazine object, e.g: children's, health, sports, hobbyist, etc.
    private String type;
    
    /**
     * This is the default constructor method for creating a magazine object with a single author
     * 
     * @param authorIn the name of the publication's author (as a String)
     * @param nameIn the title of the publication (as a String)
     * @param priceIn the price of purchasing a copy of this publication (as a double)
     * @param origin the nation of origin for this publication (as a String)
     * @param year the year this publication was published (as an int)
     * @param publisher the name of the publisher for this publication (as a String)
     * @param typeIn the content type of the magazine (as a String)
     */
    public Magazine(String authorIn, String nameIn, double priceIn, String origin, int year, String publisher, String typeIn)
    {
        super(authorIn,nameIn,priceIn,origin,year,publisher);
        
        type = typeIn;
    }
    
    /**
     * This is the default constructor method for creating a magazine object with two authors
     * 
     * @param authorIn the name of the publication's first author (as a String)
     * @param authorIn2 the name of the publication's second author (as a String)
     * @param nameIn the title of the publication (as a String)
     * @param priceIn the price of purchasing a copy of this publication (as a double)
     * @param origin the nation of origin for this publication (as a String)
     * @param year the year this publication was published (as an int)
     * @param publisher the name of the publisher for this publication (as a String)
     * @param typeIn the content type of the magazine (as a String)
     */
    public Magazine(String authorIn, String authorIn2, String nameIn, double priceIn, String origin, int year, String publisher, String typeIn)
    {
        super(authorIn,authorIn2,nameIn,priceIn,origin,year,publisher);
        
        type = typeIn;
    }
    
    /**
     * This is the default constructor method for creating a magazine object with three authors
     * 
     * @param authorIn the name of the publication's first author (as a String)
     * @param authorIn2 the name of the publication's second author (as a String)
     * @param authorIn3 the name of the publication's third author (as a String)
     * @param nameIn the title of the publication (as a String)
     * @param priceIn the price of purchasing a copy of this publication (as a double)
     * @param origin the nation of origin for this publication (as a String)
     * @param year the year this publication was published (as an int)
     * @param publisher the name of the publisher for this publication (as a String)
     * @param typeIn the content type of the magazine (as a String)
     */
    public Magazine(String authorIn, String authorIn2, String authorIn3, String nameIn, double priceIn, String origin, int year, String publisher, String typeIn)
    {
        super(authorIn,authorIn2,authorIn3,nameIn,priceIn,origin,year,publisher);
        
        type = typeIn;
    }
    
    /**
     * This is the default constructor method for creating a magazine object with four authors
     * 
     * @param authorIn the name of the publication's author (as a String)
     * @param authorIn2 the name of the publication's second author (as a String)
     * @param authorIn3 the name of the publication's third author (as a String)
     * @param authorIn4 the name of the publication's fourth author (as a String)
     * @param nameIn the title of the publication (as a String)
     * @param priceIn the price of purchasing a copy of this publication (as a double)
     * @param origin the nation of origin for this publication (as a String)
     * @param year the year this publication was published (as an int)
     * @param publisher the name of the publisher for this publication (as a String)
     * @param typeIn the content type of the magazine (as a String)
     */
    public Magazine(String authorIn, String authorIn2, String authorIn3, String authorIn4, String nameIn, double priceIn, String origin, int year, String publisher, String typeIn)
    {
        super(authorIn,authorIn2,authorIn3,authorIn4,nameIn,priceIn,origin,year,publisher);
        
        type = typeIn;
    }
    
    /**
     * A method for setting the content type of a magazine, e.g. children's, health, sports, hobbyist, etc.
     * 
     * @param typeIn the content type of a magazine (as a String)
     */
    public void setType(String typeIn)
    {
        type = typeIn;   
    }
    
    /**
     * A method for getting the content type of a magazine, e.g. children's, health, sports, hobbyist, etc.
     * 
     * @return the content type of a magazine (as a String)
     */
    public String getType()
    {
        return type;   
    }
}
