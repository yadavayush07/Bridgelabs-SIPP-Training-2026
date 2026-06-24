class Student{
 String name; int roll,marks;
 Student(String n,int r,int m){
  name=n;roll=r;marks=m;
 }
 char grade(){
  return marks>=90?'A':marks>=75?'B':marks>=60?'C':'D';
 }
 void show(){
  System.out.println(name+" "+roll+" "+marks+" "+grade());
 }
}
class StudentReport{
 public static void main(String[] a){
  new Student("Ayush",1,85).show();
 }
}