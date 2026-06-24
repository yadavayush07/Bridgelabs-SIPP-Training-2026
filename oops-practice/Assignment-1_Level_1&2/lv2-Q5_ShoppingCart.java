class CartItem{
 String name; double price; int qty;
 CartItem(String n,double p,int q){
  name=n;price=p;qty=q;
 }
 void add(int q){qty+=q;}
 void remove(int q){qty-=q;}
 void total(){System.out.println(price*qty);}
}
class ShoppingCart{
 public static void main(String[] a){
  CartItem c=new CartItem("Book",100,2);
  c.add(1);
  c.remove(1);
  c.total();
 }
}