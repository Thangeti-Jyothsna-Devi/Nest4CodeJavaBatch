package day6;

public class assignment {
public static void main(String args[])
{
	Switch obj1=new Switch();//Object 1
	Switch obj2=new Switch();//Object 2
	Switch obj3=new Switch();//Object 3
	Switch obj4=new Switch();//Object 4
	Switch obj5=new Switch();//Object 5
	obj1.amps=150;
	obj1.switchfunc="Working Switch";
	obj1.state="Open State";
	obj1.color="Black Color Switch";
	obj1.typeOfSwitch="Fan Switch";
	obj1.turnon();
	obj1.working(1);
	obj1.display();
	System.out.println("------------------------------------------------------------------------------------------");
	System.out.println("Second Object");
	obj2.amps=100;
	obj2.switchfunc="Not Working Switch";
	obj2.state="Closed State";
	obj2.color="white Color Switch";
	obj2.typeOfSwitch="Tv Switch";
	obj2.turnoff();
	obj2.working(0);
	obj2.display();
	System.out.println("------------------------------------------------------------------------------------------");
	System.out.println("Third Object");
	obj3.amps=500;
	obj3.switchfunc="Not Working Switch";
	obj3.state="open State";
	obj3.color="white Color Switch";
	obj3.typeOfSwitch="AirConditioner Switch";
	obj3.turnon();
	obj3.working(1);
	obj3.display();
	System.out.println("------------------------------------------------------------------------------------------");
	System.out.println("Fourth Object");
	obj4.amps=200;
	obj4.switchfunc="Not Working Switch";
	obj4.state="Closed State";
	obj4.color="Black Color Switch";
	obj4.typeOfSwitch="Fridge Switch";
	obj4.turnoff();
	obj4.working(0);
	obj4.display();
	System.out.println("------------------------------------------------------------------------------------------");
	System.out.println("Third Object");
	obj5.amps=500;
	obj5.switchfunc="Not Working Switch";
	obj5.state="open State";
	obj5.color="white Color Switch";
	obj5.typeOfSwitch="AirConditioner Switch";
	obj5.turnon();
	obj5.working(1);
	obj5.display();
}
}
