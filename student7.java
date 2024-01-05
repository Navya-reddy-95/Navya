class Student5{
int id;
String name;
Student5(int i,String n){
id=i;
name=n;
}
Student5(){}
id=s.id;
name=s.name;
}
void display(){System.out.println(id+" "+name);}
public static void main(String args[]){
Student5 s1=new Student5(111,"navya");
Student5 s2=new Student5();
s2.id=s1.id;
s2.name=s1.name;
s1.display();
s2.display();
}
}
