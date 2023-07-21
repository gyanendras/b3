package com.cgi.shapes;
//class, data types, autoboxing, 
// constructor - default, 
// String immutability\
// equals and hashcode 
// oops - polymorphism, iheritance, abstraction, encapsultion.
// overloading- same functin name, diff params, 
// overriding -  same function name, same params but in parent child class
// interfaces
// Collection - Lists, Sets, Map
// Before using objects in collections override equals,hashcode,and implement comparable.



import java.io.Serializable;
import java.util.Objects;

public class Circle extends Shape implements Comparable<Circle>, Serializable{
	

	char c = 'a';
	int r = 10; 
	//Integer val = r;
	String color = "White";
	
	
	public Circle(){
		r=c;
		
	}
	
	public Circle(int r){
		this.r=r;
		
	}
	
	public Circle(int r, String col){
		this.r=r;
		this.color = col;
		
	}
    
	public void process(){
		color = "black";
		// color = color.concat("is good");
		String  color2 = "black";
		String color3 = new String("black"); 
		String color4 = new String("black"); 
		System.out.println(color == color2);
		System.out.println(color == color3);
		System.out.println(color.equals(color3));
		
		
	}
	
	public void process(String p){
	System.out.println("process is" + "P");
	}
	

	public static void main(String[] args) {
		
		Circle c3 = new Circle(2); // static polymorphism
		Circle c = new Circle(2,"red");
		Circle c2 = new Circle(2,"red");
		System.out.println( c.hashCode()==c2.hashCode()); 
		System.out.println( c.equals(c2));
		System.out.println(c);
		
		//System.out.println("In master circle b3 " + c.i );
		c.process();
		Shape s = new Shape();
		System.out.println(s.getName());
		s = c; // dynamic polymorphism 
		System.out.println(s.getName());
		
		//System.out.println(c.getName());
		
		Comparable c4 = c;
		
		
		
		
		
		

	}

	@Override
	public int hashCode() {
		return Objects.hash(color, r);
	}

	public String getName() {
		return "Child - circle "+r;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		return Objects.equals(color, other.color) && r == other.r;
	}

	
	@Override
	public String toString() {
		return "radius is  " + r +" and color is " + color;
	}

	@Override
	public int compareTo(Circle o) {
		// TODO Auto-generated method stub
		return this.r-o.r;
	}

	
	
}
