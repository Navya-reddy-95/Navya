import java.util.Scanner;
class prog
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n1=sc.nextInt();
int n2=sc.nextInt();
try{
int n3=(int)n1/n2;
System.out.println(n1+"/"+n2+"="+n3);
}
catch(Exception e){
System.out.println(e);
System.out.println("we learnt exception");
}
finally{
System.out.println("finally block is executed");
}
System.out.println("thank you");
}
}