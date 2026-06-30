import java.util.*;
class Main{
 static int len(String s){
  int c=0;
  try{while(true){s.charAt(c);c++;}}
  catch(Exception e){}
  return c;
 }
 public static void main(String[] a){
  Scanner sc=new Scanner(System.in);
  String s=sc.next();
  System.out.println(len(s));
  System.out.println(s.length());
 }
}