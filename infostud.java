import java.util.Scanner;
class stud{
  int sno;
  String name;
  int age;
  String dept;
  int m1;
  int m2;
  int m3;
  stud(
  int a,
  String b,
  int c,
  String d,
  int aa,
  int bb,
  int cc){
    sno=a;
    name=b;
    age=c;
    dept=d;
    m1=aa;
    m2=bb;
    m3=cc;
  }
  void calculate(){
    int total=m1+m2+m3;
    int avg=total/3;
    System.out.println("Total: "+total);
    System.out.println("Average: "+avg);
    System.out.println("Sub1: "+m1);
    System.out.println("Sub2: "+m2);
    System.out.println("Sub3: "+m3);
    if (m1>40 & m2>40 & m3>40) {
      System.out.println("Result: You passed");
    }
    else{
      System.out.println("Result: You failed");
    }
  }
  void display(){
    System.out.println("Stud ID: "+sno);
    System.out.println("Stud Name: "+name);
    System.out.println("Stud Age: "+age);
    System.out.println("Stud Dept: "+dept);
  }
}
public class infostud{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int a1=sc.nextInt();
    String a2=sc.next();
    int a3=sc.nextInt();
    String a4=sc.next();
    int b1=sc.nextInt();
    int b2=sc.nextInt();
    int b3=sc.nextInt();
    stud st=new stud(a1,a2,a3,a4,b1,b2,b3);
    st.display();
    st.calculate();
  }
}
    