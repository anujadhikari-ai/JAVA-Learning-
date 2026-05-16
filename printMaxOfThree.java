public class printMaxOfThree {
    public static void printMaxOfThree(int a, int x, int b){
       int max=a;
       if(x> max){
        max=x;
       }
       if(b>max){
        max=b;
       }
       System.out.println("The largest is " +max);
    }
    public static void main(String[] args) {
        printMaxOfThree(2, 9, 20

        );
    }
}
