import java.util.*;
class Main{
public static void main(String[] a){
Scanner s=new Scanner(System.in);
int n=s.nextInt(),p=s.nextInt(),r=1;
for(int i=1;i<=p;i++)r*=n;
System.out.println(r);
}}