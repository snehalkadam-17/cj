class base
{
	public void display()
	{
		System.out.println("it is base class");
	}
}
public class derivved extends base{
public void display() {
	super.display();
	System.out.println("it is derivied class");
}
public static void main(String args[])
{
	derivved d1=new derivved();
	
	d1.display();
}
}
