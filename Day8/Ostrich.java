package Day8;

public class Ostrich extends Bird {
	@Override
	public void habitat()
	{
		System.out.println(" ostriches are Native to Africa and found in savanna and desert regions");
	}
	@Override 
	public void  kindOfFood()
	{
		System.out.println("Ostriches typically eat plants, roots, and seeds but will also eat insects, lizards, or other creatures available in their sometimes harsh habitat.");
	}
	// Method Overriding
	@Override
	public void eat()
	{
		System.out.println("METHOD OVERRIDING");
		System.out.println("Eat plants");
	}
	// Method Overloading
	public void eat(String item)
	{
		System.out.println("METHOD OVERLOADING");
		System.out.println("OStrich Favourite Food is:"+item);
	}

}
