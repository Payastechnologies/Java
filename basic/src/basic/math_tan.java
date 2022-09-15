package basic;

public class math_tan {
public static void main(String[]arrs) {
	double degrees=45.5;
	
	double radians=Math.toRadians(degrees);
	
	double tanValue=Math.tan(radians);
	
	System.out.println("tan("+ degrees +") = " + tanValue);
	
}
}
