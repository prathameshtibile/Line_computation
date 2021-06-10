/**
 * to find the equality of two lines
 * @author PRATHAMESH TIBILE
 * @since 10-6-21
 *
 */
import java.util.Scanner;
public class line_equality {
	public static void main(String[] args) {
		int x1,x2,y1,y2;
		double length;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter x1 point");
		x1=sc.nextInt();
		System.out.println("Enter y1 point");
		y1=sc.nextInt();
		System.out.println("Enter x2 point");
		x2=sc.nextInt();
		System.out.println("Enter y2 point");
		y2=sc.nextInt();
		length=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		System.out.println("The Length between (x1,y1), (x2,y2) is" + length);
		
		int a1,a2,b1,b2;
		double length1;
		
		System.out.println("Enter a1 point");
		a1=sc.nextInt();
		System.out.println("Enter b1 point");
		b1=sc.nextInt();
		System.out.println("Enter a2 point");
		a2=sc.nextInt();
		System.out.println("Enter b2 point");
		b2=sc.nextInt();
		length1=Math.sqrt((a2-a1)*(a2-a1) + (b2-b1)*(b2-b1));
		System.out.println("The Length between (x1,y1), (x2,y2) is" + length1);
		
		if (length == length1)
		{
			System.out.println("Two Lines Are Equal");
		}
		else
			System.out.println("Two Lines Are Not Equal");
	}
		
		
		
		

}
