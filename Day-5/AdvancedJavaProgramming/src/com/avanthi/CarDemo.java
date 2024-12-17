package com.avanthi;

import com.ajp.Car;

public class CarDemo extends Car{
public static void main(String[] args) {
	Car c1=new Car();
	c1.speed=360;
	System.out.println(c1.speed);
	
	CarDemo c2=new CarDemo();
	c2.name="audi";
	System.out.println(c2.name);
	
}
}
