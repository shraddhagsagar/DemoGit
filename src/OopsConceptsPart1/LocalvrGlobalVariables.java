package OopsConceptsPart1;

public class LocalvrGlobalVariables {
	//Global Variables
	String name="tom";
	int age=20;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=10;//local variables for this method only
		
		LocalvrGlobalVariables obj= new LocalvrGlobalVariables();
		System.out.println(obj.name);
		System.out.println(obj.age);	
	}
	
	public void sum() {//local variables for this method only
		int i=15;
		int j=20;
		int c =i+j;
		
		
	}
	

}
