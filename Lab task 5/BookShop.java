public class BookShop {
    private String name;
    private TextBook textBooks[] = new TextBook[100];
    private StoryBook storyBooks[] = new StoryBook[100];

    public BookShop(){};
    public BookShop(String name){
        this.name = name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    // Text book
    public boolean insertTextBook(TextBook tb){
        for(int i =0; i<textBooks.length;i++){
            if(textBooks[i]==null){
                textBooks[i] = tb;
                System.out.println("Inserted");
                return true;
            }
        }
        return false;
    }
    public boolean removeTextBook(TextBook tb){
        for(int i =0; i<textBooks.length;i++){
            if(textBooks[i]==tb){
                textBooks[i] = null;
                System.out.println("Removed!");
                return true;
            }
        }
        return false;
    }
public TextBook searchTextBook(String isbn) {
    for (int i = 0; i < textBooks.length; i++) {
        if (textBooks[i] != null && textBooks[i].getIsbn().equals(isbn)) {
            System.out.println("Searched result:");
            textBooks[i].showDetails();
            return textBooks[i];
        }
    }
    System.out.println("Searched result:");
    System.out.println("No such book found with that ISBN.");
    return null;
}
    public void showAllTextBooks(){
        for(int i =0; i<textBooks.length;i++){
            if(textBooks[i] != null){
                textBooks[i].showDetails();
            }
            else{
                System.out.println("Nothing to show");
                break;
            }
        }
    }
    // StoryBook
    public boolean insertStoryBook(StoryBook sb){
        for(int i =0; i<storyBooks.length;i++){
            if(storyBooks[i]==null){
                storyBooks[i] = sb;
                System.out.println("Inserted");
                return true;
            }
        }
        return false;
    }
    public boolean removeStoryBook(StoryBook sb){
        for(int i =0; i<storyBooks.length;i++){
            if(storyBooks[i]== sb){
                storyBooks[i] = null;
                System.out.println("Removed!");
                return true;
            }
        }
        return false;
    }
    public StoryBook searchStoryBook(String isbn) {
    for (int i = 0; i < storyBooks.length; i++) {
        if (storyBooks[i] != null && storyBooks[i].getIsbn().equals(isbn)) {
            System.out.println("Searched result:");
            storyBooks[i].showDetails();
            return storyBooks[i];
        }
    }
    System.out.println("Searched result:");
    System.out.println("No such book found with that ISBN.");
    return null;
}
    public void showAllStoryBooks(){
        for(int i =0; i<storyBooks.length;i++){
            if(storyBooks[i] != null){
                storyBooks[i].showDetails();
            }
            else{
                System.out.println("Nothing to show");
                break;
            }
        }
    }
}
