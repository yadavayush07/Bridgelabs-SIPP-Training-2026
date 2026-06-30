import java.util.*;
class StoreNumbers{
 public static void main(String[] a){
  Scanner sc=new Scanner(System.in);
  double arr[]=new double[10],sum=0;
  int i=0;
  while(i<10){
   double n=sc.nextDouble();
   if(n<=0) break;
   arr[i++]=n;
  }
  for(int j=0;j<i;j++){ System.out.print(arr[j]+" "); sum+=arr[j];}
  System.out.println("\nSum="+sum);
 }
}