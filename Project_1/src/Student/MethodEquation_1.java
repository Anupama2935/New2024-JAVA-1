package Student;

public class MethodEquation_1 {
	
	//    (((((10+2)*2)-2)*2)/2)
	
	public int sum (int a, int b)
	{
		int c = a + b;
		System.out.println("result os sum is " + c);
	    return c;
	}
	
	public int multi (int a1, int b1)
	{
		int c1 = a1 * b1;
		System.out.println("multiplication result is " + c1);
		return c1;
	}
	
	public int sub (int a2, int b2)
	{
		int c2 = a2 - b2;
		System.out.println("Result of substraction is " + c2);
		return c2;
	}
	
	public void div (int a3, int b3)
	{
		int result = a3 / b3;
		System.out.println("Result of division is " + result);
		
	}
	
	public static void main(String[] args) {
		MethodEquation_1 abc = new MethodEquation_1 ();
		int sumresult = abc.sum(10, 2);
		int multiresult = abc.multi(sumresult, 2);
		int subresult = abc.sub(multiresult, 2);
		int multiresult1 = abc.multi(subresult, 2);
		abc.div(multiresult1, 2);
		
		
	}

}
