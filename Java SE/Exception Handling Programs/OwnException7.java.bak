class MyException extends Exception
{  
	private int b;
	MyException(int bal,String msg)
	{
		this.b=bal;
		System.out.println("Balance: "+b);
		System.out.println(msg);
	}
}
public class  OwnException7
{
	
	public static void main(String args[])
	{
		int bal=10;
		try
		{
			if(bal<1000)
		{
			System.out.println("Sorry! insufficient Balance");
			throw new MyException(bal,"Prograam Termenated Due To Low Balance");
		}
		else
		{
			System.out.println("Bance is :"+bal);
		}

			
		}
		catch(MyException e)
		{
			System.out.println("MyException caught:"+e);
		}
	}
}