import java.util.*;
import java.lang.*;
class sweets
{
 void laddu(int a,int b)
{
 System.out.println("cost of laddu is:-"+ (a*b));
}
void jilebi(int g,int h)
{
 System.out.println("cost of jilebi is:-"+ (g*h));
}
}

class choco
{
 void candy(int i,int j)
 {
  System.out.println("cost of candy is:-"+ (i*j));
 
 }
}
class maven
{
 public static void main(String abs[])
{
 sweets a=new sweets();
 int c,d;
Scanner s=new Scanner(System.in); 
System.out.println("enter the weight of laddu in kg");
c=s.nextInt();
System.out.println("enter the cost of laddu per kg in rupees");
d=s.nextInt();
a.laddu(c,d);

int e,f;
System.out.println("enter the weight of jilebi in kg");
e=s.nextInt();
System.out.println("enter the cost of jilebi per kg in rupees");
f=s.nextInt();
a.jilebi(e,f);

int sa,df;
System.out.println("enter the weight of candy in kg");
sa=s.nextInt();
System.out.println("enter the cost of candy per kg in rupees");
df=s.nextInt();
a.jilebi(sa,df);

}
}
