public class exercice1 {
    public static void main(String[] args){
        System.out.println(verify(15));
        System.out.println(verify(28));
    }
    // vérifier si un nombre est pair ou impair
    static String verify(int alpha){

        // 2ème méthode avec le ternaire
        return alpha % 2 == 0 ? " Le nombre " + alpha + " est un nombre pair " : " Le nombre " + alpha + " est un nombre impair ";
        // 1ère méthode avec if...else

        // if (alpha % 2 == 0) {
        //     return " Le nombre " + alpha + " est un nombre pair ";
        // } else {
        //     return " Le nombre " + alpha + " est un nombre impair ";
        // }
    }
}