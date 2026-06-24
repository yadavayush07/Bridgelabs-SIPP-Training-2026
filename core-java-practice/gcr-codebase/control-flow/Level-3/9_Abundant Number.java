import java.util.*;
class Main{
public static void main(String[] a){
Scanner s=new Scanner(System.in);
int n=s.nextInt(),sum=0;
for(int i=1;i<n;i++)if(n%i==0)sum+=i;
System.out.println(sum>n?"Abundant Number":"Not Abundant Number");
}}