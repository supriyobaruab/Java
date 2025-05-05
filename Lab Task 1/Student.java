 /*
 * Developing basic Java classes with attributes and methods.
 * LabTask - 1(a)
 */
 import java.lang.*;
 public class Student{
    private int id;
    private String name;
    private double cgpa;
    // Default constructor
    public Student(){

    }
    // Set method
    public void setId(int id){
      this.id = id;
    }
    public void setName(String name){
      this.name = name;
    }
    public void setCgpa(double cgpa){
      this.cgpa = cgpa;
    }
    // Get method
    public int getId(){
      return id;
    }
    public String getName(){
     return name;
    }
    public double getCgpa(){
      return cgpa;
    }
    // Main function
    public static void main(String[] args){
      Student obj1 = new Student();
      obj1.setName("Supriyo");
      obj1.setId(24);
      obj1.setCgpa(4.0);
      System.out.println("Name : " + obj1.name);
      System.out.println("Name : " + obj1.id);
      System.out.println("Name : " + obj1.cgpa);
    }
 }
 