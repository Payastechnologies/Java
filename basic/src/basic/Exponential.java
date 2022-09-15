package basic;

public class Exponential {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       double x =Double.parseDouble(args[0]);
       double sum =0.0;
       double term =1.0;
       for(int i=1;sum !=sum+term; i++) {
    	 sum=sum+term;
    	 term=term * x / i ;
    	 System.out.println(i+ " "+term+ " "+ sum);
       }
       System.out.println(sum);
       System.out.println(Math.exp(x));
       }
	}


