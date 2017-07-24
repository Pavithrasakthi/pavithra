import java.io.*;
import java.util.*;
public class positive or negative
{
public static void main(String args[])throws IOException
{
int n;
Scanner sc=new Scanner(System.in);
System.out.println("enter the value you want to search");
n=sc.nextInt();
if(n>0)
{
System.out.println("positive");
}
else if(n<0)
{
System.out.println("negative");
}
else
{
System.out.println("zero");
}
}
}



