class Student{
int rollno;
String name,course;
float fee;
Student(int rollno,String name,String course){
this.rollno=rollno;
this.name=name;
this.course=course;
}
Student(int rollno,String name,String course,float fee){
this(rollno,name,course);
this.fee=fee;
}
void display(){System.out.println(rollno+" "+name+" "+fee);}
}
class TestThis7{
public static void main(String args[]){
Student s1=new Student(580,"navya","java");
Student s2=new Student(578,"latha","java",6000f);
s1.display();
s2.display();
}
}
