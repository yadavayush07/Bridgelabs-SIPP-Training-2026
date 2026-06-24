import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        double cm=s.nextDouble(),in=cm/2.54;
        System.out.println("Your Height in cm is "+cm+
        " while in feet is "+(int)(in/12)+" and inches is "+(in%12));
    }
}