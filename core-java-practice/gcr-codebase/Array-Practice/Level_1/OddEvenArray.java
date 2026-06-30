import java.util.*;
class OddEvenArray{
 public static void main(String[] a){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  if(n<=0)return;
  System.out.print("Odd: ");
  for(int i=1;i<=n;i+=2) System.out.print(i+" ");
  System.out.print("\nEven: ");
  for(int i=2;i<=n;i+=2) System.out.print(i+" ");
 }
}