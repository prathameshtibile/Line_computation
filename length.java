/**
 * Calculate the length of co-ordinates
 * @author PRATHAMESH TIBILE
 *@version 1.0 
 *@since 10-6-21
 */
public class length {
	static double distance(int x1,int y1,int x2,int y2)
	
	{ 
		return Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2)*1.0);
	}
	
	public static void main(String[] args) {
		
		System.out.println(Math.round(distance(5,7,8,9)*100000.0)/100000.0);
		
		
	}
	
		
}
		
		
