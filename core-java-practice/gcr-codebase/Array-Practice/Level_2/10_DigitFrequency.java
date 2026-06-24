import java.util.*;
class DigitFrequency{
 public static void main(String[] a){
  String n=new Scanner(System.in).next();
  int f[]=new int[10];
  for(char c:n.toCharArray())f[c-'0']++;
  for(int i=0;i<10;i++)
   if(f[i]>0)System.out.println(i+"="+f[i]);
 }
}