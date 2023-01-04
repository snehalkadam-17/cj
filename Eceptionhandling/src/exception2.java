
 public class exception2 {
	 public static void main(String[] args)
	 {
		 try
		 {
			 int a[]= {1,2};
			 a[2]=3/0;
		 }
		 catch(ArithmeticException ae)
		 {
			 System.out.println("divide by zero");
		 }
		 catch(ArrayIndexOutOfBoundsException e)
		 {
			 System.out.println("Array index out of bound exception");
		 }
	 }
}
