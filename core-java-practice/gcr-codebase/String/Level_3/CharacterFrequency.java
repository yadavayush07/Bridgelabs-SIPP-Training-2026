import java.util.*;
class CharacterFrequency{
 public static void main(String[] a){
  String s=new Scanner(System.in).nextLine();
  int[] f=new int[256];
  for(char c:s.toCharArray())f[c]++;
  for(int i=0;i<256;i++)
   if(f[i]>0)System.out.println((char)i+" "+f[i]);
 }
}