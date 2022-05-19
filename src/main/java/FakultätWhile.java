public class FakultätWhile {

    public static void main(String[] args) {
        System.out.println(berechnung(7));
    }

    public static int berechnung(int a){
        int result = 1;
        int i = 1;
        while (i <= a){
            result *= i;
            i++;
        }
        return result;
    }

}




