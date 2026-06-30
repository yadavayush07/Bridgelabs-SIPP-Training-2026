import java.util.*;
import java.time.*;
class CalendarDisplay{
 public static void main(String[] a){
  Scanner sc=new Scanner(System.in);
  int m=sc.nextInt(),y=sc.nextInt();
  YearMonth ym=YearMonth.of(y,m);
  System.out.println("Sun Mon Tue Wed Thu Fri Sat");
  int d=LocalDate.of(y,m,1).getDayOfWeek().getValue()%7;
  for(int i=0;i<d;i++)System.out.print("    ");
  for(int i=1;i<=ym.lengthOfMonth();i++){
   System.out.printf("%3d ",i);
   if((i+d)%7==0)System.out.println();
  }
 }
}