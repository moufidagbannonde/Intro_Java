import java.util.Arrays;

public class Exo3 {
    public static void main(String[] args){
        int[] tab = {3, 5, 7, 2, 8};
        supAndInf(tab);
    }
    static void supAndInf(int[] x){
        //  tri du tableau de façon croissante
        Arrays.sort(x);
        // déclaration de la variable min qui est le premier élément du tableau
        int min = x[0];
        // déclaration de la variable max qui est le dernier élément du tableau
        int max = x[x.length - 1];
        // affichage du tableau dans des crochets au lieu des accolades
        System.out.println(Arrays.toString(x));
        // affichage de max
        System.out.println("Max : " + max);
        // affichage de min
        System.out.println("Min : " + min);
    }
}