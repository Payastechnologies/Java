package basic;

public class Parent1 {
void property() {
	System.out.println("50lakh");
    }
  }   
class father extends Parent1
{
	void father_property() {
		System.out.println("20lakh");
}
}
class son extends father
{
	void son_Property() {
		System.out.println("10lakh");
}
}
