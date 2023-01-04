class Bank
{
	public 
	float getrateofintrest()
	{
		return 0;
	}
}

	class SBI extends Bank
	{
		public float getrateofintrest()
		{
			return 8.4f;
		}
	}
	class ICICI extends Bank
	{
		public float getrateofintrest()
		{
			return 7.4f;
		}
	}
	class AXIS extends Bank
	{
		public float getrateofintrest()
		{
			return 9.7f;
		}
	}



public class upcasting {
	public static void main(String [] args)
	{
		Bank b;
		b=new SBI();
		System.out.println("SBI rate of intrest="+b.getrateofintrest());
		
		b=new ICICI();
		System.out.println("ICICI rate of intrest="+b.getrateofintrest());
		
		b=new AXIS();
		System.out.println("AXIS rate of intrest="+b.getrateofintrest());


		
	}

}
