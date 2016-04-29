
public class TwoDArrays3
	{
		 static int myArray[][]=new int[3][3];
		public static void main(String[] args)
			{
				int sum=0;
				for (int i=1; i<10; i++)
				 for(int row=0; row<3; row++)
			    	 {
			    		 for(int col=0; col<3; col++)
			    			 {
			 
			    					 {
			    						 myArray[row][col]=i++;
			    					 }
			    						
			    							
			    			 }
			    	 
						}
			     for(int row=0; row<3; row++)
			    	 {
			    		 for(int col=0; col<3; col++)
			    			 
			 
			    					 {
			    						System.out.print(myArray[row][col]+"  ");
			    					 }
			    						
			    					System.out.println();
			    					
			    					
			    	 }
			     sum= sum+ myArray[0][0]+ myArray[0][2]+ myArray[2][0]+ myArray[2][2];
			     System.out.println(sum);
			}
	}

				

	

	
