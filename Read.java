import java.util.Scanner;
public class Read {
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    
    System.out.println("enter a String: ");
    String name=sc.next();
   
    char ch=name.charAt(0);
    System.out.println(ch);
  }
}