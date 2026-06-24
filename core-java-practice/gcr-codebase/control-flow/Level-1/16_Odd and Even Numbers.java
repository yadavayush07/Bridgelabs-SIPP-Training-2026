import java.util.*;
class Main{
public static void main(String[] a){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
for(int i=1;i<=n;i++)
System.out.println(i+" "+(i%2==0?"Even":"Odd"));
}}