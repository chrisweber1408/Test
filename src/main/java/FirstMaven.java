public class FirstMaven {

    public static void main(String[] args) {
        System.out.println(longandfancy("fancy......................."));

    }

    private static boolean longandfancy (String word){
        boolean bool = (word.length() > 20) && (word.contains("fancy"));
        return bool;
    }

}
