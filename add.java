import java.io.*;
import java.util.*;
class Addition{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("the value of num1 is:");
int num1=sc.nextInt();
System.out.println("the value of num2 is:");
int num2=sc.nextInt();
int sum;
//initializing variables
sum=num1+num2;
System.out.println(num1+"+"+num2+"="+sum);
}
}