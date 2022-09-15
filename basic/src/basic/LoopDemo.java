package basic;

import java.util.Scanner;

public class LoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc =  new Scanner (System.in);
System.out.println("Enter your physics marks:=");
int phy_mark=sc.nextInt();
System.out.println("Enter your chemistry marks:=");
int chem_mark=sc.nextInt();
System.out.println("Enter your maths marks:=");
int maths_mark=sc.nextInt();
float Total= phy_mark+chem_mark+maths_mark;
float per = Total/3;
System.out.println("your percent is "+per);

if(per>=85.0) {
	System.out.println("your grade is A+");
}
if(per>=50 && per<=60) {
	System.out.println("your grade is A");
}
if(per>=35 && per<=50) {
	System.out.println("your grade is B");
}
if(per>=35 && per<=35) {
	System.out.println("your grade is c");
}
	}

}
	

	


