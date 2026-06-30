import java.util.*;
class Main{
public static void main(String[] a){
Scanner s=new Scanner(System.in);
int m=s.nextInt(),d=s.nextInt();
System.out.println((m==3&&d>=20)||(m>3&&m<6)||(m==6&&d<=20)?"Its a Spring Season":"Not a Spring Season");
}}