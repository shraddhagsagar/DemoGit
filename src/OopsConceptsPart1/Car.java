package OopsConceptsPart1;

public class Car {

	//Class Var
	int mod;
	int wheel;
	//Testing abc
	int C=0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//new car(); --this is object of car class
	//new keyword is use to create the object
		Car a = new Car();
		Car b = new Car();
		Car c = new Car();
		
		a.mod=2015;
		a.wheel=4;
		
		b.mod=2014;
		b.wheel=4;
		
		c.mod=2018;
		c.wheel=4;
		
		System.out.println(a.mod);
		System.out.println(a.wheel);
		
		System.out.println(b.mod);
		System.out.println(b.wheel);
		
		System.out.println(c.mod);
		System.out.println(c.wheel);
				
		
	}
	
	

}
