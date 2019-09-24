package OopsConceptsPart2;

public class ConstructorConcept {
	
	String name;
	int age;
	public ConstructorConcept() {
		System.out.println("Default constructor");
	}
	
	public ConstructorConcept(String name, int age) {
		this.name=name;//this.class variable = local variable
		this.age=age;
	}
	
	//public ConstructorConcept(int i)

	public static void main(String[] args) {//0 parameter constructor
		// TODO Auto-generated method stub

		
		ConstructorConcept con = new ConstructorConcept();
		ConstructorConcept con1 = new ConstructorConcept("Riya", 25);
		
	}

}
