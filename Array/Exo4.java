import java.util.Arrays;
import java.util.Scanner;

public class Exo4 {
    public static void main(String[] args){
        recherche();
    }
    static void recherche(){

        // instanciation du Scanner
        // System.in : pour demander à l'utilisateur d'entrer des données 
        Scanner scanner = new Scanner(System.in);  
        System.out.println("Vous allez devoir entrer 6 nombres différents pour former un tableau");
     
    

       int[] tab = {nbr1 , nbr2, nbr3, nbr4, nbr5, nbr6};
        // message à afficher
        System.out.println("Entrez un nombre à chercher dans le tableau");
        // récupération de l'entrée de l'utilisateur
        int nbr1 = scanner.nextInt();
        int nbr2 = scanner.nextInt();
        int nbr3 = scanner.nextInt();
        int nbr4 = scanner.nextInt();
        int nbr5 = scanner.nextInt();
        int nbr6 = scanner.nextInt();
        int nbr = scanner.nextInt();

        int index = Arrays.binarySearch(tab, nbr);
        System.out.println("Index du nombre : " + index);
    }
}