package Java_Methods;
/*Problem 5: The Overtime Calculator
You need to calculate your weekly pay at Albion Fine Foods.
You have an array representing the number of hours you worked each day this week:
int[] weeklyHours = {8, 0, 9, 8, 0, 10, 0};
Write a class named WageCalculator with two overloaded methods named calculatePay.
we need hourly pay first  */
import java.util.Scanner;
public class WeeklyWageAtAlbionFineFoods {
    public static double calculatePay(double hourlyRate, double[] hours){
         double totalpay=0;
         double extraHours=0;
         for (double days : hours) {
            if(days>8){
                extraHours=days-8;
                totalpay=totalpay+(8*hourlyRate)+(extraHours*1.5*hourlyRate);
            }
            else{
                    totalpay=totalpay+(days*hourlyRate);
            }
         }
         return totalpay;
         
         }

        public static double calculatePay(double [] hours){
                return calculatePay(12.5, hours);
        }

    public static void main(String[] args) {
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
       Scanner input= new Scanner(System.in);
       double[] myhours= new double[7];
       for (int i = 0; i < myhours.length; i++) {
        System.out.print("Enter the hours you worked on "+days[i]+":");
        myhours[i]= input.nextDouble();
       }
       input.close();
    double finalpay= calculatePay(myhours);
        System.out.println("Your total pay is: $" + finalpay);
    }
}
