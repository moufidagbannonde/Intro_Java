public class exo4 {
    public static void main(String[] args){
    int intVar = 10;
        // widening casting
        double doubleVar = intVar;
        System.out.println(doubleVar); // 10.0
        System.out.println(intVar); // 10

        // narrowing casting
        short shortVar = (short) doubleVar;
        System.out.println(doubleVar); // 10.0
        System.out.println(shortVar); // 10

    }

}