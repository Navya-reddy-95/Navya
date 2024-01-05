class Student{
int rollno;
String name;
static String college="mtie";
Student(int r,String n){
rollno=r;
name=n;
}
void display(){System.out.println(rollno+" "+name+" "+college);}
}
public class TestStaticVariable1{
public static void main(String args[]){
Student s1=new Student(580,"navya");
Student s2=new Student(598,"pallavi");
Student.college="MTIET";
s1.display();
s2.display();
}
} 