public class Exo2 {
    public static void main(String[] args){
        int[] jaguar = {1, 2, 3, 4, 5, 6};
       filtrage(jaguar);
    }
    static void filtrage(int[] alpha){
        for(int nbr: alpha){
            if(nbr % 2 == 0){
                System.out.println(nbr);
            }
        }
    }
}