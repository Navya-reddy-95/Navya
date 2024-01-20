import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.util.Scanner;
class CharArray{
public static void main(String args[])throws Exception{
Scanner sc=new Scanner(System.in);
CharArrayWriter out=new CharArrayWriter();
out.write(sc.nextLine());
FileWriter f1=new FileWriter("c:\\fh\\a.txt");
FileWriter f2=new FileWriter("c:\\fh\\b.txt");
FileWriter f3=new FileWriter("c:\\fh\\c.txt");
FileWriter f4=new FileWriter("c:\\fh\\d.txt");
out.writeTo(f1);	out.writeTo(f2);
out.writeTo(f3);	out.writeTo(f4);
f1.close(); f2.close(); f3.close(); f4.close();
System.out.println("Success..");
}
}
