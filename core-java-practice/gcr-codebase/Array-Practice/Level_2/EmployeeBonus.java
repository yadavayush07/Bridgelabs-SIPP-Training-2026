import java.util.*;
class EmployeeBonus{
 public static void main(String[] a){
  Scanner sc=new Scanner(System.in);
  double tb=0,os=0,ns=0;
  for(int i=0;i<10;i++){
   double s=sc.nextDouble(),y=sc.nextDouble();
   double b=s*(y>5?0.05:0.02);
   tb+=b; os+=s; ns+=s+b;
  }
  System.out.println("Bonus="+tb);
  System.out.println("Old Salary="+os);
  System.out.println("New Salary="+ns);
 }
}