/*
 * Developing a basic Java program with Inheritance.
 * Lab task 5
 */
public class Book{
    private String isbn;
    private String bookTitle;
    private String authorName;
    private double price;
    private int availableQuantity;

    public Book(){
        
    }
    public Book(String isbn, String bookTitle, String authorName, double price, int availableQuantity){
        this.isbn = isbn;
        this.bookTitle = bookTitle;
        this.authorName = authorName;
        this.price = price;
        this.availableQuantity = availableQuantity;
    }
    public void setIsbn(String isbn){
        this.isbn = isbn;
    }
    public void setBookTitle(String bookTitle){
        this.bookTitle = bookTitle;
    }
    public void setAuthorName(String authorName){
        this.authorName = authorName;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setAvaiableQuantity(int availableQuantity){
        this.availableQuantity = availableQuantity;
    }
    public String getIsbn(){
        return isbn;
    }
    public String getBookTitle(){
        return bookTitle;
    }
    public String getAurthorName(){
        return authorName;
    }
    public double getPrice(){
        return price;
    }
    public int getAvailableQuantity(){
        return availableQuantity;
    }
    public void addQuantity(int amount){
        availableQuantity += amount;
    }
    public void sellQuantity(int amount){
        availableQuantity -= amount;
    }
    public void showDetails(){
        System.out.println("ISBN: " + isbn);
        System.out.println("Title: " + bookTitle);
        System.out.println("Author: " + authorName);
        System.out.println("Price: " + price);
        System.out.println("Available: " + availableQuantity);
    }
}