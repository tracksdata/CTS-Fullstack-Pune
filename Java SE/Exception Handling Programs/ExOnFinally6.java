class ExOnFinally6 
{
	public void division()
	{
		int n1=10;
		int n2=0;
		try
		{
			System.out.println(n1+"/"+n2+"="+(n1/n2));
		}
/*	catch(Exception e)
		{
			System.out.println("Deal with:"+e);
		}*/
		finally
		{
			System.out.println("Finally Done");
		}
		System.out.println("Returning from division");
	}
	public static void main(String[] args) 
	{
		new ExOnFinally6().division();
		System.out.println("Returning from main");
	}
}
