import java.util.*;
public class Reverseword {
    public static void word(String str){
        StringBuilder s=new StringBuilder("");
        String ans="";
        
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            //if(ch=='')continue;
            if(ch!=' '){
                s.append(ch);
            }
            else{
                s.reverse();
                ans+=s;
                
                ans+=" ";
                s=new StringBuilder();
            }
        }
        s.reverse();
        ans+=s;
        System.out.println(ans);
    }
    public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   String str=sc.nextLine();
   word(str);
   
    }
}
