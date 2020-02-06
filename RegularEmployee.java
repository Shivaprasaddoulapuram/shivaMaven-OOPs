/*3. Write an application to create a super class Employee with information first name
& last name and methods getFirstName(), getLastName() derive the sub-classes
ContractEmployee and RegularEmployee with the information about department,
designation & method designation & method displayFullName(), getDepartment(), getDesig() to print the
salary and to set department name & designation of the corresponding sub-class
objects respectively*/
import java.util.*;
import java.lang.*;
class Employee
{
 String first_name,last_name;
 String first_name1,last_name1;
 void getFirstName(String fi,String fi1)
 {
  first_name=fi;
  first_name1=fi1;
//  System.out.println("fullname is :"+first_name1);
 }
 void getLastName(String la,String la1)
 {
  last_name=la;
  last_name1=la1;
//System.out.println("fullname is :"+last_name1);
 }
}
class ContractEmployee extends Employee
{
 String department,designation,salary;
 void displayFullName()
 {
  System.out.println("fullname is :"+super.first_name+" "+super.last_name);
 }
 void getDepartment(String dep)
 {department=dep;
  System.out.println("department is :"+department);
 }
 void getDesig(String des,String sal)
{designation=des;
 salary=sal;
 System.out.println("designation is ;"+designation+"\n"+"salary is :"+salary);
}
}


class RegularEmployee extends Employee
{
 String department,designation,salary;
void displayFullName()
 {
  System.out.println("fullname is :"+super.first_name1+" "+super.last_name1);
 }

 void getDepartment(String dep)
 {
  department=dep;
  System.out.println("department is :"+department);
 }
 void getDesig(String des,String sal)
{
 designation=des;
 salary=sal;
 System.out.println("designation is ;"+designation+"\n"+"salary is :"+salary);
}

public static void main(String args[])
{
 Scanner s=new Scanner(System.in);
 //Employee a=new Employee();
ContractEmployee f=new ContractEmployee();
 System.out.println("enter Contractemployee first name ");
 String a=s.nextLine();
  System.out.println("enter Contractemployee last name ");
 String c=s.nextLine();

 System.out.println("enter Regularemployee first name ");
 String b=s.nextLine();
  System.out.println("enter Regularemployee last name ");
 String d=s.nextLine();

 f.getFirstName(a,b);
 f.getLastName(c,d);

System.out.println("Contract employee dept ");
String departme=s.nextLine();

System.out.println("Contract employee designation ");
String designati=s.nextLine();

System.out.println("Contract employee salary ");
String sala=s.nextLine();


RegularEmployee e=new RegularEmployee();
System.out.println("RegularEmployee  dept ");
String departmen=s.nextLine();

System.out.println("RegularEmployee designation ");
String designatio=s.nextLine();

System.out.println("RegularEmployee salary ");
String salar=s.nextLine();


System.out.println("Contract employee details are");
f.displayFullName();
f.getDepartment(departme);
f.getDesig(designati,sala);

System.out.println("Regular employee details are");
e.displayFullName();
e.getDepartment(departmen);
e.getDesig(designatio,salar);
}
}
