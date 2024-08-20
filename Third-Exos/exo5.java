public class exo5 {
    public static void main(String[] args){
       System.out.println(counter(145));
    }
    static int counter(int lambda){
        int x = 0;
        int[] lam = {lambda};
        for(int i = 0; i < lam.length; i++){
        Boolean result = lam[i] % 2 == 0;
        System.out.println(result);
            if(!result){
                x += 1;    
                System.out.println(x);   
                continue;         
            }
        }
        return x;
    }
        
    }
