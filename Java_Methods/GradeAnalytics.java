package Java_Methods;
public class GradeAnalytics {

    public static double calculateAverage(double[] grades) {
        double sum=0.0;
        double avg=0.0;
        for(double grade: grades) {
            sum += grade;
        }
        avg = sum / grades.length;
        return avg;
    }
    public static double countPassedModules(double[] grades) {
        double count=0.0;
        for(double grade: grades) {
            if(grade>=40.0) {
                count=count+1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
      double[] grades = {75.5, 45.0, 88.5, 60.0, 38.5, 71.0};  
      double average = calculateAverage(grades);
      double passedModules = countPassedModules(grades);
      System.out.println("Average Grade: " + average);
      System.out.println("Number of Passed Modules: " + passedModules);
    }
}