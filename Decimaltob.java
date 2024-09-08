import java.util.*;
public class Decimaltob {
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int decimalno=sc.nextInt();
    int ans=0;
    int pw=1;
    while(decimalno>0){
        int paritybit=decimalno%2;
        ans+=paritybit*pw;
        decimalno/=2; 
        pw*=10;
    }
    System.out.println(ans);
  }  
}
