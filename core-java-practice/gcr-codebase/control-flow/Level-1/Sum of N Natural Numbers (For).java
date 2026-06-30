import java.util.*;
class Main{
public static void main(String[] a){
Scanner s=new Scanner(System.in);
int n=s.nextInt(),sum=0;
for(int i=1;i<=n;i++)sum+=i;
System.out.println(sum+" "+(n*(n+1)/2));
}}