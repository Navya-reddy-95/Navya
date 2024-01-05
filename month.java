import java.io.*;
import java.util.*;
class Test{
static public void main(String args[])
		{
		Scanner sc=new Scanner(System.in);
		int inpVar=sc.nextInt();
		System.out.println(Test.printmonth(inpVar));
		}
public static String printmonth(int monthno){
		String month;
		switch(monthno){
		case 1:{month="january";break;}
		case 2:{month="february";break;}
		case 3:{month="march";break;}		
		case 4:{month="april";break;}
		case 5:{month="may";break;}
		case 6:{month="june";break;}
		case 7:{month="july";break;}
		case 8:{month="august";break;}
		case 9:{month="september";break;}
		case 10:{month="october";break;}
		case 11:{month="november";break;}
		case 12:{month="december";break;}
		default:month="INVALID";
		}//switch
		return month;
}
}