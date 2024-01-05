class Employee{
int id;
String ename;
String edept;
void insertRecord(int r,String n,String d){
id=r;
ename=n;
edept=d;
}
void displayInformation(){System.out.println(id+""+ename+""+edept);}
}
class TestEmployee2{
public static void main(String args[]){
Employee e1=new Employee();
Employee e2=new Employee();
Employee e3=new Employee();
e1.insertRecord(1111,"navya","tcs");
e2.insertRecord(222,"navya","ds");
e3.insertRecord(333,"laya","aids");
e1.displayInformation();
e2.displayInformation();
e3.displayInformation();
}
}