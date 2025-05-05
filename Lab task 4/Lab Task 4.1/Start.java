import java.lang.*;
public class Start {
    public static void main(String[] args){
        // Passport objects
        Passport obj1 = new Passport("abcdefghij","01-09-2025",300);
        Passport obj2 = new Passport("alsjkdhlla","01-10-2030",400);
        // Person objects
        Person obj3 = new Person("Supriyo",22,obj1);
        Person obj4 = new Person("Sujoy",21,obj2);
        // All the methods
        obj3.showAllInfo();
        System.out.println(); // For a line break
        obj4.showAllInfo();
    }
}
