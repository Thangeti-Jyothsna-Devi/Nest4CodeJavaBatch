package day7assignment;

public class penguin extends Bird implements swimBehaviour  {
	@Override
	public void habitat()
	{
		System.out.println("All penguins live in the Southern Hemisphere, though it is a common myth that they all live in Antarctica. In fact, penguins can be found on every continent in the Southern Hemisphere.");
	}
	@Override 
	public void  kindOfFood()
	{
		System.out.println("Penguins are carnivores; they eat only meat. Their diet includes krill (tiny crustaceans), squid and fish.");
	}
	@Override
	public void swim()
	{
		System.out.println("Penguin can't Fly they use their Wings to Swim....");
	}
}
