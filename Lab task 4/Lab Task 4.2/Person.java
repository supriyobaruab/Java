import java.lang.*;
public class Person {
    private String name;
    private int age;
    private Passport pp[];

    public Person(){}
    public Person(String name, int age,int size){
        this.name = name;
        this.age = age;
        pp = new Passport[size];
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    // add method
    public void addPassport(Passport pp){
        boolean flag = false;
        for(int i = 0; i<this.pp.length; i++){
            if(this.pp[i] == null){
                this.pp[i] = pp;
                flag = true;
                break;
            }
        }
            if(flag == true){
                System.out.println("Passport Inserted!");
            }
            else{
                System.out.println("Couldn't Insert the passport!");
            }
        
    }
    //Delete method
    public void deletePassport(Passport pp){
        boolean flag = false;
        for(int i = 0; i<this.pp.length;i++){
            if(this.pp[i] == pp)
            {   
                this.pp[i] = null;
                flag = true;
                break;
            }
            else{
                flag = false;
            }
        }
        if(flag == true){
            System.out.println("Passport deleted");
        }
        else{
            System.out.println("No passport found");
        }
    }
    //Show method
    public void showPassports(){
        for(int i = 0; i<this.pp.length; i++){
            if(this.pp[i]!=null){
                pp[i].showPassportInfo();
            }
            else{
                System.out.println("Nothing to show");
            }
        }
    } 
}