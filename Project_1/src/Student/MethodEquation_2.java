package Student;

public class MethodEquation_2 {
	
	//(((((10/2)-2)*2)-2)+2)
	public int div (int a, int b)
	{
		int c = a / b;
		System.out.println("result os div is " + c);
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
	
	public void sum (int a3, int b3)
	{
		int result = a3 + b3;
		System.out.println("Result of sum is " + result);
		
	}
	
	public static void main(String[] args) {
		MethodEquation_2 abc = new MethodEquation_2 ();
		
		int divresult = abc.div(10, 2);
		int subresult = abc.sub(divresult, 2);
		int multiresult = abc.multi(subresult, 2);
		int subresult1 = abc.sub(multiresult, 2);
		abc.sum(subresult1, 2);
	

}}
