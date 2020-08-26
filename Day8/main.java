package Day8;

public class main {
	public static void main(String args[])
	{
		Ostrich ostrichObj=new Ostrich();
		Parrot parrotObj=new Parrot();
		Penguin penguinObj=new Penguin();
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
		System.out.println("...............................................................................................................");
		Bird birdobj=new Ostrich();
		birdobj.eat();
		((Ostrich) birdobj).eat("Roots");
		System.out.println("...............................................................................................................");
		Bird birdobj1=new Parrot();
		birdobj1.eat();
		((Parrot) birdobj1).eat("Insects");
		System.out.println("...............................................................................................................");
		Bird birdobj2=new Penguin();
		birdobj2.eat();
		((Penguin) birdobj2).eat("Insects");
		
		
	}

}
