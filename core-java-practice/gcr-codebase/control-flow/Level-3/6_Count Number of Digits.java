import java.util.*;
class Main{
public static void main(String[] a){
Scanner s=new Scanner(System.in);
int n=s.nextInt(),c=0;
while(n!=0){
c++;
n/=10;
}
System.out.println("Digits = "+c);
}}