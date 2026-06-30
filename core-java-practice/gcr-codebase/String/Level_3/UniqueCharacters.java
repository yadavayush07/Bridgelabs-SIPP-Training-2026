import java.util.*;
class UniqueCharacters{
 public static void main(String[] a){
  String s=new Scanner(System.in).nextLine();
  for(int i=0;i<s.length();i++){
   boolean f=true;
   for(int j=0;j<i;j++)
    if(s.charAt(i)==s.charAt(j))f=false;
   if(f)System.out.print(s.charAt(i)+" ");
  }
 }
}