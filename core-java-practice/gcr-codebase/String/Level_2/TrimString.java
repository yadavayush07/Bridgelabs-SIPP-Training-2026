import java.util.*;
class Main{
 static String trim(String s){
  int i=0,j=s.length()-1;
  while(s.charAt(i)==' ')i++;
  while(s.charAt(j)==' ')j--;
  return s.substring(i,j+1);
 }
 public static void main(String[] a){
  Scanner sc=new Scanner(System.in);
  String s=sc.nextLine();
  System.out.println(trim(s).equals(s.trim()));
 }
}