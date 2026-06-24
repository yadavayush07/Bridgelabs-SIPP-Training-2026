import java.util.*;
class Main{
public static void main(String[] a){
Scanner s=new Scanner(System.in);
int aa=s.nextInt(),ab=s.nextInt(),ac=s.nextInt();
double ha=s.nextDouble(),hb=s.nextDouble(),hc=s.nextDouble();
System.out.println(aa<ab&&aa<ac?"Amar":ab<ac?"Akbar":"Anthony");
System.out.println(ha>hb&&ha>hc?"Amar":hb>hc?"Akbar":"Anthony");
}}