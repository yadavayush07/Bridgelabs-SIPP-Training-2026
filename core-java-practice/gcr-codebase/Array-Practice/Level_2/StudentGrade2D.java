import java.util.*;
class StudentGrade2D{
 public static void main(String[] a){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  double m[][]=new double[n][3];
  for(int i=0;i<n;i++){
   for(int j=0;j<3;j++)m[i][j]=sc.nextDouble();
   double p=(m[i][0]+m[i][1]+m[i][2])/3;
   System.out.println(p);
  }
 }
}