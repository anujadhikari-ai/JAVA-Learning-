public class printEvenOrOdd {
    public static void printEvenOrOdd(int x)
    {

        if (x%2==0)
        {
           System.out.println( x+ "is even");
        }
        else
        {
            System.out.println(x+ " is odd");
        }
    }
    public static void main(String[] args) {
        printEvenOrOdd(10);
        printEvenOrOdd(7);
    }
}
