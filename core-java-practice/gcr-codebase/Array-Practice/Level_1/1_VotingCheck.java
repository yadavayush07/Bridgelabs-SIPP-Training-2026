import java.util.*;
class VotingCheck{
 public static void main(String[] a){
  Scanner sc=new Scanner(System.in);
  int age[]=new int[10];
  for(int i=0;i<10;i++) age[i]=sc.nextInt();
  for(int x:age)
   System.out.println(x<0?"Invalid Age":x>=18?"Can Vote":"Cannot Vote");
 }
}