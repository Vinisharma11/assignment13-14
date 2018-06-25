import java.util.Scanner;
class genprint {
 
  public static <E> void printAr(E[] arr)
  {
    for (E  r: arr)
      System.out.printf("%s ",r);

    System.out.println();
  }

  public static void main(String args[]) {
	  int n;
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter number of elements");
	  n = sc.nextInt();
      Integer[] array1 = new Integer[n];
	  Double[] array2 = new Double[n];
	  
	
	System.out.println("Enter integer elements");
		for(int i =0 ; i < n ; i++)
			{
			array1[i] = sc.nextInt();
		    }
    
	System.out.println("Enter double elements");
		for(int i =0 ; i < n ; i++)
			{
			array2[i] = sc.nextDouble();
		    }
    System.out.println("Array 1 contains:");
    printAr(array1); 
    System.out.println("\nArray 2 contains:");
    printAr(array2);
  }
}