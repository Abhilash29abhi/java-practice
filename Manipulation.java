public class Manipulation{
    public static void main(String args[]){
        int[] arr={1,2,3,4,2,1,3};
        int n=arr.length;
       
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
            if(arr[i]>0){
ans=arr[i];
            }
            }
            System.out.println(ans);
            }
           
        }
        
    

