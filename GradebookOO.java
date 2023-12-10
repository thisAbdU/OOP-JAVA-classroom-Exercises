public class GradebookOO {

    private double[] subjectGrades;
    
    public GradebookOO() {
        // Initialize with a default size or provide the size dynamically based on your requirements
        subjectGrades = new double[3];
    }

    public GradebookOO(double[] subjectGrades) {
        this.subjectGrades = subjectGrades;
    }

    public void printGrades() {
        System.out.println(averageOfgrades(subjectGrades));
    }

    public static double averageOfgrades(double[] subjectGrades) {
        double sum = 0;
        for (int i = 0; i < subjectGrades.length; i++) {
            sum += subjectGrades[i];
        }
        return (sum / subjectGrades.length);
    }
}
