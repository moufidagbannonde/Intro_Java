// somme des entiers de 1 à 10 avec une boucle while
public class exo2 {
    public static void main(String[] args){
      System.out.println(odd());
        // initialisation d'une variable égale à 1;
        int i = 1;
        // initialisation d'une variable sum égale à 0;
        int sum = 0;
        // utilisation de la boucle while pour parcourir les nombres entiers de 0 à 10
        while(i < 10){
            // affectation de la valeur de i à chaque fois à la variable sum
            sum += i;
            i++;
        }
        // affichage de la variable sum
        System.out.println(sum);
    }
    public static int odd(){
          // initialisation d'une variable égale à 1;
        int i = 1;
        // initialisation d'une variable sum égale à 0;
        int sum = 0;
        // utilisation de la boucle while pour parcourir les nombres entiers de 0 à 10
        while(i <= 10){
            // affectation de la valeur de i à chaque fois à la variable sum
            sum += i;
            i++;
        }
        // affichage de la variable sum
        return sum;
    }
}