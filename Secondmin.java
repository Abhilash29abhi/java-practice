import java.util.*;
public class Secondmin {
static int shortest(int[] arr){
    int n=arr.length;
    int ans=arr[0];
    for(int i=0;i<n;i++){
        if(arr[i]<ans){
            ans=arr[i];
        }
    }
}
static int shortest2(int[] arr){
    int n=arr.length;
    int ans=shortest(arr);
    ans=Integer.MAX_VALUE;
    int ans2=arr[0];
    for(int i=0;i<arr.length;i++){
        if(arr[i]<ans2){
           ans2=arr[i]; 
        }
    }
    return ans2;
}
   public static void main(String args[]){
int[] arr={1,5,7,3,8};
System.out.print(shortest2(arr));
   } 
}
