class MobilePhone{
 String brand,model; double price;
 MobilePhone(String b,String m,double p){
  brand=b;model=m;price=p;
 }
 void show(){
  System.out.println(brand+" "+model+" "+price);
 }
}
class MobilePhoneDetails{
 public static void main(String[] a){
  new MobilePhone("Samsung","S24",70000).show();
 }
}