public class Calculator {
    public static void main(String[] args) {
        System.out.println(multiply(3, 4));
        System.out.println(multiply(3.5, 4.2));
    }
    static int multiply(int a, int b){
        return a * b;
    }
    static double multiply(double a, double b){
        return a * b;
    }
}