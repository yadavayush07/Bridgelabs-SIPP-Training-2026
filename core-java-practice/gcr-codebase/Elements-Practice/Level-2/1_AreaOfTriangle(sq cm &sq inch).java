import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        double b=s.nextDouble(),h=s.nextDouble(),cm=.5*b*h;
        System.out.println("The Area of the triangle in sq in is "+(cm/6.4516)+" and sq cm is "+cm);
    }
}