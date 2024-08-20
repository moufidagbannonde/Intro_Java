// affichage des nombres pairs de 1 à 20 en utilisant une boucle for


public class exo1 {
    public static  void main(String[] args){
        // parcours des nombres de 1 à 20
        for(int i = 1; i <= 20; i++){
            // déclaration d'une variable booléenne pour vérifier la parité du nombre 
            Boolean result = i % 2 == 0;
            // si la variable result est vraie
            if(result){
                // affichage des éléments i qui respectent cette condition
                 System.out.println(i);
            }
           
        }
    }
 
}