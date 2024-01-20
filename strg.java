import java.util.Scanner;
class CharAtExample{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String name=sc.next();
for(int i=0;i<=name.length()-1;i++){
if(i%2!=0){
System.out.println(Char at "+i+"place "+name.charAt(i));}
}
}
}