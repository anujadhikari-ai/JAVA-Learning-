public class AbsoluteValue {
    public static int absoluteValue(int num) {
        if (num < 0) {
            return -num;
        } else {
            return num;
        }
    }
    public static void main(String[] args) {
        int input = -5;
        int result = absoluteValue(input);
        System.out.println("The absolute value of " + input + " is " + result);
    }
}