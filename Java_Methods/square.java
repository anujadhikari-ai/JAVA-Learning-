package Java_Methods;
public class square {
    public static int square (int x)
    {
        int a;
        a=x*x;
        return a;
    }
    
    public static void main(String[] args) {
        int num=6;
        int result= square(num);

        System.out.println("The square of " +num+" is: " +result);
    }

}
