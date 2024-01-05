import java.util.*;
public class AsciiValue{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter a character");
char ch=sc.next().charAt(0);
int value=ch; 
System.out.println("the character is "+ch+"and ascii value is:"+value);
}
}