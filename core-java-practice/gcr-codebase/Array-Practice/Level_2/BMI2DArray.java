import java.util.*;
class BMI2DArray{
 public static void main(String[] a){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  double p[][]=new double[n][3];
  for(int i=0;i<n;i++){
   p[i][0]=sc.nextDouble();
   p[i][1]=sc.nextDouble();
   p[i][2]=p[i][0]/Math.pow(p[i][1]/100,2);
   System.out.println(p[i][2]);
  }
 }
}