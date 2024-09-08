import java.util.*;
public class Backtrackingroot {
    public static void maze(int sr,int sc,int er,int ec,String s){
        if(sr>er || sc>ec)return;
        if(sr==er && sc==ec){
            System.out.println(s);
            return;
        }
       maze(sr+1,sc,er,ec,s+"d");
        maze(sr,sc+1,er,ec,s+"r");
       
    }
  
    public static void main(String args[]){
       
            int rows=3;
            int col=3;
            maze(1,1,rows,col,"");
            
    }
}
