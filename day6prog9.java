import java.util.Scanner;
class Break2
{
public static void main(String args[])
{
int i,j=0;
for(i=0;i<3;i++){
System.out.println("\n");
	for(j=0;j<5;j++){
	if(j%2==1)continue;
	System.out.print("i="+i+"j="+j);
	}
}
}}

