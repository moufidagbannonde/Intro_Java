public class exercice2 {
    int a , b, c ;

    public static void main(String [] args){
        System.out.println(three_compare(12, 2, 13));
    }
    static void  three_compare(int a, int b, int c){
        if(a > b && b > c){
            System.out.println(" Le plus grand des trois nombres est " + a);
        } else if(a < b && b < c){
            System.out.println(" Le plus grand des trois nombres est " + c);
        } else if(b > a && a > c){
            System.out.println(" Le plus grand des trois nombres est " + b);
        }
    }
}