class Icard{
private String college_name;
private String college_address;
private int start;
private int end;
private int id;
private String student_name;
private String course_name;
private String aadhar_no;
public void setCollege_name(String college_name)
{this.college_name=college_name;}
public void setCollege_address(String college_address)
{this.college_address=college_address;}
public void setStart(int start)
{this.start=start;}
public void setEnd(int end)
{this.end=end;}
public void setId(int id)
{this.id=id;}
public void setStudent_name(String student_name)
{this.student_name=student_name;}
public void setCourse_name(String course)
{this.course_name=course_name;}
public void setAadhar_no(String aadhar_no)
{this.aadhar_no=aadhar_no;}
public void getCollegename(String college_name)
{return college_name;}
public void getCollege_address(String college_address)
{return college_address;}
public void getStart(int start)
{return start;}
public void getEnd(int end)
{return end;}
public void getId(int id)
{return id;}
public void getStudent_name(String student_name)
{return student_name;}
public void getCourse_name(String course_name)
{return course_name;}
public void getAadhar_no(String aadhar_no)
{return aadhar_no;}
}
class BCA{
public static void main (String args[]){
Icard ob=new Icard();
ob.setCollege_name("MOTHER THERESA ENGINEERING COLLEGE");
ob.setCollege_address("MELUMOI,PALAMANER,517408");
ob.setStart(2022);
ob.setEnd(2026);
ob.setId(27962);
ob.setStudent_name("navya");
ob.setCourse_name("CSE");
ob.setAadhar_no("9163 0844 3474");
System.out.println("college_name:"+ob.getCollege_name());
System.out.println("college_address:"+ob.getCollege_address());
System.out.println("start:"+ob.getStart());
System.out.println("end:"+ob.getEnd());
System.out.println("id:"+ob.getId());
System.out.println("student_name:"+ob.getStudent_name());
System.out.println("course_name:"+ob.getCourse_name());
System.out.println("aadhar_no:"+ob.getAadhar_no());
}
}