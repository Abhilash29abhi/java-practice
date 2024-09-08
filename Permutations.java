import java.util.*;
public class Permutations {
    public static void permute(String str,String t,List<String>l){
        if(str.equals("")){
            l.add(t);
            return;
        }
        int n=str.length();
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            String left=str.substring(0,i);
            String right=str.substring(i+1);
            String res=left+right;
            permute(res,t+ch,l);
        }
    }
    public static void main(String args[]){
        String str="abc";
        List<String>l=new ArrayList<>();
        permute(str,"",l);
        for(String s:l){
            System.out.println(s);
        }
    }
}
