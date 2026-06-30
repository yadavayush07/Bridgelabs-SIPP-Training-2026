import java.util.*;
class Main{
 public static void main(String[] a){
  Scanner sc=new Scanner(System.in);
  String s=sc.nextLine().toLowerCase();
  for(char ch:s.toCharArray())
   if(ch>='a'&&ch<='z')
    System.out.println(ch+" : "+("aeiou".indexOf(ch)>=0?"Vowel":"Consonant"));
   else
    System.out.println(ch+" : Not Letter");
 }
}