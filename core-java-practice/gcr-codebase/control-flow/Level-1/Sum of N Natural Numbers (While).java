import java.util.*;
class Main{
public static void main(String[] a){
Scanner s=new Scanner(System.in);
int n=s.nextInt(),i=1,sum=0;
while(i<=n)sum+=i++;
System.out.println(sum+" "+(n*(n+1)/2));
}}