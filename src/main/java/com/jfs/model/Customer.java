package com.jfs.model;
public class Customer {
	String firstName,lastName;
	public void setFirstname(String name)
	{
		//System.out.println("first name set");
		firstName=name;
	}
	public void setLastname(String name)
	{
		//System.out.println("last name set");
		lastName=name;
	}
	public String getFirstname()
	{
		return firstName;
	}
	public String getLastname()
	{
		return lastName;
	}
}
