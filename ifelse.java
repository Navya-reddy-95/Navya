import java.util.Scanner;
class Example
{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);

int i=scob.nextInt();
int j=scob.nextInt();

if(j==0)
System.out.println("Division by error");
else 
System.out.println(i+" divided by "+j+" is "+(i/j));
i = i+j;
}
}