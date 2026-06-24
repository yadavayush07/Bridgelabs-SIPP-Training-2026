import java.util.*;
class Main{
 public static void main(String[] a){
  Random r=new Random();
  System.out.println("Age\tVote");
  for(int i=1;i<=10;i++){
   int age=r.nextInt(90)+1;
   System.out.println(age+"\t"+(age>=18));
  }
 }
}