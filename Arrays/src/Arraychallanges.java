import java.util.Scanner;
public class Arraychallanges 
{
	static int array=0;
	public static void main(String[] args) 
	
	{
		printarray1();
		printarray2();
		printarray3();
		printarray4();
	}
public static void printarray1()
{
	
	String [] myArray1={"Ally","White","Lacrosse","Football","Basketball"};
	System.out.println(myArray1[2]);
}
public static void printarray2()
{
	int[] myArray2={10,5,3,1,0};
	System.out.println(myArray2[4]);
}
public static void printarray3()
{
	int[] myArray3={10,5,3,1,0};
	for(int i=0; i<myArray3.length; i++)
		{
			System.out.println(myArray3[i]);
		}
}
public static void printarray4()
{
	int sum=0;
	int average=0;
	int[]myArray4={10,5,3,1,0,6,7,4};
	for(int i=0; i<myArray4.length;i++)
		{
			System.out.println(i);
			sum= sum+ myArray4[i];
			average= sum/ myArray4.length;
		}
	System.out.println("The average of these numbers is " + average);
}
}
 