 import java.util.Arrays;
 public class Exo1 {
    public static void main(String[] args){
        int[] alpha = {6, 2, 9, 142, 5, 48};
        trier(alpha);
    }
    static void trier(int[] gamma){
    Arrays.sort(gamma);
    System.out.println(Arrays.toString(gamma));
    }    
}
