public class exo3 {
    int a ;
    int b;
    int c;
    public static void main(String[] args){
        System.out.println(operator(2, 5, 1));
    }

    static String operator(int a, int b, int c){
        b = a + 2;
        c = b * 2;

        if(a > b && b < c){
            return " La condition est vraie et le résultat est le suivant : b = " + b + "et c = " + c ;
        } else {
            return " La condition est fausse ! car b = " + b + " et c = " + c ;
        }
    }
}