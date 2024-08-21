
public class App {
        public static void main(String[] args) {
          Voiture maVoiture = new Voiture("Java", "2024", 50000, "indigo");
         System.out.println(" Marque : " + maVoiture.type);
         System.out.println(" Modèle : " + maVoiture.modèle);
         System.out.println(" Valeur : " + maVoiture.prix);
         System.out.println(" Couleur : " + maVoiture.couleur);

         maVoiture.accélérer();
         maVoiture.ralentir();
         maVoiture.tourner();
         maVoiture.freiner();
        }
    
}