import java.io.*;
import java.util.*;
class Diff{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num1=sc.nextInt();
int num2=sc.nextInt();
int diff;
if (num1>num2)
diff=num1-num2;
else
diff=num2-num1;
System.out.println(diff);
}
}