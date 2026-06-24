import java.util.*;
class Main{
public static void main(String[] a){
Scanner s=new Scanner(System.in);
int n=s.nextInt(),i; boolean p=n>1;
for(i=2;i<n;i++) if(n%i==0){p=false;break;}
System.out.println(p?"Prime":"Not Prime");
}}