import java.util.*;
class Main{
public static void main(String[] a){
Scanner s=new Scanner(System.in);
double p=s.nextDouble(),c=s.nextDouble(),m=s.nextDouble(),avg=(p+c+m)/3;
String g=avg>=80?"A":avg>=70?"B":avg>=60?"C":avg>=50?"D":avg>=40?"E":"R";
System.out.println("Average = "+avg+"\nGrade = "+g);
}}