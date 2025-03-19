 /*
 * 24-59312-3
 * Developing a basic Java class with attributes, constructors and methods with main
   method in a separated class.
 * LabTask - 2
 */
import java.lang.*;
public class Book{
    private String isbn;
    private String bookTitle;
    private String authorName;
    private double price;
    private int availableQuantity;

    //Default constructor
    public Book(){

    }
    // Set methods
    public void setIsbn(String isbn){
        this.isbn = isbn;
    }
    public void setBookTitle(String bookTitle){
        this.bookTitle = bookTitle;
    }
    public void setAuthorname(String authorName){
        this.authorName = authorName;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setAvaiableQuantity(int availableQuantity){
        this.availableQuantity = availableQuantity;
    }
    // Get methods
    public String getIsbn(){
        return isbn;
    }
    public String getBookTitle(){
        return bookTitle;
    }
    public String getAuthorName(){
        return authorName;
    }
    public double getPrice(){
        return price;
    }
    public int getAvailableQuantity(){
        return availableQuantity;
    }



}