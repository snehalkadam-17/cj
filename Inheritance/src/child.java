class parent
{
	public void p1()
	{
		System.out.println("it is parent class");
	}
}
public class child extends parent
{
public void c1()
{
	System.out.println("it is child class");
}
public static void main(String args[])
{
	child cobj=new child();
	cobj.p1();
	cobj.c1();
}
}
