import java.util.*;
class Main{
public static void main(String[] a){
Scanner s=new Scanner(System.in);
double sum=0,n;
while(true){
n=s.nextDouble();
if(n<=0)break;
sum+=n;
}
System.out.println(sum);
}}