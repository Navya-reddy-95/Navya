import java.util.Scanner;
class PalindromeNum{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n;
int rd=0;
System.out.print("enter any positive integer");
n=sc.nextInt();
int num=n;
while(n>0){
rd=rd*10+(n%10);
n=n/10;
}
if(num==rd)
{System.out.println("palindrome");}
else
{
System.out.println("not palindrome");}
}
}