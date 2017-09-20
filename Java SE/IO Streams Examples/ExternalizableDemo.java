// Simple use of Externalizable
import java.io.*;
import java.util.*;
class Blip1 implements Externalizable
{
public Blip1()
{
System.out.println("Blip1 Constructor");
}
public void writeExternal(ObjectOutput out)
throws IOException
{
System.out.println("Blip1.writeExternal");
}
public void readExternal(ObjectInput in)
throws IOException, ClassNotFoundException
{
System.out.println("Blip1.readExternal");
}
}
class Blip2 implements Externalizable
{
Blip2()
{
System.out.println("Blip2 Constructor");
}
public void writeExternal(ObjectOutput out)
throws IOException
{
System.out.println("Blip2.writeExternal");
}
public void readExternal(ObjectInput in)
throws IOException, ClassNotFoundException
{
System.out.println("Blip2.readExternal");
}
}
public class ExternalizableDemo
{
public static void main(String[] args)
{
System.out.println("Constructing objects:");
Blip1 b1 = new Blip1();
Blip2 b2 = new Blip2();
try {
ObjectOutputStream o =new ObjectOutputStream(
new FileOutputStream("Blips.out"));
System.out.println("Saving objects:");
o.writeObject(b1);
o.writeObject(b2);
o.close();
// Now get them back:
ObjectInputStream in =new ObjectInputStream(
new FileInputStream("Blips.out"));
System.out.println("Recovering b1:");
b1 = (Blip1)in.readObject();
//! System.out.println("Recovering b2:");
//! b2 = (Blip2)in.readObject();
} catch(Exception e)
{
e.printStackTrace();
}
}
} ///:~