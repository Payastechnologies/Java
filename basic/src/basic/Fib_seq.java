package basic;

public class Fib_seq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int a=1,b=1,c;
 System.out.print(a+",");
 System.out.print(b+",");
 for(int i=1;i<=100-2;i++) {
	 c=a+b;
	 System.out.print(c+",");
	 a=b;
	 b=c;
 }
	}

}
