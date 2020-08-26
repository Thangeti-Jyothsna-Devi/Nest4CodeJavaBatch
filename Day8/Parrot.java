package Day8 ;
public class Parrot extends Bird implements flyBehaviour {
	@Override
	public void habitat()
	{
		System.out.println(" Most wild parrots live in the warm areas of the Southern Hemisphere");
	}
	@Override 
	public void  kindOfFood()
	{
		System.out.println("Parrots are omnivores, which means that they can eat both meat and vegetation. Most parrots eat a diet that contains nuts, flowers, fruit, buds, seeds and insects.");
	}
	@Override
	public void fly()
	{
		System.out.println("Parrots can Fly....");
	}
	// Method Overriding
	@Override
	public void eat()
	{
		System.out.println("METHOD OVERRIDING");
		System.out.println("Eat both meat and veg");
	}
	// Method Overloading
	public void eat(String item)
	{
		System.out.println("METHOD OVERLOADING");
		System.out.println("Parrot Favourite Food is:"+item);
	}
}
