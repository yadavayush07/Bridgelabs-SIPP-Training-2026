class Employee{
 String name; int id; double salary;
 Employee(String n,int i,double s){name=n;id=i;salary=s;}
 void show(){System.out.println(name+" "+id+" "+salary);}
}
class EmployeeDetails{
 public static void main(String[] a){
  Employee e=new Employee("Ayush",101,50000);
  e.show();
 }
}