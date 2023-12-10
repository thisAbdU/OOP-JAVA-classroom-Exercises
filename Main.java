import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Double> subjectGradesofStudent1 = new ArrayList<>();
        ArrayList<Double> subjectGradesofStudent2 = new ArrayList<>();

        subjectGradesofStudent1.add(32.0);
        subjectGradesofStudent1.add(35.0);
        subjectGradesofStudent2.add(32.0);
        subjectGradesofStudent2.add(35.0);

        UpdatedGradebook student1 = new UpdatedGradebook(subjectGradesofStudent1);
        UpdatedGradebook student2 = new UpdatedGradebook(subjectGradesofStudent2);

        student1.deleteGrade(32.0);
        student2.deleteGrade(35.0);
        student1.printGrades();
        student2.printGrades();
    }
}
