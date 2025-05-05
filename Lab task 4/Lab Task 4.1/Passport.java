/*
 * Developing a basic java class with Association.
 * Lab task -4.1 (One to one association)
 */

import java.lang.*;
public class Passport {
    private String passportNo;
    private String expireDate;
    private int pages;

    public Passport(){

    }
    public Passport(String passportNo,String expireDate,int pages){
        this.passportNo = passportNo;
        this.expireDate = expireDate;
        this.pages = pages;
    }
    public void setPassportNo(String passportNo){
        this.passportNo = passportNo;
    }
    public void setExpiredate(String expireDate){
        this.expireDate = expireDate;
    }
    public void setPages(int pages){
        this.pages = pages;
    }
    public String getPassportNo(){
        return passportNo;
    }
    public String getExpireDate(){
        return expireDate;
    }
    public int getPages(){
        return pages;
    }
    public void showPassportInfo(){
        System.out.println("Passport Number :" +passportNo);
        System.out.println("Expire Date :" +expireDate);
        System.out.println("Pages :"+pages);
    }
}