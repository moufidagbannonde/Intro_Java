public class Voiture {
    String type = "Audi";
    String modèle = "2019";
    int prix = 2500;
    String couleur = "rouge";

 public Voiture (){
    System.out.println("Classe instanciée ");
 }
  public Voiture(String t, String m, int p , String c){
    type = t;
    modèle = m;
    prix = p;
    couleur =  c   ; 
    System.out.println("Je veux une voiture de type " + type + " , un modèle " + modèle + " de couleur " + couleur + " et valant " + p + " £ ");
 }
    public void accélérer(){
        System.out.println("La voiture accélère !");
    }
    public void ralentir(){
        System.out.println("La voiture ralentit !");
    }
    public void tourner(){
        System.out.println("La voiture tourne !");
    }
    public void freiner(){
        System.out.println("La voiture freine !");
    }
}