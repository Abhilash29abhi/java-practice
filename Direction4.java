import java.util.*;
public class Direction4 {
  private static void print(int sr,int sc,int er,int ec,String s,boolean[][] visit){
    if(sr<0 || sc<0)return;
    if(sr>er || sc>ec)return;
    if(visit[sr][sc]==true)return;
    if(sr==er && sc==ec){
        System.out.println(s);
        return;
    }
    visit[sr][sc]=true;
    print(sr,sc+1,er,ec,s+"R",visit);
    print(sr+1,sc,er,ec,s+"D",visit);
    print(sr,sc-1,er,ec,s+"L",visit);
    print(sr-1,sc,er,ec,s+"U",visit);
    
    visit[sr][sc]=false;
  }
    public static void main(String args[]){
    int  rows=3;
    int col=3;
    boolean[][] visit=new boolean[rows][col];
    print(0,0,rows-1,col-1,"",visit);
    }
}
