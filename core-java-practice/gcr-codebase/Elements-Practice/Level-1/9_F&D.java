import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        double fee=s.nextDouble(),dp=s.nextDouble();
        double d=fee*dp/100;
        System.out.println("The discount amount is INR "+d+
        " and final discounted fee is INR "+(fee-d));
    }
}