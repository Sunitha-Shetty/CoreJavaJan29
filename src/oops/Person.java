package oops;

public class Person {
	
	public String Name;
	int Age;
	
	public Person()
	{
		System.out.println("Inside Parent class constructor");
	}
	
	public Person(String Name, int Age)
	{
		this.Name = Name;
		this.Age = Age;
		
	}

	public void display()
	{
		System.out.println("Inside Parent");
	}
	
	
	
	
}
