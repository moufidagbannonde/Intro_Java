// affichage des nombres pairs de 1 à 20 en utilisant une boucle for
public class exo1 {
    public static  void main(String[] args){
        for(int i = 1; i <= 20; i++){
            Boolean result = i % 2 == 0;
            if(result){
                 System.out.println(i);
            }
           
        }
    }
 
}