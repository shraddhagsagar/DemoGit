package OopsConceptsPart1;

public class Functions {

	//starting point of execution.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Functions obj= new Functions();
		//obj is reff name, nad new Functions() is object
		//object can hold only static methods
		
		obj.test();
		int l =obj.par();
		System.out.println(l);
		
		String x= obj.qa();
		System.out.println(x);
		
		int j=obj.division(30, 20);
		System.out.println(j);
		
		
	}
	
	
	
	//non non-static methods
	//void methods does not return any value
	public void test() {//no input, no out
		System.out.println("Does not return any value");
	}

	//
	public int par() {//no input, some output
		System.out.println("PQR method");
		int a=10;
		int b=20;
		int c=a+b;
		return c;
		
	}
	
	
	public String qa() {//no input, some input
		System.out.println("QA Method");
		String s ="Selenium";
		
		return s;
	}
	
	//x, y are input parameters
	public int division(int x, int y) {
		System.out.println("Division Method");
		int d=x/y;
		return d;
	}
	
	
	
}
