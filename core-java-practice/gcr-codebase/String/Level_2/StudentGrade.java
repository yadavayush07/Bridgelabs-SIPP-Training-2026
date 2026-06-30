import java.util.*;
class Main{
 public static void main(String[] a){
  Random r=new Random();
  for(int i=1;i<=5;i++){
   int p=r.nextInt(100),c=r.nextInt(100),m=r.nextInt(100);
   double per=(p+c+m)/3.0;
   char g=per>=90?'A':per>=75?'B':per>=60?'C':per>=40?'D':'F';
   System.out.println(p+" "+c+" "+m+"  "+per+"%  "+g);
  }
 }
}