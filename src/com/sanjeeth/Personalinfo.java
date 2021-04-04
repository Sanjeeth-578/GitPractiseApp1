package com.sanjeeth;

public class Personalinfo {

	private int age;
	private String name;
	private String address;
	public Personalinfo(int age, String name, String address) {
		super();
		this.age = age;
		this.name = name;
		this.address = address;
	}

	public void getInfo() {
		System.out.println("Hello World from Git");
		System.out.println("Age: " + age);
		System.out.println("Name: " + name);
		System.out.println("Address: " + address);
	}

}