public class Checkrec {
    public static boolean check(int[] arr,int idx,int target){
        if(idx==arr.length){
            return false;
        }
        if(arr[idx]==target)return true;
       return  check(arr,idx+1,target);
        
    }
    public static void main(String args[]){
 int[] arr={1,2,3,4};
 int target=4;
if(check(arr,0,target)){
    System.out.println("yes");

}
else{
    System.out.println("no");
}
    }
}
