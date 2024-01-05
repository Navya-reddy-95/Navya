import java.util.Scanner;
class ArithmeticOperators{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the value of num1:");
double num1=sc.nextDouble();
System.out.println("enter the value of num2:");
double num2=sc.nextDouble();

double sum=num1+num2;
double difference=num1-num2;
double product=num1*num2;
double div=num1/num2;
double queotient=num1%num2;
if(num2==0)
{
System.out.println("zero is invalid");
double num=sc.nextDouble();
}
else
{
System.out.println("the sum of two numbers is:"+sum);
System.out.println("the difference of two numbers is:"+difference);
System.out.println("the product of two numbers is:"+product);
System.out.println("the div of two numbers is:"+div);
System.out.println("the queotient of two numbers is:"+queotient);
}
}
}