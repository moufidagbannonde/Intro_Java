public class exo4 {

    public static void main(String[] args){
    int a = 10;
    int b = 11;
    int c = 12;
    int d = 13;
    int e = 14;
          int[] tab = {
            a, b, c, d, e
        };
        for(int i = 0; i <= tab.length; i++){
	  System.out.println(tab[i]);
	  System.out.println(max(tab[i]));
    }  
}
}
