import java.util.*;
class Main{
public static void main(String[] a){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
for(int i=1;i<n;i++)
if(n%i==0)System.out.print(i+" ");
}}