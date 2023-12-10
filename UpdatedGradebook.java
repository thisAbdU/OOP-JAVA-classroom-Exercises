import java.util.ArrayList;

public class UpdatedGradebook {
    ArrayList<Double> subjectGrades = new ArrayList<>();

    UpdatedGradebook(ArrayList<Double> subjectGrades) {
        this.subjectGrades = subjectGrades;
    }

    public void addGrade(double grade) {
        subjectGrades.add(grade);
    }

    public void deleteGrade(double grade) {
        subjectGrades.remove(grade);
    }

    public void printGrades() {
        System.out.println(averageOfgrades(subjectGrades));
    }

    public static double averageOfgrades(ArrayList<Double> subjectGrades) {
        double sum = 0;
        for (double grade : subjectGrades) {
            sum += grade;
        }
        return (sum / subjectGrades.size());
    }
}
