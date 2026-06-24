import java.util.*;
class Main{
public static void main(String[] a){
Scanner s=new Scanner(System.in);
int n=s.nextInt();long f=1;
for(int i=1;i<=n;i++)f*=i;
System.out.println(f);
}}