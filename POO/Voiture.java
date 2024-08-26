public class Voiture {
    private String type = "Audi";
    private String modèle = "2019";
    private int prix = 2500;
    private String couleur = "rouge";
public Voiture(String type){
    System.out.println("Yo bro !");
}
  public Voiture(String t, String m, int p , String c){
    type = t;
    modèle = m;
    prix = p;
    couleur =  c   ; 
    System.out.println("Je veux une voiture de type " + type + " , un modele " + modèle + " de couleur " + couleur + " et valant " + p + " euros ");
 }

//  getter
    public String getPrice(){
        return " Ceci est une voiture " + type + " de couleur " + couleur + ", modele " + modèle + " qui vaut " + prix + " euros ";
    }
    public void setPrice(String newType, String newModel, int newPrice, String newColor){
        type = newType;
        modèle = newModel;
        this.prix = newPrice;
        this.couleur = newColor;
    }
}