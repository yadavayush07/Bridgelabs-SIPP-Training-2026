import java.util.*;
class ReverseNumber{
 public static void main(String[] a){
  int n=new Scanner(System.in).nextInt();
  while(n>0){
   System.out.print(n%10);
   n/=10;
  }
 }
}