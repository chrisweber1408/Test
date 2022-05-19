public class FibonacciFolge {

    public static void main(String[] args) {
        System.out.println(fibonacci(3));
        System.out.println(fibonacci2(1));
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        int result = 0;
        int v0 = 0;
        int v1 = 1;
        for (int i = 2; i <= n; i++) {
            result = v0 + v1;
            v0 = v1;
            v1 = result;
        }
        return result;
    }



    public static int fibonacci2(int number2){
        if (number2 == 0){
            return 0;
        }
        if (number2 == 1){
            return 1;
        }

        return fibonacci2(number2 - 1) + fibonacci2(number2 - 2);

    }



}

/*
public static int berechnung(int i){
        if(i < 1){
            return 1;
        }
        return berechnung(i - 1) * i;
    }
 */