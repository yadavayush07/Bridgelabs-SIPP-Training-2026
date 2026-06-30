import java.util.*;
class StudentGrade{
 public static void main(String[] a){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  for(int i=0;i<n;i++){
   double p=sc.nextDouble(),c=sc.nextDouble(),m=sc.nextDouble();
   double per=(p+c+m)/3;
   char g=per>=90?'A':per>=75?'B':per>=60?'C':per>=40?'D':'F';
   System.out.println(per+" "+g);
  }
 }
}