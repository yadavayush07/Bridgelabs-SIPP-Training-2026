import java.util.*;
class Main{
public static void main(String[] a){
Scanner s=new Scanner(System.in);
int n=s.nextInt(),p=s.nextInt(),r=1,i=0;
while(i++<p)r*=n;
System.out.println(r);
}}