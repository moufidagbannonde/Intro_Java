public class exercice4 {
    public static void main(String[] args){
        System.out.println(remise(750));
}
static int remise(int alpha){
    Boolean result1 = alpha < 100;
    Boolean result2 = (alpha > 100 && alpha < 500 );
    Boolean result3 = alpha > 500;

    if(result1){
        alpha = alpha;
    }else if(result2){
        alpha = (alpha * 10 / 100);
    } else if(result3){
        alpha = (alpha * 20 / 100);
    }
    return alpha;
}
}