import java.util.*;
class BMIArray{
 public static void main(String[] a){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  double w[]=new double[n],h[]=new double[n];
  for(int i=0;i<n;i++){w[i]=sc.nextDouble();h[i]=sc.nextDouble();}
  for(int i=0;i<n;i++){
   double bmi=w[i]/Math.pow(h[i]/100,2);
   System.out.println(bmi);
  }
 }
}