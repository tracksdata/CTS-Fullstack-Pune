/* This type of Exception occurs when we try to
accessing a value with negative index value
This is a runtime Exception*/

public class NegativeArray 
{
public static void main(String[] args)
	{
	try
		{
		int a[]=new int[-10];
		for(int i=0;i<10;i++)
		a[-i]=i;
		}
	catch(NegativeArraySizeException nase)
		{
		System.out.println("Array subscript should not be negative");
		}
	}
}