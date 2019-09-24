package JavaBasics_1;

public class Array5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int i[]= new int[4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		//i[4]=50;
		
		System.out.println(i[1]);
		System.out.println(i[3]);
		System.out.println(i.length);//size of array
		
		//print all the value of the array
		for(int j=0;j<i.length;j++)
		{
			System.out.println(i[j]);
		}
		
		double x[] = new double[3];
		x[0]=10.00;
		x[1]=20.00;
		x[2]=30.00;
		
		System.out.println(x.length);
		for(double y=0;y<x.length;y++)
		{
		//System.out.println(x[y]);
		}
		
		String s[]= new String[2];
		s[0]="test";
		s[1]="test1";
		//s[2]="test2";
		
		
		System.out.println(s.length);
		System.out.println(s[1]);
		
		//disadvantages of array
		//size is fixed-so its called static array--to overcome this problem--we use collections --ArrayList, HashTable--use dynamic array
		//stores similar data types -to overcome this problem, we use Object array
		for(int p=0;p<=4;p++)
		{
			for(int q=0;q<=p;q++)
			{
				System.out.print(p);
							
			}
			System.out.print("\n");	
		}
		
		//for(int l=4;l>m;l++)
		
		
		//1D Array
		Object ob[]= new Object[6];
		ob[0]="Shraddha";
		ob[1]="S";
		ob[2]="60563";
		ob[3]="8.5";
		System.out.println(ob.length);
		
		for(int o=0;o<ob.length;o++) {
		System.out.println(ob[o]);
		}
		
		//2D Array
		
		String j[][]= new String[3][5];
		
		System.out.println(j.length);//Total number of rows
		System.out.println(j[0].length);//Total number of columns
		
		//row1
		j[0][0]="Riya";
		j[0][1]="Raj";
		j[0][2]="Pune";
		j[0][3]="Pimpri";
		j[0][4]="Maharashtra";
		
		//row2
		j[1][0]="seema";
		j[1][1]="siya";
		j[1][2]="Delhi";
		j[1][3]="Patana";
		j[1][4]="Delhi";
		
		//row3
		j[2][0]="Rohan";
		j[2][1]="Roy";
		j[2][2]="Delhi";
		j[2][3]="Patana";
		j[2][4]="Delhi";
		
		for(int row=0;row<j.length;row++) {
			for(int col=0;col<j[0].length;col++)
			{
				System.out.print(j[row][col]+" ");
			}
			System.out.println("\n");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
