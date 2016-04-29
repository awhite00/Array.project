import java.util.Scanner;
public class Array2
	{
		static int array=0;
		public static void main(String[] args)
			{
				printarray1();
				printarray2();
				printarray3();
			}
public static void printarray1()
{
	int Square=0;
	int[] myArray1={2,4,6,8,10,12,14,16,18,20};
	for (int i=0; i<myArray1.length; i++)
		{
			Square=myArray1[i]*myArray1[i];
			System.out.println(Square);
			
		}
}
	public static void printarray2()
	{
		String [] myArray2={"January","Feburary","March","April","May","June","July", "August","September", "October", "November", "December"};
		System.out.println("Pick a number!");
		 Scanner userInput=new Scanner(System.in);
		int month=userInput.nextInt();
		System.out.println(myArray2[month-1]);
	}
	public static void printarray3()
	{
		int randomNumber=(int)(Math.random()*4);
	String [] suits={"Clubs","Spades","Hearts","Diamonds"};
	int randomNumber2=(int)(Math.random()*13);
	String []  ranks={"king","queen","jack","ten","nine","eight","seven","six","five","four","three","two","ace"};
	System.out.println(ranks[randomNumber2]+" of "+ suits[randomNumber]);
	 
	}
}


	
