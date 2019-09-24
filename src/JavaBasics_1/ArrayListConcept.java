package JavaBasics_1;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList ar = new ArrayList();
		
		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add(40);
		ar.add(50);
		ar.add("Shraddha");
		ar.add(4.9);
		System.out.println(ar.size());
	
		//System.out.println(ar.get(5));
		
		//to print all the value of the arraylist
		for(int i=0; i<ar.size();i++) {
			
			System.out.println(ar.get(i));
		}
		
	}
	
	

}
