import java.util.*;
class PalindromeCheck{
 public static void main(String[] a){
  String s=new Scanner(System.in).nextLine();
  boolean p=true;
  for(int i=0,j=s.length()-1;i<j;i++,j--)
   if(s.charAt(i)!=s.charAt(j))p=false;
  System.out.println(p);
 }
}