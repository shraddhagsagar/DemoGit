package OopsConceptsPart2;

import java.util.ArrayList;

public class TestCar {
	
	//method overriding it will take child class method is called method overriding
	//when same methos present in child class as well as parent class it will take method from child class is called method overriding
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//static polymorophism --compile time polymorphism
		BMW bmw = new BMW();  //overridden method
		bmw.start();
		bmw.stop();
		bmw.theftSafety();
		bmw.engine();
		
	//	System.out.println("**************");
		
		
		Car c= new Car();
		c.start();
		c.stop();
		c.refuel();
		
		
		Car c1= new BMW();
		
		
		//Java concepts
		//1. Overloading-this will overload the methods methods can be with same name but diff parameters-sum(), sum(int a),, sum(int a, int b) 
		//2. Inheritence-It can take property from parent class using keyword extends -BMW extends Car
		//3. Overriding-It will override the method,
		//   ex: BMW bmw = new BMW();
				//bmw.start(); ---this same method is in Parent class n child class but it will give priority to child class
		//4. Polymorphism-  1 to many relationship
		
		
		//Employee class
		
		Employee e= new Employee(101, 35, "Sonam");
		Employee e1= new Employee(102, 25, "Siya");
		Employee e2= new Employee(103, 32, "Riya");
		
		//create array list
		ArrayList<Employee> ar4= new ArrayList<Employee>();
		ar4.add(e);
		ar4.add(e1);
		ar4.add(e2);
		
		//Iterator<Employee>it=ar4.iterator();
		
		
		
		
	}

}
