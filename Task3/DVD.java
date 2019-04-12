package Task3;

//import java time package for use of LocalDate class
import java.time.*;

/**
 * This class allows for the representation of DVD objects. This
 * class contains attributes for storing the category of DVD and
 * its legal age rating. These attributes are set at construction 
 * and can be retrieved or altered by the various methods below. 
 * 
 * This class extends publishable and inherits the author attribute.
 * Given that the difference between author and director is small
 * and correlates to the medium through which a publication is made,
 * for DVD objects, the author attribute stores the name of the
 * DIRECTOR of the DVD, in order to reduce memory consumption.
 * This should be considered when designing any user interface for
 * this class.
 *
 * @author Richard Crisp
 * @version 1.0
 */
public class DVD extends Publication
{
    private String category;
    private int ageRating;
    
    /**
     * This is the default constructor method for creating a DVD object with a single director
     * 
     * @param authorIn the name of the DVD's director (as a String)
     * @param nameIn the title of the publication (as a String)
     * @param priceIn the price of purchasing a copy of this publication (as a double)
     * @param origin the nation of origin for this publication (as a String)
     * @param year the year this publication was published (as an int)
     * @param publisher the name of the publisher for this publication (as a String)
     */
    public DVD(String authorIn, String nameIn, double priceIn, String origin, int year, String publisher, String categoryIn, int rating)
    {
        super(authorIn,nameIn,priceIn,origin,year,publisher);
        
        category = categoryIn;
        ageRating = rating;
    }
    
    /**
     * This is the default constructor method for creating a DVD object with two directors
     * 
     * @param authorIn the name of the DVD's first director (as a String)
     * @param authorIn2 the name of the DVD's second director (as a String)
     * @param nameIn the title of the publication (as a String)
     * @param priceIn the price of purchasing a copy of this publication (as a double)
     * @param origin the nation of origin for this publication (as a String)
     * @param year the year this publication was published (as an int)
     * @param publisher the name of the publisher for this publication (as a String)
     */
    public DVD(String authorIn, String authorIn2, String nameIn, double priceIn, String origin, int year, String publisher,  String categoryIn, int rating)
    {
        super(authorIn,authorIn2,nameIn,priceIn,origin,year,publisher);
        
        category = categoryIn;
        ageRating = rating;
    }
    
    /**
     * This is the default constructor method for creating a DVD object with three directors
     * 
     * @param authorIn the name of the DVD's first director (as a String)
     * @param authorIn2 the name of the DVD's second director (as a String)
     * @param authorIn3 the name of the DVD's third director (as a String)
     * @param nameIn the title of the publication (as a String)
     * @param priceIn the price of purchasing a copy of this publication (as a double)
     * @param origin the nation of origin for this publication (as a String)
     * @param year the year this publication was published (as an int)
     * @param publisher the name of the publisher for this publication (as a String)
     */
    public DVD(String authorIn, String authorIn2, String authorIn3, String nameIn, double priceIn, String origin, int year, String publisher, String categoryIn, int rating)
    {
        super(authorIn,authorIn2,authorIn3,nameIn,priceIn,origin,year,publisher);
        
        category = categoryIn;
        ageRating = rating;
    }
    
    /**
     * This is the default constructor method for creating a DVD object with four directors
     * 
     * @param authorIn the name of the DVD's first director (as a String)
     * @param authorIn2 the name of the DVD's second director (as a String)
     * @param authorIn3 the name of the DVD's third director (as a String)
     * @param authorIn4 the name of the DVD's fourth director (as a String)
     * @param nameIn the title of the publication (as a String)
     * @param priceIn the price of purchasing a copy of this publication (as a double)
     * @param origin the nation of origin for this publication (as a String)
     * @param year the year this publication was published (as an int)
     * @param publisher the name of the publisher for this publication (as a String)
     */
    public DVD(String authorIn, String authorIn2, String authorIn3, String authorIn4, String nameIn, double priceIn, String origin, int year, String publisher, String categoryIn, int rating)
    {
        super(authorIn,authorIn2,authorIn3,authorIn4,nameIn,priceIn,origin,year,publisher);
        
        category = categoryIn;
        ageRating = rating;
    }
    
    /**
     * An override method for recording when a DVD has been borrowed, who borrowed it,
     * and when it is due for return. The borrowed date is taken from the local host
     * automatically and the due date is set to one week later.
     * 
     * @param borrowerIDIn the ID of the borrower of a DVD (as a String)
     * @return the due date for returning the borrowed DVD (as a LocalDate)
     */
    @Override
    public LocalDate borrowItem(String borrowerIDIn)
    {
        setBorrowerID(borrowerIDIn);
        setDateBorrowed(LocalDate.now());
        setDateDue(getDateBorrowed().plusWeeks(1));
        return getDateDue();
    }
    
    /**
     * A method for setting the category of a DVD, e.g. comedy, thriller, horror, family.
     * 
     * @param categoryIn the category of a DVD (as a String)
     */
    public void setCategory(String categoryIn)
    {
        category = categoryIn;   
    }
    
    /**
     * A method for getting the category of a DVD, e.g. comedy, thriller, horror, family.
     * 
     * @return the category of a DVD (as a String)
     */
    public String getCategory()
    {
        return category;   
    }
    
    /**
     * A method for setting the legal age rating of a DVD.
     * 
     * @param rating the legal age rating of a DVD (as an int)
     */
    public void setAgeRating(int rating)
    {
        ageRating = rating;
    }
    
    /**
     * A method for getting the legal age rating of a DVD.
     * 
     * @return the legal age rating of a DVD (as an int)
     */
    public int getAgeRating()
    {
        return ageRating;   
    }
}
