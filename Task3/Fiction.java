package Task3;


/**
 * This class allows for the representation of fiction objects. This
 * class contains an attribute for storing the genre to which a 
 * fiction book belongs. This attribute is set at construction and can
 * be retrieved or altered by the various methods below. 
 * 
 * @author Richard Crisp
 * @version 1.0
 */
public class Fiction extends Book
{
    //holds a value for the genre to which this fiction object belongs, e.g: fantasy, crime, thriller, romance, mystery. 
    private String genre;
    
    /**
     * This is the default constructor method for creating a fiction object with a single author
     * 
     * @param authorIn the name of the publication's author (as a String)
     * @param nameIn the title of the publication (as a String)
     * @param priceIn the price of purchasing a copy of this publication (as a double)
     * @param origin the nation of origin for this publication (as a String)
     * @param year the year this publication was published (as an int)
     * @param publisher the name of the publisher for this publication (as a String)
     * @param range the ageRange that this book is most suitable for (as a String)
     * @param genreIn the genre to which this fictional book belongs (as a String)
     */
    public Fiction(String authorIn, String nameIn, double priceIn, String origin, int year, String publisher, String range, String genreIn)
    {
        super(authorIn,nameIn,priceIn,origin,year,publisher,range);
        
        genre = genreIn;
    }
    
    /**
     * This is the default constructor method for creating a fiction object with two authors
     * 
     * @param authorIn the name of the publication's first author (as a String)
     * @param authorIn2 the name of the publication's second author (as a String)
     * @param nameIn the title of the publication (as a String)
     * @param priceIn the price of purchasing a copy of this publication (as a double)
     * @param origin the nation of origin for this publication (as a String)
     * @param year the year this publication was published (as an int)
     * @param publisher the name of the publisher for this publication (as a String)
     * @param range the ageRange that this book is most suitable for (as a String)
     * @param genreIn the genre to which this fictional book belongs (as a String)
     */
    public Fiction(String authorIn, String authorIn2, String nameIn, double priceIn, String origin, int year, String publisher, String range, String genreIn)
    {
        super(authorIn,authorIn2,nameIn,priceIn,origin,year,publisher,range);
        
        genre = genreIn;
    }
    
    /**
     * This is the default constructor method for creating a fiction object with three authors
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
     * @param genreIn the genre to which this fictional book belongs (as a String)
     */
    public Fiction(String authorIn, String authorIn2, String authorIn3, String nameIn, double priceIn, String origin, int year, String publisher, String range, String genreIn)
    {
        super(authorIn,authorIn2,authorIn3,nameIn,priceIn,origin,year,publisher,range);
        
        genre = genreIn;
    }
    
    /**
     * This is the default constructor method for creating a fiction object with four authors
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
     * @param genreIn the genre to which this fictional book belongs (as a String)
     */
    public Fiction(String authorIn, String authorIn2, String authorIn3, String authorIn4, String nameIn, double priceIn, String origin, int year, String publisher, String range, String genreIn)
    {
        super(authorIn,authorIn2,authorIn3,authorIn4,nameIn,priceIn,origin,year,publisher,range);
        
        genre = genreIn;
    }
    
    /**
     * A method for setting the genre for a fictional book, e.g. fantasy, crime, thriller, romance, mystery.
     * 
     * @param genreIn the genre that the fictional book fits into (as a String)
     */
    public void setGenre(String genreIn)
    {
        genre = genreIn;   
    }
    
    /**
     * A method for getting the genre for a fictional book, e.g. fantasy, crime, thriller, romance, mystery.
     * 
     * @return the genre that the fictional book fits into (as a String)
     */
    public String getGenre()
    {
       return genre;   
    }
}
