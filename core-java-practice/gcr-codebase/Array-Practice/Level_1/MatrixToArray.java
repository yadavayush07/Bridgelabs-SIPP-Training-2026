import java.util.*;
class MatrixToArray{
 public static void main(String[] a){
  Scanner sc=new Scanner(System.in);
  int r=sc.nextInt(),c=sc.nextInt();
  int arr[]=new int[r*c],k=0;
  for(int i=0;i<r;i++)
   for(int j=0;j<c;j++)
    arr[k++]=sc.nextInt();
  for(int x:arr) System.out.print(x+" ");
 }
}