  import java.util.Scanner;
  public class greater{
    public static void main(String args[]){
      Scanner f=new Scanner(System.in);
      int a=f.nextInt();
      int b=f.nextInt();
      int c=f.nextInt();
      if (a>b & a>c){
      System.out.println("A is greater ");
    }
    else if (b>a & b>c){
      System.out.println("B is greater");
    }
    else{
      System.out.println("C is greater");
    }
    if (a<b & a<c){
      System.out.println("A is smaller ");
    }
    else if (b<a & b<c){
      System.out.println("B is smaller");
    }
    else{
      System.out.println("C is smaller");
    }
  }
}
      
    