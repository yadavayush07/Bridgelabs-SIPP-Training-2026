import java.util.*;
class Main{
public static void main(String[] a){
Scanner s=new Scanner(System.in);
double sal=s.nextDouble();int y=s.nextInt();
System.out.println("Bonus = "+(y>5?sal*0.05:0));
}}