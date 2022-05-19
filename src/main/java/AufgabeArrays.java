import java.sql.Array;

public class AufgabeArrays {

    public static void main(String[] args) {

        addStudents(2);

    }

    public static String[] addStudents(int j){
        String[] students = new String[j];
        for (int i = 0; i < students.length ; i++) {
            students[i] = "Student: " + (i + 1);
            System.out.println(students[i]);
        }
        return students;
    }

}
