package Student;

public class Constructor_This_Keyword {
	
	public Constructor_This_Keyword ()
	{   
		this (1,2,3);
		System.out.println("Default Constructor");
	}
	
    public Constructor_This_Keyword (int a)
    { 
      this (1,2);
	  System.out.println("One Parameterized Constructor");
	}

    public Constructor_This_Keyword (int a , int b)
    {   
    	this ();
    	System.out.println("Two Parameterized Constructor");
    }
    public Constructor_This_Keyword (int a , int b , int c)
    {
      System.out.println( "Three Parameterized Constructor");
    }
    
    public static void main(String[] args) {
		
    	Constructor_This_Keyword ob = new Constructor_This_Keyword (24);
	}
}
