import java.util.*;
public class Main{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n;
System.out.println("Enter the number");
n=sc.nextInt();
if(n%2==0)
{
System.out.println("Even\n");
System.out.println(n+"is even\n");
}
else
{
System.out.println("odd\n");
System.out.println(n+"is odd\n");
}
}
}