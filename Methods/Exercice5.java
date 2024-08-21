import java.lang.StringBuffer;

public class Exercice5 {
    public static void main(String[] args) {
       String alpha = " Je suis un dévéloppeur junior !";
            reverseString(alpha);
            StringBufferReverse(alpha);
    }
    public static void reverseString(String alpha){
                // conversion du string en un tableau de string 
                        char[] strArray = alpha.toCharArray();
                        // parcours du tableau avec une boucle for et décrémentation suivant les caractères
                                for (int i = strArray.length - 1; i >= 0; i--) {
                                    // affichage des caractères du string en commençant par le dernier caractère
                            System.out.print(strArray[i]);
                        }
        }
        // autre méthode en utilisant StringBuffer
        public static void StringBufferReverse(String str){
            StringBuffer sbf = new StringBuffer(str);
            System.out.println(sbf.reverse());
        }
    }

