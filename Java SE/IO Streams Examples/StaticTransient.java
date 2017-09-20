import java.io.*;
public class StaticTransient implements Serializable
{
	static transient int i=20;
	int j=40;
	public static void main(String[] args) throws Exception
	{
		FileOutputStream fos=new FileOutputStream("a.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		StaticTransient ob=new StaticTransient();
		oos.writeObject(ob);
		FileInputStream fis=new FileInputStream("a.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		StaticTransient current=(StaticTransient)ois.readObject();
		System.out.println("Transient Data\t"+current.i);
		System.out.println("Non Transient Data\t"+current.j);
	}
}