package day7assignment;

public class main {
	public static void main(String args[])
	{
		Ostrich ostrichObj=new Ostrich();
		parrot parrotObj=new parrot();
		penguin penguinObj=new penguin();
		ostrichObj.habitat();
		ostrichObj.kindOfFood();
		System.out.println(".............................................................................................................");
		System.out.println();
		parrotObj.habitat();
		parrotObj.kindOfFood();
		parrotObj.fly();
		System.out.println(".............................................................................................................");
		System.out.println();
		penguinObj.habitat();
		penguinObj.kindOfFood();
		penguinObj.swim();
		
		
	}

}
