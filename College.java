class Student1{
int rollno;
String name;
static String college="Mtiet";
static void change(){
college="Reddy";
}
Student1(int r,String n){
rollno=r;
name=n;
}
void display(){System.out.println(rollno+" "+name+" "+college);}
}
public class College{
public static void main(String args[]){
Student1 s1=new Student1(580,"navya");
Student1 s2=new Student1(593,"yamuan");
Student1.change();
Student1 s3=new Student1(590,"neha");
s1.display();
s2.display();
s3.display();
}
}

