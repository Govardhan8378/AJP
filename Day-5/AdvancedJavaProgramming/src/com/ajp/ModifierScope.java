package com.ajp;

public class ModifierScope {
public static void main(String[] args) {
	Car c=new Car();
	c.capacity=5;
	c.name="Audi";
	c.speed=350;
	c.setMileage(15);
	System.out.println(c.capacity);
	System.out.println(c.name);
	System.out.println(c.speed);
	System.out.println(c.getMileage());
	
}
}