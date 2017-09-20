public class StringDemo{
	public static void main(String[] args){
		String s1,s2,s3;
		s1="Data";
		s2="Base";
		
System.out.println("Hash Code o s1: "+s1.hashCode());
System.out.println("Hash Code o s2: "+s2.hashCode());
s1=s1+s2;
System.out.println("S1: "+s1);
System.out.println("Hash Code o s1 Modified2: "+s1.hashCode());
	}
}
