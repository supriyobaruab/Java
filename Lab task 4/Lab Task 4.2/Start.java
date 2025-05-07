import java.util.*;
public class Start {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("How many passport you want to add?");
        int size = input.nextInt();
        //Passport object
        Passport obj1 = new Passport("81273992E8GH", "Bangladesh", 300);
        Passport obj2 = new Passport("8712379R77RP", "INDIA", 450);
        Passport obj3 = new Passport("8JHASDHH22KL", "United Kingdom", 120);
        Passport obj4 = new Passport("8456456497YU", "Bangladesh", 300);
        Passport obj5 = new Passport("871ASDASR77O", "Bangladesh", 300);
        //Person object
        Person obj6 = new Person("Supriyo",22,size);

        obj6.addPassport(obj1);
        obj6.addPassport(obj2);
        obj6.addPassport(obj3);
        obj6.addPassport(obj4);
        obj6.deletePassport(obj2);
        obj6.showPassports();
    }
}
