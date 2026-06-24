import java.util.*;
class FirstNonRepeating{
 public static void main(String[] a){
  String s=new Scanner(System.in).nextLine();
  int[] f=new int[256];
  for(char c:s.toCharArray())f[c]++;
  for(char c:s.toCharArray())
   if(f[c]==1){System.out.println(c);break;}
 }
}