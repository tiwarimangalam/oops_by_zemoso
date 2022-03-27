package com.company;
class A
{
    int res;
    public int sum(int a,int b)
    {
        res=a+b;
        return res;
    }
    public int sum(int a, int b,int c) // method overloading
    {
        res=a+b+c;
        return res;
    }
}
class B extends A
{
    public int sum(int a,int b)
    {
        return 2*a+b;
    }
}
public class Main {
    public static void main(String[] args) {
	A obj=new A();
    int res=obj.sum(2,3);
    System.out.println("The result is: "+res);
    }
}
