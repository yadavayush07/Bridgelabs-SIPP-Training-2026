import java.util.*;
class Main{
 public static void main(String[] a){
  Scanner sc=new Scanner(System.in);
  String[] c={"rock","paper","scissors"};
  int n=sc.nextInt(),u=0,pc=0;
  Random r=new Random();

  for(int i=0;i<n;i++){
   String p=sc.next();
   String com=c[r.nextInt(3)];

   if((p.equals("rock")&&com.equals("scissors"))||
      (p.equals("paper")&&com.equals("rock"))||
      (p.equals("scissors")&&com.equals("paper")))u++;
   else if(!p.equals(com))pc++;

   System.out.println(p+" vs "+com);
  }

  System.out.println("User="+u);
  System.out.println("Computer="+pc);
 }
}