package OopsConceptsPart2;

public class Carconstruct {
	String model;
	int year;
	int price;
	
	
	public Carconstruct(String model, int year, int price) {
		this.model=model;
		this.year=year;
		this.price=price;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Carconstruct car1= new Carconstruct("Audi", 2003, 10000);
		Carconstruct car2= new Carconstruct("Sedan", 2013, 20000);
		Carconstruct car3= new Carconstruct("Mercedes", 2011, 25000);
		Carconstruct car4= new Carconstruct("Toyota", 2009, 22000);
		
		System.out.println(car1.model+" "+car1.year+" "+car1.price);
		
	}

}
