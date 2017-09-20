import java.io.*;
class DaIOStrEx2
{
	public static void main(String[] args) throws Exception
	{
		FileOutputStream fos=new FileOutputStream("Primitive.dat");
		DataOutputStream dos=new DataOutputStream(fos);
		dos.writeBoolean(true);
		dos.writeChar('A');
		dos.writeShort(Short.MIN_VALUE);
		dos.writeByte(Byte.MAX_VALUE);
		dos.writeInt(Integer.MAX_VALUE);
		dos.writeLong(Long.MIN_VALUE);
		dos.close();
		FileInputStream fin=new FileInputStream("Primitive.dat");
		DataInputStream dis=new DataInputStream(fin);
		 boolean v=dis.readBoolean();
		 char c=dis.readChar();
		 short s=dis.readShort();
		  byte b=dis.readByte();
		 int i=dis.readInt();
		 long l=dis.readLong();
		dis.close();
		System.out.println(v);
		System.out.println(c);
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
	}
}