public class Start {
    public static void main(String[] args) {
        //Taken all the book titles from chatgpt 😀
        //Textbook objects
        TextBook tb1 = new TextBook("001", "Java Basics", "Alice", 500.0, 10, 9);
        TextBook tb2 = new TextBook("002", "OOP in Java", "Bob", 600.0, 8, 10);
        TextBook tb3 = new TextBook("003", "Data Structures", "Charlie", 700.0, 5, 11);
        TextBook tb4 = new TextBook("004", "Algorithms", "David", 800.0, 3, 12);
        TextBook tb5 = new TextBook("005", "Design Patterns", "Eve", 900.0, 4, 13);
        //Storybook objects
        StoryBook sb1 = new StoryBook("101", "Fairy Tales", "Grimm", 200.0, 12, "Fantasy");
        StoryBook sb2 = new StoryBook("102", "Adventures", "Hemingway", 250.0, 6, "Adventure");
        StoryBook sb3 = new StoryBook("103", "Mystery", "Conan Doyle", 300.0, 7, "Mystery");
        StoryBook sb4 = new StoryBook("104", "Sci-fi", "Asimov", 400.0, 9, "Science Fiction");
        StoryBook sb5 = new StoryBook("105", "Horror", "King", 350.0, 5, "Horror");
        
        // object for 
        BookShop shop = new BookShop("Supriyo's shop");

        // For text book
        shop.insertTextBook(tb1);
        shop.insertTextBook(tb2);
        shop.insertTextBook(tb3);
        shop.insertTextBook(tb4);
        shop.insertTextBook(tb5);
        // For story book
        shop.insertStoryBook(sb1);
        shop.insertStoryBook(sb2);
        shop.insertStoryBook(sb3);
        shop.insertStoryBook(sb4);
        shop.insertStoryBook(sb5);
        //delete books
        shop.removeTextBook(tb5);
        shop.removeStoryBook(sb5);
        //searcg books
        shop.searchTextBook("001");
        shop.searchTextBook("999"); // Will show no such books with that isbn
        shop.searchStoryBook("101");
        //Show Book details
        shop.showAllTextBooks();
        shop.showAllStoryBooks();
    }
}