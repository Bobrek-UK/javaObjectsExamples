package Task3;

//import java utilties package for use of ArrayList class
import java.util.*;
//import java time package for use of LocalDate class
import java.time.*;


/**
 * This class allows for the representation of publishable objects. This
 * class contains attributes for storing one or more author names (as an ArrayList),
 * the title of the publication, the price of ordering the publication, the nation
 * of origin for the publication, the year that the publication was published,
 * the name of the publisher.  These attributes are set at construction and can
 * be retrieved or altered by the various methods below. 
 * 
 * This class also contains attributes for storing for the name of a current borrower,
 * the date that the publication was borrowed and the date that the publication is due
 * to be returned. These attributes can be retrieved or altered by the various methods
 * below.
 *
 * @author Richard Crisp
 * @version 1.0
 */
public abstract class Publication implements Publishable
{
    // instance variables - replace the example below with your own
    private ArrayList authors = new ArrayList(4);
    private String title;
    private double price;
    private String nationalOrigin;
    private int yearPublished;
    private String publisherName;
    private String borrowerID;
    private LocalDate dateBorrowed;
    private LocalDate dateDue;
    
    
    /**
     * This is the default constructor method for creating a publishable object with a single author
     * 
     * @param authorIn the name of the publication's author (as a String)
     * @param nameIn the title of the publication (as a String)
     * @param priceIn the price of purchasing a copy of this publication (as a double)
     * @param origin the nation of origin for this publication (as a String)
     * @param year the year this publication was published (as an int)
     * @param publisher the name of the publisher for this publication (as a String)
     */
    public Publication(String authorIn, String nameIn, double priceIn, String origin, int year, String publisher)
    {
        authors.add(authorIn);
        
        //reduces the size of the array to the minimum required to save space
        authors.trimToSize();
        price = priceIn;
        title = nameIn;
        nationalOrigin = origin;
        yearPublished = year;
        publisherName = publisher;
    }
    
    /**
     * This is the default constructor method for creating a publishable object with two authors
     * 
     * @param authorIn the name of the publication's first author (as a String)
     * @param authorIn2 the name of the publication's second author (as a String)
     * @param nameIn the title of the publication (as a String)
     * @param priceIn the price of purchasing a copy of this publication (as a double)
     * @param origin the nation of origin for this publication (as a String)
     * @param year the year this publication was published (as an int)
     * @param publisher the name of the publisher for this publication (as a String)
     */
    public Publication(String authorIn, String authorIn2, String nameIn, double priceIn,
                        String origin, int year, String publisher)
    {
        authors.add(authorIn);
        authors.add(authorIn2);
        authors.trimToSize();
        price = priceIn;
        title = nameIn;
        nationalOrigin = origin;
        yearPublished = year;
        publisherName = publisher;
    }
    
    /**
     * This is the default constructor method for creating a publishable object with three authors
     * 
     * @param authorIn the name of the publication's first author (as a String)
     * @param authorIn2 the name of the publication's second author (as a String)
     * @param authorIn3 the name of the publication's third author (as a String)
     * @param nameIn the title of the publication (as a String)
     * @param priceIn the price of purchasing a copy of this publication (as a double)
     * @param origin the nation of origin for this publication (as a String)
     * @param year the year this publication was published (as an int)
     * @param publisher the name of the publisher for this publication (as a String)
     */
     public Publication(String authorIn, String authorIn2, String authorIn3, String nameIn, 
                        double priceIn, String origin, int year, String publisher)
    {
        authors.add(authorIn);
        authors.add(authorIn2);
        authors.add(authorIn3);
        authors.trimToSize();
        price = priceIn;
        title = nameIn;
        nationalOrigin = origin;
        yearPublished = year;
        publisherName = publisher;
    }
    
    /**
     * This is the default constructor method for creating a publishable object with four authors
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
     */
     public Publication(String authorIn, String authorIn2, String authorIn3, String authorIn4,
                        String nameIn, double priceIn, String origin, int year, String publisher)
    {
        authors.add(authorIn);
        authors.add(authorIn2);
        authors.add(authorIn3);
        authors.add(authorIn4);
        authors.trimToSize();
        price = priceIn;
        title = nameIn;
        nationalOrigin = origin;
        yearPublished = year;
        publisherName = publisher;
    }
    
    /**
     * A method for setting the name of a single author of a publication
     * 
     * @param authorIn the name of the publication's author (as a String)
     */
      
    public void setAuthor(String authorIn)
    {
        //clears all of the current authors from the array list so that the new
        //authors can be added.
        authors.clear();
        
        authors.add(authorIn);
        
        authors.trimToSize();
        
    }
    
    /**
     * A method for setting the names of two authors of a publication
     * 
     * @param authorIn the name of the publication's author (as a String)
     * @param authorIn2 the name of the publication's second author (as a String)
     */
    
    public void setAuthor(String authorIn, String authorIn2)
    {
        //clears all of the current authors from the array list so that the new
        //authors can be added.
        authors.clear();
        
        authors.add(authorIn);
        authors.add(authorIn2);
        
        authors.trimToSize();
        
    }
    
    /**
     * A method for setting the names of three authors of a publication
     * 
     * @param authorIn the name of the publication's author (as a String)
     * @param authorIn2 the name of the publication's second author (as a String)
     * @param authorIn3 the name of the publication's third author (as a String)
     */
    
    public void setAuthor(String authorIn, String authorIn2, String authorIn3)
    {
        //clears all of the current authors from the array list so that the new
        //authors can be added.
        authors.clear();
        
        authors.add(authorIn);
        authors.add(authorIn2);
        authors.add(authorIn3);
        
        authors.trimToSize();
        
    }
    
    /**
     * A method for setting the names of four authors of a publication 
     * 
     * @param authorIn the name of the publication's author (as a String)
     * @param authorIn2 the name of the publication's second author (as a String)
     * @param authorIn3 the name of the publication's third author (as a String)
     * @param authorIn4 the name of the publication's fourth author (as a String)
     */
    
    public void setAuthor(String authorIn, String authorIn2, String authorIn3, String authorIn4)
    {
        //clears all of the current authors from the array list so that the new
        //authors can be added.
        authors.clear();
        
        authors.add(authorIn);
        authors.add(authorIn2);
        authors.add(authorIn3);
        authors.add(authorIn4);
        
        authors.trimToSize();
        
    }
    
    /**
     * A method for returning a list of authors for a publication
     * 
     * @return a list of author names (as an ArrayList)
     */
    public ArrayList getAuthor()
    {
        return authors;
    }
    
    /**
     * A method for adding an additional author to a pre-existing list.
     * --- IMPORTANT --- THIS METHOD ALLOWS FOR MORE THAN FOUR AUTHORS 
     * TO BE ALLOCATED TO A SINGLE PUBLISHABLE OBJECT FOLLOWING
     * CONSTRUCTION, AND IS THE ONLY WAY TO RECORD FIVE AUTHORS OR MORE
     * FOR A GIVEN PUBLICATION
     * 
     * @param authorIn the name of a publication's author (as a String)
     */
    public void addAuthor(String authorIn)
    {
        authors.add(authorIn);
        authors.trimToSize();
    }
    
    /**
     * A method for removing an author from a pre-existing list
     * 
     * @param listPosition the list position of the author to be removed (as an int)
     */
    public void removeAuthor(int listPosition)
    {
        authors.remove(listPosition);
        authors.trimToSize();
    }
    
    /**
    * A method for setting the title of a publication
    * 
    * @param nameIn The title of a publication (as a String)
    */
    public void setTitle(String nameIn)
    {
        title = nameIn;
    }
     
    /**
     * A method for setting the purchase price of a publication
     * 
     * @param priceIn The price of a publication (as a double)
     */
    public void setPrice(double priceIn)
    {
        price = priceIn;
    }

    
    /**
    * A method for returning the title of a publication
    * 
    * @ return The publication title (as a String)
    */
    public String getTitle()
    {
         return title;
    }
    
     
    /**
    * A method for returning the purchase price of a publication
    * 
    * @return The price of a publication (as a double)
    */
    public double getPrice()
    {
        return price;   
    }
    
    /**
     * A method for setting the nation of origin for a publication
     * 
     * @param origin the nation of origin (as a String)
     */
    public void setNationalOrigin(String origin)
    {
        nationalOrigin = origin;
    }
    
    /**
     * A method for returning the national origin of a publication
     * 
     * @return the nation of origin (as a String)
     */
    public String getNationalOrigin()
    {
        return nationalOrigin;   
    }
    
    /**
     * A method for setting the year that a publication was published
     * 
     * @param year The year of publication (as an int)
     */
    public void setYearPublished(int year)
    {
        yearPublished = year;
    }
    
    /**
     * A method for returning the year a publication was published
     * 
     * @return the year of publication (as an int)
     */
    public int getYearPublished()
    {
        return yearPublished;   
    }
    
    /**
     * A method for setting the name of the publisher of a publication
     * 
     * @param publisher The publisher name (as a String)
     */
    public void setPublisherName(String publisher)
    {
        publisherName = publisher;
    }
    
    /**
     * A method for returning the name of the publisher for a publication
     * 
     * @return the name of the publisher (as a String)
     */
    public String getPublisherName()
    {
        return publisherName;   
    }
    
    /**
     * A method for setting the ID of the borrower of a publication
     * 
     * @param borrowerIDIn The borrower's ID (as a String)
     */
    public void setBorrowerID(String borrowerIDIn)
    {
        borrowerID = borrowerIDIn;
    }
    
    /**
     * A method for setting the date that a publication was borrowed
     * 
     * @param dateBorrowedIn The date a publication was borrowed (as a LocalDate)
     */
    public void setDateBorrowed(LocalDate dateBorrowedIn)
    {
        dateBorrowed = dateBorrowedIn;
    }
    
    /**
     * A method for setting the date that a publication is due for return
     * 
     * @param dateDueIn The date a publication is due for return (as a LocalDate)
     */
    public void setDateDue(LocalDate dateDueIn)
    {
        dateDue = dateDueIn;   
    }
    
    /**
     * A method for returning the ID of the person borrowing a publication
     * 
     * @return the borrower ID (as a String)
     */
    public String getBorrowerID()
    {
        return borrowerID;
    }
    
    /**
    * A method for returning the date a publication was borrowed
    * 
    * @return The date a publication was borrowed (as a LocalDate)
    */
    public LocalDate getDateBorrowed()
    {
        return dateBorrowed;
    }
    
    /**
    * A method for returning the date a publication is due to be returned
    * 
    * @return The due date for a borrowed publication (as a LocalDate)
    */
    public LocalDate getDateDue()
    {
        return dateDue;   
    }
    
    /**
     * A method for recording when a publication has been borrowed, who borrowed it,
     * and when it is due for return. The borrowed date is taken from the local host
     * automatically and the due date is set to three weeks later.
     * 
     * @param borrowerIDIn the ID of the borrower of a publication (as a String)
     * @return the due date for returning the borrowed publication (as a LocalDate)
     */
    public LocalDate borrowItem(String borrowerIDIn)
    {
        borrowerID = borrowerIDIn;
        dateBorrowed = LocalDate.now();
        dateDue = dateBorrowed.plusWeeks(3);
        return dateDue;
    }
    
    /**
     * A method for recording when a publication has been returned. All borrower 
     * information is cleared and the atrributes for the ID of a borrower, the
     * date a publication was borrowed and the date it is due for return set to
     * null values.
     */
    public void returnItem()
    {
        borrowerID = null;
        dateBorrowed = null;
        dateDue = null;
    }
}
