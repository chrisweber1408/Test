public class Fakultät {

    public static void main(String[] args) {
        System.out.println(berechnung(4));
    }


    public static int berechnung(int anzahl){
        int result = 1;
        for (int i = 1; i <= anzahl; i++) {
            result *= i;
        }
        return result;
    }

}
