public class prime50to100{
  public static void main(String args[]){
    int i=50;
      do{
        int count=0;
        int j=1;
        do{
          if(i%j==0)
            count++;
          j++;
        }while(j<=i);
        if (count==2)
          System.out.println(i+"");
        i++;
      }while(i<101);
  }
}