package com.day2.object;

public class InitializationThroughMethod {
int id;
String name;
public void getInfo(int i,String n)
{
	id=i;
	name=n;
}
public void displayInfo() {
System.out.println("id :" +id + "name:"+name);
}
}
