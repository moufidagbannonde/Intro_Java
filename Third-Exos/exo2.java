// somme des entiers de 1 à 10 avec une boucle while
public class exo2 {
    public static void main(String[] args){
        int i = 1;
        int sum = 0;
        while(i < 10){
            sum += i;
            i++;
        }
            System.out.println(sum);
    }
}