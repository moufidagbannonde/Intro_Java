class exo2 {
    String str1 = "bonjour";
    String str2 = "salut";

    public static void main (String[] args){
        String str = str1 + str2;
        System.out.println(str);
        System.out.println(compare("yo", "Yo"));
    }

    public boolean compare(String s1, String s2){
        if(s1 ==  s2){
            return true;
        } else {
            return false;
        }
    }
}