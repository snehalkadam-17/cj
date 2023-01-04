
class parent1
{
String name;
}
public class Child1 extends parent1{
	String name;
	public void details() {
	super.name="parent";//refers to parent class member
	name="child";
	}
	public static void main (String args[])
	{
		Child1 cobj=new Child1();
		cobj.details();
	}
}
