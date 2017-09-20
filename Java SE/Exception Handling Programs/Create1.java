import java.io.*;
class Create1
{
public static void main(String[] args) throws IOException
{
// attach keyboard to dataInputStream
DataInputStream dis=new DataInputStream(System.in);
// attach my file to FileOutputStream
FileOutputStream fout=new
FileOutputStream("myfile",true);
BufferedOutputStream bout=new
BufferedOutputStream(fout,1024);
// read data from dis & write into fout
char ch;
System.out.println("Enter data(@ at end):");
while((ch=(char)dis.read( ))!='@')
bout.write(ch);
// close the file
bout.close( );
}
}