import java.util.*;
class Main{
public static void main(String[] a){
Scanner s=new Scanner(System.in);
int age=s.nextInt();
System.out.println("The person's age is "+age+(age>=18?" and can vote.":" and cannot vote."));
}}