public class Exercice5 {
    private int nombre;
    public static void main(String[] args){
        int[] alpha = {
            1, 2, 3
        };
        System.out.println(setNombre());
    }
    public Exercice5(int unNombre){
        nombre = unNombre;
    }
  static  void setNombre(int[] unNombre){
        for(int nbr1 : unNombre){
            for(int nbr2 : unNombre){
                if(nbr1 == nbr2){
                    System.out.println(nbr1);
                }
            }
        }
    }
    public int getNombre(){
        return nombre;
    }
}
