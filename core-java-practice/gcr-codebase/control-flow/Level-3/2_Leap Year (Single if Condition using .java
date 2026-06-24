import java.util.*;
class Main{
public static void main(String[] a){
Scanner s=new Scanner(System.in);
int y=s.nextInt();
if(y>=1582 && (y%400==0 || (y%4==0 && y%100!=0)))
System.out.println("Leap Year");
else
System.out.println("Not a Leap Year");
}}