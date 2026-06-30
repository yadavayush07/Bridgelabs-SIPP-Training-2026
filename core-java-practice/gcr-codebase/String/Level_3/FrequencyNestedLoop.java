import java.util.*;
class UniqueCharFrequency{
 public static void main(String[] a){
  String s=new Scanner(System.in).nextLine();
  for(int i=0;i<s.length();i++){
   boolean f=true;
   for(int j=0;j<i;j++)
    if(s.charAt(i)==s.charAt(j))f=false;
   if(f){
    int c=0;
    for(int k=0;k<s.length();k++)
     if(s.charAt(i)==s.charAt(k))c++;
    System.out.println(s.charAt(i)+" "+c);
   }
  }
 }
}