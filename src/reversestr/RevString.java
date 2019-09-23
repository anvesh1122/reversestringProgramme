package reversestr;

public class RevString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String s="ANVESH";
 System.out.println(s);
 int length=s.length();
 String reverse1="  ";

for(int i=length-1;i>=0;i--)

{
reverse1=reverse1+s.charAt(i);

System.out.println(""+reverse1);
}
}
}