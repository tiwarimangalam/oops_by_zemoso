package com.mangalamtiwari;
import java.io.*;
interface shape
{
    void draw();
    double area();
}
class rectangle implements shape
{
    int length,width;
    rectangle(int length, int width)
    {
        this.length = length;
        this.width = width;
    }
    @Override
    public void draw() {
        System.out.println("the rectangle has been drawn");
    }

    @Override
    public double area() {
        return length*width;
    }
}
class circle implements shape
{
    double r;
 circle(double r)
 {
     this.r=r;
 }
    @Override
    public void draw() {
        System.out.println("the rectangle has been drawn");
    }

    @Override
    public double area() {
        return (22*r*r)/7;
    }
}
public class Main {

    public static void main(String[] args) {
	shape rect= new rectangle(5,2);
    double res=rect.area();
    System.out.println("the area of rectangle is: "+ res);
    shape circ=new circle(7);
    double r=circ.area();
    System.out.println("the area of the circle is: "+r);
    }
}
