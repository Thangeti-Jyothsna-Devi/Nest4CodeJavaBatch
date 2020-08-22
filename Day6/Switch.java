package day6;
public class Switch
{
	//Instance Variables or Properties
	float amps;
	String switchfunc;
	String color;
	String state;
	String typeOfSwitch;
	// Constructor
	public void Switch(int am, String sf, String c,String s,String t)
	{
		amps=am;
		switchfunc=sf;
		color=c;
		state=s;
		typeOfSwitch=t;
	}
	//Instance Methods or behavior
	public void turnoff()
	{
		System.out.println("The Switch is in Turnedoff State");
	}
	public void turnon()
	{
		System.out.println("The Switch is in Turnon State");
	}
	public void working(int w)
	{
		if(w==1)
		{
		System.out.println("The Switch is Working");
	}
		else
		{
			System.out.println("The Switch is Not Working");
		}
	}
	public void display()
	{
		System.out.println("Amperes Of A Switch: "+amps);
		System.out.println("Switch Working Condition: "+switchfunc);
		System.out.println("State Of A Switch: "+color);
		System.out.println("Switch Colour: "+state);
		System.out.println("Purpose Of A Switch: "+typeOfSwitch);
	}
}