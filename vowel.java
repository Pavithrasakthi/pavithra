import java.io.*;
import java.util.*;
public class Main
{
public static void main(String args[])throws IOException
{
Scanner sc=new Scanner(System.in);
char c;
System.out.println("Enter the alph");
c=sc.nextLine();
if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
{
System.out.println(c+"is vowel");
else
System.out.println(c+"is consonent");
}
}
}
