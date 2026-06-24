import java.util.*;
class Main{
public static void main(String[] a){
Scanner s=new Scanner(System.in);
double x=s.nextDouble(),y=s.nextDouble();
String op=s.next();
switch(op){
case "+":System.out.println(x+y);break;
case "-":System.out.println(x-y);break;
case "*":System.out.println(x*y);break;
case "/":System.out.println(x/y);break;
default:System.out.println("Invalid Operator");
}
}}