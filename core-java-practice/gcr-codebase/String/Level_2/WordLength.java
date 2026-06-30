import java.util.*;
class Main{
 public static void main(String[] a){
  Scanner sc=new Scanner(System.in);
  String[] w=sc.nextLine().split(" ");
  for(String x:w)
   System.out.println(x+"\t"+x.length());
 }
}