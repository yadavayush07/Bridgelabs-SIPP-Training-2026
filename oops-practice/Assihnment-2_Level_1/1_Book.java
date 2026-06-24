class Book{
 String title,author; double price;
 Book(){title="Java";author="ABC";price=500;}
 Book(String t,String a,double p){title=t;author=a;price=p;}
 public static void main(String[] args){
  Book b1=new Book(),b2=new Book("Python","XYZ",700);
  System.out.println(b1.title+" "+b2.title);
 }
}