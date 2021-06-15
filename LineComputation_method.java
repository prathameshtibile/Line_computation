import java.util.Scanner;

public class LineComputation_method {
	
	public static void FIND_LENGTH(int x1,int y1,int y2,int x2,int a1, int b1, int a2, int b2) 
	{
			
	    	double length1 = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
			double length2=Math.sqrt((a2-a1)*(a2-a1) + (b2-b1)*(b2-b1));
		    System.out.println("The Length between (x1,y1), (x2,y2) is " + length1);
		    System.out.println("The Length between (a1,b1), (a2,b2) is " + length2);
		    
		    //Comparing Length	
		      if (length1 > length2) {
		     	 System.out.println("First Line is Greater");
		      }
		      else if (length1 < length2) {
		     	 System.out.println("Second Line is Greater");
		      }
		      else {
		     	 System.out.println("Both Lines are Equal");
		      }
		      
	 }
	
	
	
	  public static void  main(String[] args) 
	  {
		    int x1,y1,x2,y2;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter x1 point");
			x1=sc.nextInt();
			System.out.println("Enter y1 point");
			y1=sc.nextInt();
			System.out.println("Enter x2 point");
			x2=sc.nextInt();
			System.out.println("Enter y2 point");
			y2=sc.nextInt();
			  
			int a1,a2,b1,b2;
			System.out.println("Enter a1 point");
			a1=sc.nextInt();
			System.out.println("Enter b1 point");
			b1=sc.nextInt();
			System.out.println("Enter a2 point");
			a2=sc.nextInt();
			System.out.println("Enter b2 point");
			b2=sc.nextInt();
			
	           FIND_LENGTH(x1,y1,x2,y2,a1,b1,a2,b2);
	           
	    } 
	        
}


