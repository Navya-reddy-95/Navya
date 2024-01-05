import java.util.Scanner;
class Array{
public static void main(String args[])
{
int n,x,flag=0,i=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter no.of elements you want in array:");
n=sc.nextInt();
int a[]=new int[n];
System.out.println("enter all the elements:");
for(i=0;i<n;i++) 
{	a[i]=sc.nextInt();	}
System.out.print("enter the element you want to find:");
x=sc.nextInt();
for(i=0;i<n;i++)
{	if(a[i]==x) 	{flag=1; break; }	}
if(flag==1)
{ System.out.println("element found at position:"+(i)); }
else
{ System.out.println("entered element not found"); }
}
}