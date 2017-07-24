import java.io.*;
import java.util.*;
public class main
{
public static void main(String args[])throws IOException
{
Scanner sc=new Scanner(System.in);
int x=sc.nextLine;
int y=sc.nextLine;
int z=sc.nextLine;
if(x>y && x>z)
System.out.println("First is large");
else if(y>x && y>z)
System.out.println("Second is large");
else if(z>x && z>y)
System.out.println("Third is large");
else
System.out.println("not dist");
}
}
