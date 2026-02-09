 import java.util.Scanner;
  public class evenodd{
    public static void main(String args[]){
      Scanner f=new Scanner(System.in);
      int a=f.nextInt();
      if (a%2==0){
         System.out.println("Number A is even "+a);
      }
      else{
         System.out.println("Number A is odd "+a);
      }
    }
  }