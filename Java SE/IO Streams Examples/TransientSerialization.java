import java.io.*;
public class TransientSerialization
{
	public static void main(String[] args)throws Exception 
	{
	
			MyClass object1=new MyClass("Hello",10);
			System.out.println("Object1:"+object1);
			FileOutputStream fos=new FileOutputStream("Serial.dat");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(object1);
			oos.flush();
			oos.close();

			MyClass object2;
			FileInputStream fis=new FileInputStream("Serial.dat");
			ObjectInputStream ois=new ObjectInputStream(fis);
			object2=(MyClass)ois.readObject();
			ois.close();
			System.out.println("Object2:"+object2);
	}
}
class MyClass implements Serializable
{
	String s;
	transient int i;
	public MyClass(String s,int i)
	{
		this.s=s;
		this.i=i;
	}
	public String toString()
	{
		return "s="+s+";i="+i;
	}
}
