import java.util.*;
class MeanHeight{
 public static void main(String[] a){
  Scanner sc=new Scanner(System.in);
  double h[]=new double[11],sum=0;
  for(int i=0;i<11;i++){ h[i]=sc.nextDouble(); sum+=h[i]; }
  System.out.println("Mean="+sum/11);
 }
}