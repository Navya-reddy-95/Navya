class Student{
private int id;
private String name;
public void setId(int id){this.id=id;}
public void setName(String name){this.name=name;}
public int getId(){ return this.id;}
public String getName(){ return this.name;}
}
class program{
public static void main(String args[]){
Student [] ob=new Student[3];
ob[0]=new Student();
ob[0].setId(1111);
ob[0].setName("test");
System.out.println("ID:"+ob[0].getId());
System.out.println("Name:"+ob[0].getName());
Student ob2=new Student();
ob[1]=new Student();
ob[1].setId(26026);
ob[1].setName("suchi");
System.out.println("ID:"+ob[1].getId());
System.out.println("Name:"+ob[1].getName());
Student ob3=new Student();
ob[2]=new Student();
ob[2].setId(26194);
ob[2].setName("jan");
System.out.println("ID:"+ob[2].getId());
System.out.println("Name:"+ob[2].getName());

 
}
}