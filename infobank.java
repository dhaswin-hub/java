import java.util.Scanner;
class bank{
  int acno;
  String name;
  int balance=1000;
  int deposit;
  int withdraw;
  bank(
  int a,
  String b,
  int d,
  int e){
    acno=a;
    name=b;
    deposit=d;
    withdraw=e;
  }
  void deposit(){
    balance=balance+deposit;
    System.out.println("Deposited money:"+deposit);
    System.out.println("Balance after deposit: "+balance);
  }
  void withdraw(){
    int remaining;
    remaining=balance-withdraw;
    System.out.println("withdrawing money:"+withdraw);
    if (withdraw>balance){
      System.out.println("Insufficient balance");
    }
    else{
      System.out.println("Remaining Balance: "+remaining);
    }
    
  }
  void disp(){
    System.out.println("Acc No: "+acno);
    System.out.println("Acc Holder Name: "+name);
    System.out.println("Balance: "+balance);
  }
}
public class infobank{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter ACC no:");
    int a1=sc.nextInt();
    System.out.println("Enter ACC Holder name:");
    String a2=sc.next();
    
    System.out.println("Depositing money:");
    int a4=sc.nextInt();
    System.out.println("Enter withdraw amount:");
    int b1=sc.nextInt();
    bank st=new bank(a1,a2,a4,b1);
    st.disp();
    st.deposit();
    st.withdraw();
  }
}
    
    