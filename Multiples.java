public class Multiples {
    public static void multiply(int n,int k){
        if(k==0){
            return;
        }
       
     multiply(n,k-1);
     System.out.print(n*k+" ");
    
    }
    public static void main(String args[]){
int n=12;
int k=5;
multiply(n,k);
    }
}
