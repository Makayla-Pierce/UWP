    import java.util.Scanner;
    import java.util.*;
    import java.io.*;
    /**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Makayla Pierce)
 * @version (01-15-17)
 */
class Book
{
    // The fields.
    
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private int borrowed;
    private boolean courseText;
    
    Scanner in = new Scanner(System.in);

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, String refNumber)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = refNumber;
    }

    public void setRefNumber(String ref)
    {
        int refLength = refNumber.length();
        if (refLength < 3){
            refNumber = in.nextLine();
        }
        else{
            System.out.println("Error: Reference Number is too short.");
        }
    }
     
    public void setBorrow (int borrow)
    {
        int borrowed = 0;
        borrowed++;
    }
    // Add the methods here ...
    
    /**
     * Return the author of the book.
     */
    public String getAuthor()
    {
        return author;
    }
    
    /**
     * Return the title of the book.
     */
    public String getTitle()
    {
        return title;
    }
    
    /**
     * Return the number of pages of the book.
     */
    public int getPages()
    {
        return pages;
    }
            
    /**
     * Return the details of the book.
     */
    public void printDetails()
    {
        if (refNumber.length() ==0){
         System.out.println("Title: " + title + ", Author: " + author + 
         ", Pages: " + pages + ", Reference Number: " + refNumber + ", Reference Number: " 
         + refNumber + ", Borrowed: " + borrowed);
        }
       else {
        System.out.println("zzz");
      }
    }
    
    /**
     * Return the details of the book.
     */
    public String getRefNumber()
    {
        return refNumber;
    }
    
        /**
     * Return the number of times the book has been borrowed.
     */
    public int getBorrowed()
    {
        return borrowed;
    }
    
            /**
     * Return if the book is being used as a text book for a course.
     */
    public boolean isCourseText()
    {
        return courseText;
    }
}
