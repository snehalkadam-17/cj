abstract class AbstractA{
	abstract void callme();
	public void normal()
	{
		System.out.println("this is concrete method");
	}
}
public class AbstractB extends AbstractA {
void callme()
{
	
	System.out.println("this is call me");
}
public static void main(String[] args)
{
	AbstractB b=new AbstractB ();
	b.callme();
	b.normal();
}
}
