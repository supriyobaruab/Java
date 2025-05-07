/*
 * Developing a basic java class with Association.
 * Lab task -4.1 (One to one association)
 */

import java.lang.*;
public class Passport {
    private String passportNo;
    private String country;
    private int pages;

    public Passport(){

    }
    public Passport(String passportNo,String country,int pages){
        this.passportNo = passportNo;
        this.country = country;
        this.pages = pages;
    }
    public void setPassportNo(String passportNo){
        this.passportNo = passportNo;
    }
    public void setcountry(String country){
        this.country = country;
    }
    public void setPages(int pages){
        this.pages = pages;
    }
    public String getPassportNo(){
        return passportNo;
    }
    public String getcountry(){
        return country;
    }
    public int getPages(){
        return pages;
    }
    public void showPassportInfo(){
        System.out.println();
        System.out.println("Passport Number :" +passportNo);
        System.out.println("Expire Date :" +country);
        System.out.println("Pages :"+pages);
    }
}