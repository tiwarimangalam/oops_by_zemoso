package com.mangalamtiwari;
// there are two types of 
import java.util.Calendar;
import java.util.Date;
public class Main {
    public static void main(String[] args) {
        PackandImp obj = new PackandImp();
        String s = obj.display();
        System.out.println("the returned string is " + s);
        Calendar c= Calendar.getInstance();
        System.out.println("The time is "+ c.getTime());
    }
}
