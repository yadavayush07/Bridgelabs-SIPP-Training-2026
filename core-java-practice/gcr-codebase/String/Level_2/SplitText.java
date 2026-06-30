import java.util.*;
class Main{
 public static void main(String[] a){
  Scanner sc=new Scanner(System.in);
  String s=sc.nextLine(),w="";
  ArrayList<String> l=new ArrayList<>();
  for(int i=0;i<=s.length();i++)
   if(i==s.length()||s.charAt(i)==' '){l.add(w);w="";}
   else w+=s.charAt(i);
  System.out.println(Arrays.equals(l.toArray(),s.split(" ")));
 }
}