package Task3;


/**
 * This class allows for the representation of book objects. This
 * class contains an attribute for storing the age range for which
 * a book is most suitable. This attribute is set at construction and can
 * be retrieved or altered by the various methods below. 
 * 
 * @author Richard Crisp
 * @version 1.0
 */
public abstract class Book extends Publication
{
    //a field for holding age range e.g Early Learning, Young-child, pre-teen, teenage, adult.  
    private String ageRange;
    
    /**
     * This is the default constructor method for creating a book object with a single author
     * 
     * @param authorIn the name of the publication's author (as a String)
     * @param nameIn the title of the publication (as a String)
     * @param priceIn the price of purchasing a copy of this publication (as a double)
     * @param origin the nation of origin for this publication (as a String)
     * @param year the year this publication was published (as an int)
     * @param publisher the name of the publisher for this publication (as a String)
     * @param range the ageRange that this book is most suitable for (as a String)
     */
    public Book(String authorIn, String nameIn, double priceIn, String origin, int year, String publisher, String range)
    {
        super(authorIn,nameIn,priceIn,origin,year,publisher);
        
        ageRange = range;
    }
    
    /**
     * This is the default constructor method for creating a book object with two authors
     * 
     * @param authorIn the name of the publication's first author (as a String)
     * @param authorIn2 the name of the publication's second author (as a String)
     * @param nameIn the title of the publication (as a String)
     * @param priceIn the price of purchasing a copy of this publication (as a double)
     * @param origin the nation of origin for this publication (as a String)
     * @param year the year this publication was published (as an int)
     * @param publisher the name of the publisher for this publication (as a String)
     * @param range the ageRange that this book is most suitable for (as a String)
     */
    public Book(String authorIn, String authorIn2, String nameIn, double priceIn, String origin, int year, String publisher, String range)
    {
        super(authorIn,authorIn2,nameIn,priceIn,origin,year,publisher);
        
        ageRange = range;
    }
    
    /**
     * This is the default constructor method for creating a book object with three authors
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
     */
    public Book(String authorIn, String authorIn2, String authorIn3, String nameIn, double priceIn, String origin, int year, String publisher, String range)
    {
        super(authorIn,authorIn2,authorIn3,nameIn,priceIn,origin,year,publisher);
        
        ageRange = range;
    }
    
    /**
     * This is the default constructor method for creating a book object with four authors
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
     */
    public Book(String authorIn, String authorIn2, String authorIn3, String authorIn4, String nameIn, double priceIn, String origin, int year, String publisher, String range)
    {
        super(authorIn,authorIn2,authorIn3,authorIn4,nameIn,priceIn,origin,year,publisher);
        
        ageRange = range;
    }
    
    /**
     * A method for setting the ageRange for a book, e.g. Early Learning, Young-child, pre-teen, teenage, adult.
     * 
     * @param range the age range than the book is most suitable for (as a String)
     */
    public void setAgeRange(String range)
    {
        ageRange = range;   
    }
    
    /**
     * A method for getting the ageRange for a book, e.g. Early Learning, Young-child, pre-teen, teenage, adult.
     * 
     * @return the age range than the book is most suitable for (as a String)
     */
    public String getAgeRange()
    {
        return ageRange;   
    }
}
