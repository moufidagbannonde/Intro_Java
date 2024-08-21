 import java.util.Arrays;
 import java.util.ArrayList;
import java.util.Set;
 import java.util.HashSet;

 public class Exercice5 {
    // supprimer les doublons d'un tableau 
    public static void main(String[] args){
      doublons();
    }
    static void doublons(){
          // déclaration d'un tableau de doublons 
          int[] numbers = {
            2 , 4 , 9 , 2 , 6 , 5 , 9 , 11
          };
          // création d'un nouveau tableau de type HashSet qui ne prend pas de doublons
          Set<Integer> unicNumbers = new HashSet<>();
        //   parcours du tableau  numbers 
          for (int alpha : numbers){
            // ajout de chaque élément du tableau au nouveau tableau créé
            unicNumbers.add(alpha);
          }
        //   affichage du tableau sans doublons
          System.out.println(unicNumbers);
    }
 }

// public class Exercice5 {
//     private int nombre;
//     public static void main(String[] args){
//         Integer[] alpha = {
//             5, 2, 12,5,28,11,40, 96,40
//         };
//         setNombre(alpha);
//     }
//     public Exercice5(Integer unNombre){
//         nombre = unNombre;
//     }
//   static  void setNombre(Integer[] unNombre){
//         // List<Integer> nombreList = Arrays.asList(unNombre);
//           Arrays.sort(unNombre);
//         System.out.println(Arrays.toString(unNombre));
//         for(int i = 0; i < unNombre.length ; i++){
//             int element = unNombre[i];
//             for (int j = i + 1; j < unNombre.length; j++){
//                 if(element == unNombre[j]){
//                     // nombreList.remove(element);
//                     System.out.println(element);
//                 }
//             }
//         }
//     }
//     public int getNombre(){
//         return nombre;
//     }
// }
