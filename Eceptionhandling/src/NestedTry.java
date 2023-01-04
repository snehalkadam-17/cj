
public class NestedTry {
public static void main(String [] args)
{
	try {
		int a[]= {5,0,1,2};
		try {
			int x=a[3]/a[1];
		}
		catch(ArithmeticException ae)
		{
		System.out.println("divide by zero");	
		}
		a[4]=3;
	}
	catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("array index out of bounds exception");	
}
}
}
