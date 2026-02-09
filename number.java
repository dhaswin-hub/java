import java.util.Scanner;
public class number{
  public static void main(String args[]){
    Scanner d=new Scanner(System.in);
    int num=d.nextInt();
    if (num>0){
      System.out.println("It is positve");
    }
    else if (num<0){
      System.out.println("It is negative");
    }
    else{
      System.out.println("It is zero");
    }
  }
}