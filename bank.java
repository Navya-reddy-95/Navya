abstract class Bank{
abstract int getRateOfInterest();
}
class SBI extends Bank{
int getRateOfInterest(){return 7;}
}
class PNB extends Bank{
int getRateOfInterest(){return 8;}
}
class S extends Bank{
int getRateOfInterest(){return 9;}
}
class ICICI extends Bank{
int getRateOfInterest(){return 10;}
}
class TestBank{
public static void main(String args[]){
Bank b;
b=new SBI();
System.out.println("rate of interest is:"+b.getRateOfInterest()+"%");
b=new PNB();
System.out.println("rate of ineterest is:"+b.getRateOfInterest()+"%");
b=new S();
System.out.println("rate of ineterest is:"+b.getRateOfInterest()+"%");
b=new ICICI();
System.out.println("rate of ineterest is:"+b.getRateOfInterest()+"%");
}
}