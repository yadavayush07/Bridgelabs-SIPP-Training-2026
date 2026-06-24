import java.util.*;
class FizzBuzz{
 public static void main(String[] a){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  String arr[]=new String[n+1];
  for(int i=1;i<=n;i++)
   arr[i]=i%15==0?"FizzBuzz":i%3==0?"Fizz":i%5==0?"Buzz":i+"";
  for(int i=1;i<=n;i++)
   System.out.println("Position "+i+" = "+arr[i]);
 }
}