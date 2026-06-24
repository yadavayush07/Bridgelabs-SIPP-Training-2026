import java.util.*;
class Main{
public static void main(String[] a){
Scanner s=new Scanner(System.in);
double w=s.nextDouble(),h=s.nextDouble()/100,b=w/(h*h);
System.out.println("BMI = "+b);
System.out.println(
b<18.5?"Underweight":
b<25?"Normal":
b<30?"Overweight":"Obese");
}}