

import java.util.*;
public class Arraylists {
    public static void main(String args[]){
        ArrayList<Integer>list=new ArrayList<>();
        ArrayList<Integer>list1=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        //int x=sc.nextInt();
        list.add(0);
        list.add(10);
        list.add(3);
        list.add(5);
        list.add(22);
        list.add(10);
        int one=list.size();
        for(int i=one-1;i>=0;i--){
         //int x=sc.nextInt();
         list1.add(list.get(i));
        }
        for(int i=0;i<list.size();i++){
            System.out.print(list1.get(i)+" ");
        }
        System.out.println();
    }
}
