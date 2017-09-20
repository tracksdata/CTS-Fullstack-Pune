import java.io.*
;
class CreateDirs
{
  public static void main(String args[])  throws Exception
{
  File f=new File("D:/XYZ/ABC/HYD");
if(f.mkdirs())
   System.out.println("Yes! DIR structure  created");
else
  System.out.println("Dir structure  can't be created");
 }
}
