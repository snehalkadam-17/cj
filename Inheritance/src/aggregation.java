class Author
{
	String authorname;
	int age;
	String place;
	public
	Author(String n,int a,String p)
	{
		this.authorname=n;
		this.age=a;
		this.place=p;
	}
	public String getAuthorname()
	{
		return authorname;
	}
	public int getage()
	{
		return age;
	}
	public String getplace()
	{
		return place;
	}
}
class book
{
	String bname;
	int price;
	Author at;
	public
	book(String b,int p,Author auth)
	{
		this.bname=b;
		this.price=p;
		this.at=auth;
	}
	public void showDetails()
	{
		System.out.println("book name="+bname);
		System.out.println("book price="+price);
		System.out.println("book name="+at.getAuthorname());
		System.out.println("book age="+at.getage());
		System.out.println("book place="+at.getplace());
		
	}
}
public class aggregation {
public static void main(String args[]) {
	Author auth=new Author("james Golasing",23,"uk");
	book b=new book("java",550,auth);
	b.showDetails();
			
}
}


