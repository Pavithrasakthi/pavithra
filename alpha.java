import java.io.*;
import java.util.*;
public class Main
{
public static void main(String args[])throws IOexception
{
Scanner sc=new Scanner(System.in);
char c;
System.out.println("Enter item");
c=sc.nextLine();
if(c>='a' && c<='z' ||c>='A' && c<='Z')
{
System.out.println(c+"is vowel");
}
else
{
System.out.println(c+"is not vowel");
}
}
}

