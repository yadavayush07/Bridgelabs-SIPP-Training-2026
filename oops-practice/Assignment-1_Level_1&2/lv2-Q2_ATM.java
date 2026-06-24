class BankAccount{
 String name; int acc; double bal;
 BankAccount(String n,int a,double b){
  name=n;acc=a;bal=b;
 }
 void deposit(double x){bal+=x;}
 void withdraw(double x){if(bal>=x)bal-=x;}
 void show(){System.out.println("Balance="+bal);}
}
class ATM{
 public static void main(String[] a){
  BankAccount b=new BankAccount("Ayush",101,5000);
  b.deposit(1000);
  b.withdraw(2000);
  b.show();
 }
}