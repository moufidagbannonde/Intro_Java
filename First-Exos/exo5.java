public class exo5 {

    public static void main(String[] args){
        System.out.println(comparaison(14, 12.5f));
    }
    static String comparaison(int x, float y){
        float x1 = (float) x;

        if(x1 > y){
            return " x1 = " + x1 + "est supérieur à y = " + y ;
        } else {
            return " x1 = " + x1 + " est inférieur à y = " + y;
        }
    }
}
