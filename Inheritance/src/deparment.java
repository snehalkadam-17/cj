class employee{
	protected
	int eid;
	String ename;
	public
	employee(int i,String n)
	{
		this.eid=i;
		this.ename=n;
	}
}
public class deparment extends employee
{
protected
String dname;
double salary;
deparment(int i,String n,String d,double s)
{
	super(i,n);
	this.dname=d;
	this.salary=s;
}
public void show()
{
	System.out.println("eid="+eid+" ename="+ename+" deparmentname="+dname+" salary="+salary);
}
public static void main(String args[]) {
	deparment d1=new deparment (1,"john","computer",45000);
	d1.show();
}
}
