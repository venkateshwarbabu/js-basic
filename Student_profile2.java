import java.util.*;
class Student_profile2
{
String student_id;
String name;
int marks;
String address;


public void getdata()
{

Scanner input=new Scanner(System.in);


System.out.println("student_id");
student_id=input.nextLine();



System.out.println("name");
name=input.nextLine();




System.out.println("marks");
marks=input.nextInt();



System.out.println("address");
address=input.nextLine();
}

public void display()

{

System.out.println("student_id:"+student_id);
System.out.println("student_name:"+name);
System.out.println("student_marks:"+marks);
System.out.println("student_address:"+address);

}
public static void main(String args[]) 
{


Student_profile2 sp=new Student_profile2();
int n,i;
Scanner ip=new Scanner(System.in);
System.out.println("enter the n of students details:");
n=ip.nextInt();
for(i=0;i<n;i++)
sp.getdata();
for(i=0;i<n;i++)

sp.display();

}
}
