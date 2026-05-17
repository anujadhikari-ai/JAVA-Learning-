package Java_Methods;
public class MoodleGradingFunctionOverriding {
    public static double calculategrade(int coursework, int exam){
        double result;
        result= (coursework+ exam)/2.0;
        return result;
    }
    public static double calculategrade(int coursework, int exam, boolean hasLatePanalty){
        double avg = calculategrade(coursework, exam);
       if(hasLatePanalty==true){
        avg=avg-10;
       }
       return avg;
    }
    
    public static void main(String[] args) {
        double finalresult;
        finalresult= calculategrade(5 , 90, false);
        System.out.println(" The final result is: "+finalresult);
        if(finalresult>50){
        System.out.println(" Congratulations, You are pass.");
        }
        else
        System.out.println(" Please study hard. You are fail.");
    
}
}