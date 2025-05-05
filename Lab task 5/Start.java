public class Start {
    public static void main(String[] args) {
        StoryBook obj1 = new StoryBook("123","Sujoy gone crazy","Sujoy",10.2,400,"romcom");
        obj1.showDetails();
        StoryBook obj2 = new StoryBook();
        obj2.setIsbn("123");
        obj2.setBookTitle("Fabiha on the go");
        obj2.setAuthorName("Fabiha");
        obj2.setPrice(3000);
        obj2.setAvaiableQuantity(2);
        obj2.setCategory("Horror");
        obj2.setIsbn("123");

        System.out.println(obj2.getBookTitle());
        System.out.println(obj2.getAurthorName());
        System.out.println(obj2.getPrice());
        System.out.println(obj2.getAvailableQuantity());
        System.out.println(obj2.getCategory());

        TextBook obj3 = new TextBook("123","Boook","Ami",10.2,400,10);
        obj3.showDetails();
        TextBook obj4 = new TextBook();
        obj4.setIsbn("123");
        obj4.setBookTitle("Fabiha on the go");
        obj4.setAuthorName("Fabiha");
        obj4.setPrice(3000);
        obj4.setAvaiableQuantity(2);
        obj4.setStandard(10);
        obj4.setIsbn("123");

        System.out.println(obj2.getBookTitle());
        System.out.println(obj2.getAurthorName());
        System.out.println(obj2.getPrice());
        System.out.println(obj2.getAvailableQuantity());
        System.out.println(obj2.getCategory());
    }
}
