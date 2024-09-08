import java.util.*;
public class Continu {
  public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  for(int i=1;i<=50;i++){
    if(i%3==0){
        continue;
    }
    System.out.println(i);
  }
  }  
}
