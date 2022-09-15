package basic;

public class Math_sin_cos_tan {
public static void main (String[]arrs) {
	double degrees=45.0;  
	
	double radians =Math.toRadians(degrees);
	double SinValue = Math.sin(radians);
	
	double radian =Math.toRadians(degrees);
	double cosValue=Math.cos(radians);
	
    double Radian =Math.toRadians(degrees);
	double tanValue=Math.tan(radian);
	
	System.out.println("tan("+ degrees +") = " + tanValue);
	System.out.println("Sin("+ degrees + ") = " + SinValue) ;
	System.out.println("Cos("+ degrees + ") = " + cosValue) ;
}
}
