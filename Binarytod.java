import java.util.*;
public class Binarytod {
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
 int binaryno=sc.nextInt();
 int ans=0;
 int pw=1;
 while(binaryno>0){
    int unitdigit=binaryno%10;
    ans+=unitdigit*pw;
    binaryno/=10;
    pw*=2;
 }
 System.out.println(ans);
  }  
}
