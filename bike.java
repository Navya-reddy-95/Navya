class Bike1{
final void run(){System.out.println("running");}
}
class Honda  extends Bike1{
void run(){System.out.println("running safely with 100kmph");}
public static void main(String args[]){
Honda obh=new Honda();
obh.run();
}
}