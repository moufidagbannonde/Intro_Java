public class exo5 {
    public static void main(String[] args){
       counter(13804795);
    }
    static void counter(int lambda){
        Boolean result = lambda % 2 == 0;
        System.out.println(result);
        int x = 0;
        for(int i = 0; i < lambda; i++){
            if(result == false ){
                x += 1;    
                System.out.println(x);   
                break;         
            }
        }
    }
        
    }
