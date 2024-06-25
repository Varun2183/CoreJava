//Program to demonstrate encapsulation
package com.tnsif.encapsulation;

public class Encapsulation {
	//if no access specifier is mentioned then it ill be default
	private int serialNum=10;//Data_variables
	private String name;
	private int age;
	//using getter and setter 
	void show()// Member Function
	{
		System.out.println("Serialnumber : "+serialNum+"\t Name : "+name+"\t Age : "+age);
		
	}
	public int getSerialNum() {
		return serialNum;
	}
	public void setSerialNum(int serialNum) {
		this.serialNum = serialNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//to display string representation of the object
	@Override
	public String toString() {
		return "Encapsulation [serialNum=" + serialNum + ", name=" + name + ", age=" + age + "]";
	}
	
}
