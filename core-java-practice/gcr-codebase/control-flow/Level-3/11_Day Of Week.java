import java.util.*;
class Main{
public static void main(String[] a){
Scanner s=new Scanner(System.in);
int m=s.nextInt(),d=s.nextInt(),y=s.nextInt();
int y0=y-(14-m)/12;
int x=y0+y0/4-y0/100+y0/400;
int m0=m+12*((14-m)/12)-2;
int day=(d+x+31*m0/12)%7;
System.out.println(day);
}}