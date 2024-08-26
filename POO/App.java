import java.util.Scanner;
public class App {
        public static void main(String[] args) {
        //   Voiture maVoiture = new Voiture("Cyrus", "2000", 19870, "beige");
         Voiture maVoiture = new Voiture("salut");
         maVoiture.setPrice("Mercedes" , "Honda-008", 25000, "chartreuse");
       System.out.println(maVoiture.getPrice());
        }
    Scanner scanner = new Scanner(System.in);
    String mine = scanner.nextLine();
}
