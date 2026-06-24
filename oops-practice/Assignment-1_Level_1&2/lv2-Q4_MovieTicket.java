class Ticket{
 String movie; int seat; double price;
 void book(String m,int s,double p){
  movie=m;seat=s;price=p;
 }
 void show(){
  System.out.println(movie+" "+seat+" "+price);
 }
}
class MovieTicket{
 public static void main(String[] a){
  Ticket t=new Ticket();
  t.book("Pushpa2",12,250);
  t.show();
 }
}