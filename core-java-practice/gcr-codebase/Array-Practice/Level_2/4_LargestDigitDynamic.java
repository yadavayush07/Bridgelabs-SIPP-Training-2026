import java.util.*;
class LargestDigitDynamic{
 public static void main(String[] a){
  String n=new Scanner(System.in).next();
  int m=0,s=0;
  for(char c:n.toCharArray()){
   int d=c-'0';
   if(d>m){s=m;m=d;}
   else if(d>s&&d!=m)s=d;
  }
  System.out.println(m+" "+s);
 }
}