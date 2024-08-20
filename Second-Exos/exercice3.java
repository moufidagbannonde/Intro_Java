public class exercice3 {

    int âge;
    public static void main(String[] args){
        System.out.println(classify(7));
    }
    static String classify(int âge){
        String result;
        Boolean firstOption = (0 < âge && âge< 12);
        Boolean secondOption = (13 < âge && âge < 19);
        Boolean thirdOption = ( 20 < âge && âge< 64);
       if(firstOption) {
        result =  "Cet utilisateur est un enfant";
       } else if(secondOption){
        result  = "Cet utilisateur est  un adolescent ";
       } else if(thirdOption){
        result =  " Cet utilisateur est un adulte";
       } else{
        result =  " Cet utilisateur est un sénior";
       };
       return result;
    }
}