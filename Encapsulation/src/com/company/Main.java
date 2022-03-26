package com.company;
// Encapsulation =data hiding+abstraction
class Account
{
    private double balance;
    public void setters(double bal)
    {
        this.balance=bal;
    }
    public double getters()
    {
        return this.balance;
    }
}

public class Main {

    public static void main(String[] args) {
        Account obj=new Account();
        obj.setters(10000.0);
        double res= obj.getters();
        System.out.println("the provided balance is: "+res);
    }
}
