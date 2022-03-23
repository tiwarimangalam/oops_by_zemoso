package com.company;
class VarAndMethods
{
    private int c; // instance variable
    
    public int method(int a,int b)
    {
        int d; // local variable
        c=a+b;
        d=c;
        return c;
    }
}
public class Main {

    public static void main(String[] args) {
     VarAndMethods obj= new VarAndMethods();
     int res=obj.method(3,4);
     System.out.println("the sum of the number 3 and 4 is\n"+res);
    }
}
