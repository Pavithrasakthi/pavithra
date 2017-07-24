import java.io.*;
import java.util.*;
pubilc void Main
{
public static void main(String args[])throws IOException
{
Scanner sc=new Scanner(System.in);
int yr;
System.out.println("Enter yr");
yr=sc.nextLine();
if((yr%4==0) &&(yr%100!==0))
{
System.out.println("leap yr");
}
else if(yr%100==0)
{
System.out.println("not leap yr");
}
else if(yr%4==0)
{
System.out.println("leap yr");
}
else
{
System.out.println("not leap yr");
}
}
}
