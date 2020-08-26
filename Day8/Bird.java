package Day8;

public abstract class Bird {
	String color;
	int weight;
	int height;
	public void blood()
	{
		System.out.println("Worm Blooded....");
	}
	public void wings()
	{
		System.out.println("have wings");
	}
	public void eat()
	{
		System.out.println("Eat insects....");
	}
public  abstract void habitat ();
public abstract void kindOfFood();
}
