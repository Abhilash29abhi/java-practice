public class Numberofrec{
    
    public static int give(int n){
    
        if(n/10==0){
            
            return 1;
        }
        
        
        return give(n/10)+1;

    }
    public static void main(String args[]){
        int n=5439;
        System.out.println(give(n));
    }
}