package basic;

public class Student {
        //declare instance variable
	String name;
	int id;
	static String collagename="PREC";
		Student(String n,int i )
		{
			name=n;
			id=i;
		}
		void display()
		
		{
			System.out.println("Name:"+name+" "+"ID:"+id+" "+"Collagename:"+collagename);
			;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Student s=new Student("Rajashri",07);
        s.display();
        Student s1=new Student("Rama",13);
        s1.display();
        }

}
