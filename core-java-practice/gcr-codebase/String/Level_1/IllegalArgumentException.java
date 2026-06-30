import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        try{
            if(5>2) throw new IllegalArgumentException();
        }catch(IllegalArgumentException e){
            System.out.println("IllegalArgumentException");
        }
    }
}