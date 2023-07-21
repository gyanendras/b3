package com.cgi.shapes;
//class, data types, autoboxing, 
// constructor - default, 
// String immutability\
// equals and hashcode 
// 


import java.util.Objects;

public class Circle {
	

	char c = 'a';
	int r = 10; 
	Integer val = r;
	String color = "White";
	
	
	Circle(){
		r=c;
		
	}
	
	Circle(int r){
		this.r=r;
		
	}
	
	Circle(int r, String col){
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
	

	public static void main(String[] args) {
	
		Circle c = new Circle(2,"red");
		Circle c2 = new Circle(2,"red");
		System.out.println( c.hashCode()==c2.hashCode()); 
		System.out.println( c.equals(c2));
		System.out.println(c);
		
		//System.out.println("In master circle b3 " + c.i );
		//c.process();
		//System.out.println(c.color);
		
		
		
		

	}

	@Override
	public int hashCode() {
		return Objects.hash(color, r);
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

}
