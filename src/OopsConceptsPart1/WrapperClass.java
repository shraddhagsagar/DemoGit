package OopsConceptsPart1;

public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s ="100";
		System.out.println(s+20);
		
		int i= Integer.parseInt(s);
		System.out.println(i+20);
	
		//Integer, Double, Character, Boolean
		
		String x ="12.22";
		System.out.println(x+20);
		
		double y=Double.parseDouble(x);
		System.out.println(y+20);
		
		
		String z="true";
		boolean w=Boolean.parseBoolean(z);
		System.out.println(w);
		
		//int to string conert
		int g=200;
		String k =String.valueOf(g);
		System.out.println(k);
		
		
		
		
		
		
		
		
		
		
	}

}
