import java.util.*;
class BMICalculator{
 public static void main(String[] a){
  Scanner sc=new Scanner(System.in);
  for(int i=1;i<=10;i++){
   double w=sc.nextDouble(),h=sc.nextDouble()/100;
   double bmi=w/(h*h);
   String s=bmi<18.5?"Under":bmi<25?"Normal":"Over";
   System.out.printf("%.1f %.1f %.1f %s\n",w,h*100,bmi,s);
  }
 }
}