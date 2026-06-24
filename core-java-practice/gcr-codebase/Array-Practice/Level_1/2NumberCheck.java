import java.util.*;
class NumberCheck{
 public static void main(String[] a){
  Scanner sc=new Scanner(System.in);
  int n[]=new int[5];
  for(int i=0;i<5;i++){
   n[i]=sc.nextInt();
   System.out.println(n[i]>0?(n[i]%2==0?"Positive Even":"Positive Odd"):n[i]<0?"Negative":"Zero");
  }
  System.out.println(n[0]==n[4]?"Equal":n[0]>n[4]?"Greater":"Less");
 }
}