public class ToManyPeople {

    public static void main(String[] args) {

    }

    public static String ToMany(String Alarmstufe) {
        switch (Alarmstufe) {
            case "rot":
                return "keine Personen erlaubt";
            case "gelb":
                return "30 Personen erlaubt";
            case "grün":
                return "60 Personen erlaubt";
            default:
                return "Falsche Eingabe!";
        }
    }

    public static String HowMuch(int i){
        if(i > 30){
            return "Zu viele Personen";
        }else{
            return "Maximale Personen nicht überschritten";
        }
    }


}
