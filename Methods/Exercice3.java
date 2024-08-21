public class Exercice3 {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    static long factorial(long n){
        if (n < 0) {
            System.out.println("Le nombre doit être un nombre positif");
        } 
        long factorial = 1;
        for (int i = 1; i <= n; ++i) {
            factorial *= i;
        }
        return factorial;
    }
}