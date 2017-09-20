class NestTry 
{
	public static void main(String[] args) 
	{
		try
		{
			int a=args.length;
			int b=42/a;
			//System.out.println("a="+a);
			try
			{
				if(a==2)
				{
					int c[]=new int[1];
					c[42]=99;
				}
			}catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Array Index Exception Caught here:");
			}
		}catch(ArithmeticException e)
		{
			System.out.println("Divide By Zero: "+e);
		}
	}
}
