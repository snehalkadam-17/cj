interface Movable
{
int avg_speed=40;
public void move();
}
public class interfacevehical implements Movable
{
public void move()
{
	System.out.println("avg speed is="+avg_speed);
}
public static void main(String[] args)
{
	interfacevehical i=new interfacevehical();
	i.move();
}

}
