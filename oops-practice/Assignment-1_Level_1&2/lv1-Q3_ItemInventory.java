class Item{
 int code; String name; double price;
 Item(int c,String n,double p){code=c;name=n;price=p;}
 void total(int q){
  System.out.println(name+" "+code+" "+price);
  System.out.println("Cost="+price*q);
 }
}
class ItemInventory{
 public static void main(String[] a){
  new Item(1,"Pen",10).total(5);
 }
}