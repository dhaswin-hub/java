public class stopatnegative{
  public static void main(String args[]){
    for (int i=10;i>-2;i--){
      if (i==-1){
        break;
      }
      else{
        System.out.println(i);
      }
    }
  }
}