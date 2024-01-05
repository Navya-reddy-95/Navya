import java.util.Scanner;
class Test{


public static void main(String args[]){
Scanner scob=new Scanner(System.in);
char c=scob.next().charAt(0);

if(c>='A'&&c<='Z'||c>='a'&&c<='z')
System.out.println("ALPHABET");

if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
System.out.println("NO");
if(c==0||c>=9)
System.out.println("NO");
else
System.out.println("YES");
}
}



