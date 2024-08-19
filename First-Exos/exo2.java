public class exo2 {

    public static void main (String[] args){
    String str1 = "bonjour";
    String str2 = "salut";
        String str =  str1 +  str2;
        System.out.println(str);
       compare1("yo", "Yo"); // renvoie false
       System.out.println(compare2("moi", "pareil")); // doit renvoyer false
    }
     static boolean compare1(String s1, String s2){
        if(s1 ==  s2){
            return true;
        } else {
            return false;
        }
    }
    
     static boolean compare2(String a, String b){
        if (a.equals(b)){
            return true;
        } else {
            return false;
        }
    }

}