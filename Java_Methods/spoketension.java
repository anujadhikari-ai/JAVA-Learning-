package Java_Methods;
public class spoketension {
    public static void main(String[] args) {
        int[] spokeTensions={85,90,60,88,120,92,75};
        int counter=0;
        for(int i:spokeTensions){
            if(i>=80 && i<=100)
                {
                    System.out.println(i+ ": This spoke is good.");
            counter=counter+1;
        }
        else if(i<80){
            System.out.println(i+ ": This spoke is too loose.");
    }
        else

            {
            System.out.println(i+" : This spoke is too tight.");
            }
        }
        System.out.println("Your perfect spoke count is: "+counter);
    }
}
