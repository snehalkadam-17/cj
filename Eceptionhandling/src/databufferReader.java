import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class databufferReader {
public static void main(String args[])throws IOException
{
	String text;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("enter character=");
    char c=(char)br.read();
    BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("enter String=");
    text=br1.readLine();
    System.out.println("text="+text);
}
}
