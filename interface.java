interface A{
void a();
void b();
void c();
void d();
}
abstract class B implements A{
public void c()
{
System.out.println("iam c");}
}
class M extends B{
public void a()			{System.out.println("iam a");}
public void b()			{System.out.println("iam b");}
public void d()			{System.out.println("iam d");}
}
class Test{
public static void main(String args[]){
A a=new M();
a.a();	a.b();  a.c();
a.d();
}
}