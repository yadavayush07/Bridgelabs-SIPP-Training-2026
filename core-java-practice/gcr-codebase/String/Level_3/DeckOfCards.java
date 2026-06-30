import java.util.*;
class DeckOfCards{
 public static void main(String[] a){
  String[] s={"H","D","C","S"};
  String[] r={"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
  ArrayList<String> d=new ArrayList<>();
  for(String x:s)for(String y:r)d.add(y+"-"+x);
  Collections.shuffle(d);
  int p=4,c=5,k=0;
  for(int i=1;i<=p;i++){
   System.out.print("P"+i+": ");
   for(int j=0;j<c;j++)System.out.print(d.get(k++)+" ");
   System.out.println();
  }
 }
}