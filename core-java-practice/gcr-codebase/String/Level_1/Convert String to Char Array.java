import java.util.*;
class Main{
    static char[] arr(String s){
        char[] a=new char[s.length()];
        for(int i=0;i<s.length();i++) a[i]=s.charAt(i);
        return a;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char[] a=arr(s),b=s.toCharArray();
        System.out.println(Arrays.equals(a,b));
    }
}