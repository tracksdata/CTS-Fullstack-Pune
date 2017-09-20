// catching all type exception
class CatchAllType5 
{
	public static void main(String[] args) 
	{
		int a,b,c;
		a=10;
		b=0;
		try
		{
			c=a/b;
			System.out.println("This will never Execute:");
		}
		catch(Exception ae)
		{
			System.out.println("Exception caught : "+ae);
		}
	}
}