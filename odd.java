import java.io.*;
import java.util.*;
public class Main
{
public static void main(String args[])throws IOException
{
Scanner sc=new Scanner(System.in);
int num;
System.out.println("Enter the number");
num=sc.nextInt();
if(num%2==0)
{
System.out.println("even");
else
System.out.println("odd");
}
}
}
