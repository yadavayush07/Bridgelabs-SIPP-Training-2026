class Circle{
 double r;
 Circle(double r){this.r=r;}
 void show(){
  System.out.println("Area="+3.14*r*r);
  System.out.println("Circumference="+2*3.14*r);
 }
}
class CircleArea{
 public static void main(String[] a){
  new Circle(5).show();
 }
}