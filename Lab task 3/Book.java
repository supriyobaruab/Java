public class Book{
    private String isbn;
    private String bookTitle;
    private String authorName;
    private double price;
    private int availableQuantity;
    // Default Contructor
    public Book(){
        System.out.println("DC Called!");
    }
    // Paramitazired constructor
    public Book(String isbn, String bookTitle,String aurthorName,double price,int availableQuantity){
        this.isbn = isbn;
        this.bookTitle = bookTitle;
        this.authorName = aurthorName;
        this.price = price;
        this.availableQuantity = availableQuantity;
    }
    // Set method
    void setIsbn(String isbn){
        this.isbn = isbn;
    }
    void setBookTitle(String bookTitle){
        this.bookTitle = bookTitle;
    }
    void setAuthorName(String authorName){
        this.authorName = authorName;
    }
    void setPrice(double price){
        this.price = price;
    }
    void setAvaiableQuantity(int availableQuantity){
        this.availableQuantity = availableQuantity;
    }
    // Get method
    String getIsbn(){
        return isbn;
    }
    String getBookTitle(){
        return bookTitle;
    }
    String getAuthorName(){
        return authorName;
    }
    double getPrice(){
        return price;
    }
    int getAvailableQuantity(){
        return availableQuantity;
    }
    void addQuantity(int amount){
        availableQuantity+=amount;
    }
    void sellQuantity(int amount){
        availableQuantity-=amount;
    }
    // Show method
    void showDetails(){
        System.out.println("ISBN :"+isbn);        
        System.out.println("Book title :"+bookTitle);        
        System.out.println("AuthorName :"+authorName);        
        System.out.println("Price :"+price);
        System.out.println("Available Quantity :"+availableQuantity);
    }
}