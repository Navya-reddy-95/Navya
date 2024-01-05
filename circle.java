class Circle{
int radius;
void insert(int r){
radius=r;
}
void calculateArea()
{
System.out.println(2*3.14*radius);
}
}
class TestCircle1{
public static void main(String args[]){
Circle r1=new Circle();

r1.insert(12);
r1.calculateArea();
}
}