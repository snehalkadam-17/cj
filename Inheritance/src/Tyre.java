interface Moveable
{
	boolean isMoveable();
}
interface Rollable
{
	boolean isRollable();
}
public class Tyre implements Moveable,Rollable
{
public boolean isMoveable()
{
	return true;
}
public boolean isRollable()
{
	return true;
}
public static void main (String args[])
{
	Tyre tr=new Tyre();
	System.out.println(tr.isMoveable());
	System.out.println(tr.isRollable());
}
}
