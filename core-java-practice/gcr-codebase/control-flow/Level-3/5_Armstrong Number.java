import java.util.*;
class Main{
public static void main(String[] a){
Scanner s=new Scanner(System.in);
int n=s.nextInt(),o=n,sum=0,d;
while(o!=0){
d=o%10;
sum+=d*d*d;
o/=10;
}
System.out.println(sum==n?"Armstrong Number":"Not Armstrong Number");
}}