package com.cgi.b3 ;

public class GreetAll{
private String s = "Hello World! In Br1";
private int x = 10;

GreetAll(){
	s = "HI PPL!" ;
}

GreetAll(String s){
	this.s = s ;
}

void greet(){
System.out.println(s);
}

public static void main(String args[]){
GreetAll ga = new GreetAll();
GreetAll ga1 = new GreetAll("HI from parameterised Const");
ga.greet();
ga1.greet();

}
}