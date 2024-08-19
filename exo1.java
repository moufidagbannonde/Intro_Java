    public class exo1 {
        // valeur en octet des différents types primitifs
        byte aByte = 1;
    short aShort = 2;
    int anInt = 4;
    long aLong = 8;
    float aFloat = 4;
    double aDouble = 8;
    char aChar = 2;
    // boolean aBoolean = 1;
        public static void main(String[] args){
            System.out.println("Taille de int : " + Integer.BYTES + "octets");
            System.out.println("Taille de short : " + Short.BYTES + "octets");
            System.out.println("Taille de byte : " + Long.BYTES + "octets");
            System.out.println("Taille de float : " + Float.BYTES + "octets");
            System.out.println("Taille de double : " + Double.BYTES + "octets");
            System.out.println("Taille de char : " + Char.BYTES + "octets");
        }
    }