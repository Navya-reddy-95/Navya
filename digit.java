import java.util.Scanner;
class Test{


public static void main(String args[]){
Scanner scob=new Scanner(System.in);
char c=scob.next().charAt(0);

if(c>='A'&&c<='Z'||c>='a'&&c<='z'||c=='+'||c=='-'||c=='%'||c=='*')
System.out.println("no");
else
if(c>=0||c<=9)
System.out.println("yes");

}
}