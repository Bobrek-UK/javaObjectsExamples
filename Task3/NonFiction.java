package Task3;


/**
 * This class allows for the representation of non-fiction objects. This
 * class contains an attribute for storing the field of study that the
 * non-fiction book covers. This attribute is set at construction and can
 * be retrieved or altered by the various methods below. 
 * 
 * @author Richard Crisp
 * @version 1.0
 */
public class NonFiction extends Book
{
    //holds a value for the field of study that this non-fiction object covers, e.g: history, mathematics, construction, philosophy, gardening. 
    private String field;
    
    /**
     * This is the default constructor method for creating a non fiction object with a single author
     * 
     * @param authorIn the name of the publication's author (as a String)
     * @param nameIn the title of the publication (as a String)
     * @param priceIn the price of purchasing a copy of this publication (as a double)
     * @param origin the nation of origin for this publication (as a String)
     * @param year the year this publication was published (as an int)
     * @param publisher the name of the publisher for this publication (as a String)
     * @param range the ageRange that this book is most suitable for (as a String)
     * @param fieldIn the field of study that this non fictional book covers (as a String)
     */
    public NonFiction(String authorIn, String nameIn, double priceIn, String origin, int year, String publisher, String range, String fieldIn)
    {
        super(authorIn,nameIn,priceIn,origin,year,publisher,range);
        
        field = fieldIn;
    }
    
    /**
     * This is the default constructor method for creating a non fiction object with two authors
     * 
     * @param authorIn the name of the publication's first author (as a String)
     * @param authorIn2 the name of the publication's second author (as a String)
     * @param nameIn the title of the publication (as a String)
     * @param priceIn the price of purchasing a copy of this publication (as a double)
     * @param origin the nation of origin for this publication (as a String)
     * @param year the year this publication was published (as an int)
     * @param publisher the name of the publisher for this publication (as a String)
     * @param range the ageRange that this book is most suitable for (as a String)
     * @param fieldIn the field of study that this non fictional book covers (as a String)
     */
    public NonFiction(String authorIn, String authorIn2, String nameIn, double priceIn, String origin, int year, String publisher, String range, String fieldIn)
    {
        super(authorIn,authorIn2,nameIn,priceIn,origin,year,publisher,range);
        
        field = fieldIn;
    }
    
    /**
     * This is the default constructor method for creating a non fiction object with three authors
     * 
     * @param authorIn the name of the publication's first author (as a String)
     * @param authorIn2 the name of the publication's second author (as a String)
     * @param authorIn3 the name of the publication's third author (as a String)
     * @param nameIn the title of the publication (as a String)
     * @param priceIn the price of purchasing a copy of this publication (as a double)
     * @param origin the nation of origin for this publication (as a String)
     * @param year the year this publication was published (as an int)
     * @param publisher the name of the publisher for this publication (as a String)
     * @param range the ageRange that this book is most suitable for (as a String)
     * @param fieldIn the field of study that this non fictional book covers (as a String)
     */
    public NonFiction(String authorIn, String authorIn2, String authorIn3, String nameIn, double priceIn, String origin, int year, String publisher, String range, String fieldIn)
    {
        super(authorIn,authorIn2,authorIn3,nameIn,priceIn,origin,year,publisher,range);
        
        field = fieldIn;
    }
    
    /**
     * This is the default constructor method for creating a non fiction object with four authors
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
     * @param range the ageRange that this book is most suitable for (as a String)
     * @param fieldIn the field of study that this non fictional book covers (as a String)
     */
    public NonFiction(String authorIn, String authorIn2, String authorIn3, String authorIn4, String nameIn, double priceIn, String origin, int year, String publisher, String range, String fieldIn)
    {
        super(authorIn,authorIn2,authorIn3,authorIn4,nameIn,priceIn,origin,year,publisher,range);
        
        field = fieldIn;
    }
    
    /**
     * A method for setting the field of study for a non-fiction book, e.g. history, mathematics, construction, philosophy, gardening.
     * 
     * @param fieldIn the field of study that this non-fiction book covers (as a String)
     */
    public void setField(String fieldIn)
    {
        field = fieldIn;   
    }
    
    /**
     * A method for getting the field of study for a non-fiction book, e.g. history, mathematics, construction, philosophy, gardening.
     * 
     * @return fieldIn the field of study that this non-fiction book covers (as a String)
     */
    public String getField()
    {
        return field;   
    }
}
