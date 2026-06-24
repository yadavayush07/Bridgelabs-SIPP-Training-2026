class PalindromeChecker{
 String t;
 PalindromeChecker(String t){this.t=t;}
 void check(){
  String r=new StringBuilder(t).reverse().toString();
  System.out.println(t.equals(r)?"Palindrome":"Not Palindrome");
 }
}
class Test{
 public static void main(String[] a){
  new PalindromeChecker("madam").check();
 }
}