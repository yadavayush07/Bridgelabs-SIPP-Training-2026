import java.util.*;
class Main{
public static void main(String[] a){
Scanner s=new Scanner(System.in);
int n=s.nextInt(),t=n,sum=0;
while(t!=0){sum+=t%10;t/=10;}
System.out.println(n%sum==0?"Harshad Number":"Not Harshad Number");
}}