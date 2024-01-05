import java.util.Scanner;
public class Relational{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
System.out.println("enter the  first number:");
int num1=scan.nextInt();
System.out.println("enter the second number:");
int num2=scan.nextInt();
System.out.println("enter the third number:");
int num3=scan.nextInt();
System.out.println("the largest number is:");
if((num1>num2)&&(num1>num3))
return num1;
if(num2>num3)
return num2;
if(num3>num2)
return num3;
else
{
System.out.println("smallest number is :");
if((num1<num2)&&(num1<num3))
return num1;
if(num2<num3)
return num2;
if(num3<num2)
return num3;
}
}
}

