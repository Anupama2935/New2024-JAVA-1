package Student;

public class Student {
	
	int rollno;
	int age;
	
	public void Display1()
	{
		System.out.println("Welcome to All of You");
	}
    
	public void Display2 ()
	{
		System.out.println("Automation is Very Easy");
	}
	
	public static void main(String[] args) {
		
		Student abc = new Student ();
	 {
			abc.Display1();
			abc.Display2();
			abc.rollno = 123;
			System.out.println("My roll no is " + abc.rollno);
			abc.age = 23;
			System.out.println("My age is " + abc.age);
			
	 }
		
	}
}
