interface rectangle
{
	boolean isrectangle();
}
interface circle 
{
	boolean iscircle();
}
public class reactangleCircle implements rectangle,circle
{
public boolean isrectangle()
{
	int l=2,b=4,area;
	double rc;
	area=l*b;
	System.out.println("area of circle\n"+area);
	return true;
}
public boolean iscircle()
{
	int r=4,area;
	double pi=3.14;
	area=(int)(3.14*r*r);
	System.out.println("area of rectangle\n"+area);
	return true;
}
public static void main (String args[])
{
	reactangleCircle rc=new reactangleCircle();
	
	System.out.println(rc.isrectangle());
	System.out.println(rc.iscircle());
}
}
