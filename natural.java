import java.io.*;
import java.util.*;
public class Main
{
public static void main(String args[])throws IOException
{
Scanner sc=new Scanner(System.in);
int x,i=1;,sum=0;
System.out.println("Enter number items");
x=sc.nextLine();
while(i<=x)
{
sum=sum+i;
i++;
}
System.out.println("sum of"+x+"number is":sum);
}
}
