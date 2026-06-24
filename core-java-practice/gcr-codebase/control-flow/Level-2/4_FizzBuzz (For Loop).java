import java.util.*;
class Main{
public static void main(String[] a){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
for(int i=1;i<=n;i++)
System.out.println(i%15==0?"FizzBuzz":i%3==0?"Fizz":i%5==0?"Buzz":i);
}}