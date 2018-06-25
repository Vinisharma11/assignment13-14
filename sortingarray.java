import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Sortingarray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
        ArrayList<Integer> array1=new ArrayList<>();
		System.out.println("Enter number of elements");
		int n = sc.nextInt();
		int s;
		System.out.println("Enter integer value");
		for( i = 0 ; i < n ; i++)
		{
			s= sc.nextInt();
			array1.add(s);
		}
     Collections.sort(array1);
     System.out.println(array1);

    	ArrayList<Double> array2=new ArrayList<>();
		System.out.println("Enter number of element");
		int m = sc.nextInt();
		Double d;
		System.out.println("Enter double values");
		for( i = 0 ; i < m ; i++)
		{
			d = sc.nextDouble();
			array2.add(d);
		}
	     Collections.sort(array2);
	     System.out.println(array2);

	 
	 ArrayList<String> array3 = new ArrayList<>();
		System.out.println("Enter number of elements");
		int o = sc.nextInt();
		String st = " ";
		System.out.println("Enter strings");
		for( i = 0 ; i <= o ; i++)
			{
			st = sc.nextLine();
			array3.add(st);
		}
	     Collections.sort(array3);
	     System.out.println(array3);
	}

}
