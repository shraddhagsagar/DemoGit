package OopsConceptsPart1;



public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverloading obj= new MethodOverloading();
		obj.sum();
		obj.sum(20);
		obj.sum(10, 20);
		
		
	}

	//we can overload main method
	
	//you can not create method inside the method
	//duplicate methods are not allowed
	
	//overloading means same name with diff input parameters
	
	public void sum() {//0 input param
		
		System.out.println("Sum Method zero parameter");	
	}
	
	public void sum(int x) {//1 input
		System.out.println("Sum Method 1 parameter");
		System.out.println(x);
		
	}
	
	public void sum(int x, int y) {//2 input
		System.out.println("Sum Method 2 parameter");
		System.out.println(x+y);
	}
	
	
	
	
}
