public class Commute_Range {
    public static double estimateRange(int batteryLevel){
        double result;
        result=batteryLevel*0.4;
        return result;
    } 
    public static double estimateRange(int batteryLevel, boolean isPedalAssist){
         double range;
         range= batteryLevel*0.4;
        if(isPedalAssist==true)
        {
           range= range*1.5;
            
        }
        return range;
    }
    public static void main(String[] args){
        System.out.println(estimateRange(50));
    }
    }