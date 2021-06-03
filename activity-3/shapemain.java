package activity3;

import java.util.*;
abstract class Shape {
     int value;
     
    public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Shape(int value) {
		super();
		this.value = value;
	}

	public abstract int calculateArea(int value);
    
}
 class Circle extends Shape{
  public Circle(int value) {
		super(value);
		
	}
final double pi=Math.PI;
  public int calculateArea(int value) {
       
        return (int) (pi * Math.pow(getValue(), 2));
    } 
}

 class Square extends Shape{
  public Square(int value) {
		super(value);
		
	}

public int calculateArea(int value) {
       
        return getValue()*getValue();
    } 
}

public class shapemain
{
public static void main(String[] args)
{
@SuppressWarnings("resource")
Scanner sc=new Scanner(System.in);
System.out.println("Circle\nSquare");
System.out.println("Enter the shape");
String str=sc.next();
System.out.println("Enter the radius");
int value=sc.nextInt();
Circle c=new Circle(value);
Square s=new Square(value);
c.setValue(value);
s.setValue(value);
if(str.equals("Circle"))
{
double d=c.calculateArea(value);
System.out.println("Area of circle is: "+String.format("%.2f",d));
}
if(str.equals("Square"))
{
	double e=s.calculateArea(value);
	System.out.println("Area of circle is: "+String.format("%.2f",e));
}
}}




