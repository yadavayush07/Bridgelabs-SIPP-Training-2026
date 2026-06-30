import java.util.*;
class Main{
public static void main(String[] a){
Scanner s=new Scanner(System.in);
int n=s.nextInt();long f=1;
while(n>0)f*=n--;
System.out.println(f);
}}