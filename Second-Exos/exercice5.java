public class exercice5 {
    public static void main(String[]  args){
    System.out.println(calcul(100));
   
}
static String calcul(int n){
   return (n <= 100) ? ((n >= 50 )? " Reussi " : "Echoué") : "invalide";
    }
}
