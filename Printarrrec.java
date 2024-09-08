public class Printarrrec {
    
    public static int print(int[] arr,int idx){
 
        if(idx==arr.length-1){
            return arr[idx];
        }
        int smallans=print(arr,idx+1);
         return arr[idx]+smallans;
    } 
    public static void main(String args[]){
 int[] arr={4,5};
 System.out.print(print(arr,0));
    }
}
