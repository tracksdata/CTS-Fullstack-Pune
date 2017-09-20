import java.io.*;
class RandomAccessFileDemo 
{
	public static void main(String[] args) 
	{
			RandomAccessFile randfile;
			try
		{
				randfile=new RandomAccessFile("raf.dat","rw");
				randfile.writeInt(100);
				randfile.writeDouble(23400.5678);
				randfile.writeBoolean(true);
				randfile.writeChar('A');
				randfile.seek(0);
				System.out.println(randfile.readInt());
				System.out.println(randfile.readDouble());
				System.out.println(randfile.readBoolean());
				System.out.println(randfile.readChar());
				randfile.seek(3);
				System.out.println(randfile.readBoolean());
				randfile.close();
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
