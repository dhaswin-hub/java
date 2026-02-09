import java.util.Scanner;
public class marks{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String name=sc.next();
    int roll=sc.nextInt();
    int mark1=sc.nextInt();
    int mark2=sc.nextInt();
    int c;
    c=mark1+mark2;
    int avg;
    avg=c/2;
    System.out.println("Name "+name);
    System.out.println("Roll no "+roll);
    System.out.println("Subject1 "+mark1);
    System.out.println("Subject2 "+mark2);
    System.out.println("your total marks "+c);
    System.out.println("Average "+avg);
    if (mark1>40 & mark2>40){
      System.out.println("you passed");
    }
    else{
      System.out.println("you failed");
    }
  }
}
    