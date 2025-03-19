public class Start {
    public static void main(String[] args) {
        // Default constructor
        Book obj1 = new Book();
        obj1.setIsbn("12367123");
        obj1.setBookTitle("Learning javascript");
        obj1.setAuthorname("Jhankar mahbub");
        obj1.setPrice(499.99);
        obj1.setAvaiableQuantity(2000);
        obj1.addQuantity(212);
        obj1.sellQuantity(12);
        System.out.println("");
        System.out.println("Using default constructor");
        System.out.println(obj1.getIsbn());
        System.out.println(obj1.getBookTitle());
        System.out.println(obj1.getAuthorName());
        System.out.println(obj1.getPrice());
        System.out.println(obj1.getAvailableQuantity());
        // Paramitarized 
        Book obj2 = new Book("123798123","Learning javascript","Jhankar mahbub",499.99,2000);
        obj2.addQuantity(300);
        obj2.sellQuantity(32);
        System.out.println("");
        System.out.println("Using paramitarized constructor");
        obj2.showDetails();
    }
}
