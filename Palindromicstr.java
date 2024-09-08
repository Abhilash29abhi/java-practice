import java.util.*;
public class Palindromicstr {
    public static boolean check(String str){
      int n=str.length();
      int i=0;
      int j=n-1;
      boolean flag=true;
      while(i<j){
       if(str.charAt(i)!=str.charAt(j)){
        i++;
       j--;
           } 
        
         return false;
      }
       
      
    
      return true;
    }
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    int count=0;
    for(int i=0;i<str.length();i++){
        for(int j=i+1;j<=str.length();j++){
         if(check(str.substring(i,j))==true)count++;
        }
    }
    System.out.println(count);
    }
}
