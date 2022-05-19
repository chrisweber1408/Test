public class FakultätReKursion {


    public static int berechnung(int i){
        if(i < 1){
            return 1;
        }
        return berechnung(i - 1) * i;
    }

    public static void main(String[] args) {
        System.out.println(berechnung(5));
    }

}
