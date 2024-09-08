import java.util.*;
public class Firstwindow {
    public static void printwindow(int[] arr,int k){
        int n=arr.length;
        boolean flag;
        for(int i=0;i<(n-k+1);i++){
            flag=false;
            for(int j=0;j<k;j++){
                if(arr[i+j]<0){
                    System.out.print(arr[i+j]+" ");
                    flag=true;
                    break;
                }
            }
            if(!flag){
                System.out.print("0");
            }
        }
        
    }
    public static void main(String args[]){
     int[] arr={-8,2,3,-6,10};
     int k=2;
     printwindow(arr,k);
    }
}
