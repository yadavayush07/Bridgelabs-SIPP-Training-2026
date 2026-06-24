import java.util.*;
class AnagramCheck{
 public static void main(String[] a){
  Scanner sc=new Scanner(System.in);
  String s1=sc.next(),s2=sc.next();
  int[] f=new int[256];
  for(char c:s1.toCharArray())f[c]++;
  for(char c:s2.toCharArray())f[c]--;
  boolean ok=true;
  for(int x:f)if(x!=0)ok=false;
  System.out.println(ok);
 }
}