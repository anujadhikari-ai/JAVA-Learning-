package Java_Methods;
public class CommuteDistance {
    public static double TotalDistance(double[] DistancesinMiles) {
        double totalDistance = 0.0;
        for (double distance : DistancesinMiles) {
            totalDistance += distance;
        }
        return totalDistance;
    }


    public static double LongestTrip(double[] DistancesinMiles) {
    double longestDistance = 0.0;
        for (double distance : DistancesinMiles) {
            if (distance > longestDistance) {
                longestDistance = distance;
            }
        }
        return longestDistance;
    }

    public static void main(String[] args) {
        double[] DistanceinMiles = {4.5, 12.0, 3.2, 0.0, 15.5, 45.0, 2.1};
        
        double totalDistance = TotalDistance(DistanceinMiles);
        double longestDistance = LongestTrip(DistanceinMiles);
    for(double distance = 0;distance<DistanceinMiles.length;distance++){
        if(DistanceinMiles[(int)distance]>40.0){
            System.out.println("Warning: Battery needs a full charge.");
        }
    }
    System.out.println("The total commute distance in miles for the week is: " + totalDistance);
    System.out.println("The longest trip in miles for the week is: " + longestDistance);
    }
}
