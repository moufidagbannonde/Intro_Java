import java.util.Arrays;
import java.util.Scanner;

public class Exo4 {
    public static void main(String[] args){
        // recherche();
        int[] numbers = {
            25, 78, 14, 36,3, 9
        };
        // tri du tableau numbers
        Arrays.sort(numbers);
        // affichage du tableau avec les éléments entre crochets
        System.out.println(Arrays.toString(numbers));
        // instanciation de la classe Scanner
        Scanner scanner = new Scanner(System.in);
        // affichage du message d'entrée de nombre
        System.out.println("Entrer un nombre à rechercher !");
        // stockage de l'entrée de l'utilisateur dans une variable
        int nombre = scanner.nextInt();
        // affichage du nombre à rechercher entré par l'utilisateur
        System.out.println("Nombre à rechercher : " + nombre);
        // recherche de l'index du nombre dans le tableau numbers
        int i = Arrays.binarySearch(numbers, nombre);
        // si i > 0; c'est-à-dire que si l'élément est dans le tableau
            if(i > 0){
                // affichage du message
                System.out.println("L'index de l'élément " + nombre + " dans le tableau est " + i);
                //  sinon
            }else{
                // affichage du message
                System.out.println("Cet élément n'existe pas dans le tableau !");
            }
            
    }
    static void recherche(){

        // instanciation du Scanner
        // System.in : pour demander à l'utilisateur d'entrer des données 
        Scanner scanner = new Scanner(System.in);  
        System.out.println("Vous allez devoir entrer 5 nombres différents pour former un tableau");
     
        // message à afficher
        // récupération de l'entrée de l'utilisateur
        int nbr1 = scanner.nextInt();
        int nbr2 = scanner.nextInt();
        int nbr3 = scanner.nextInt();
        int nbr4 = scanner.nextInt();
        int nbr5 = scanner.nextInt();
        
        System.out.println("Entrez un nombre à chercher dans le tableau");
        int nbr = scanner.nextInt();
        
        int[] tab = {nbr1 , nbr2 , nbr3 , nbr4 , nbr5 };
        int index = Arrays.binarySearch(tab, nbr);
        System.out.println("Index du nombre : " + index);
    }
}