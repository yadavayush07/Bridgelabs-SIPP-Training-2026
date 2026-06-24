import java.util.*;
class LargestDigit{
 public static void main(String[] a){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt(),m=0,s=0;
  while(n>0){
   int d=n%10;
   if(d>m){s=m;m=d;}
   else if(d>s&&d!=m)s=d;
   n/=10;
  }
  System.out.println("Largest="+m);
  System.out.println("Second="+s);
 }
}