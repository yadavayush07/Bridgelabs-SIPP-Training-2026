import java.util.*;
class Main{
    static String up(String s){
        String r="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c>='a'&&c<='z') c-=32;
            r+=c;
        }
        return r;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(up(s).equals(s.toUpperCase()));
    }
}