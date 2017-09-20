class MyException extends Exception
{
	MyException()
	{
		super();
	}

	public String toString()
	{
		return "You have an exception..";
	}
};

class  MyExceptionDemo2
{
	public static void main(String[] args) 
	{
		int a = args.length;
		try
		{
			if(a>2 && a<5)
			{
				throw new MyException();
			}
				System.out.println("No exception..");


		}
		catch (MyException e)
		{
			System.out.println(e);
		}
		System.out.println("Hello World!");
	}
}
