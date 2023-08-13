package methods_in_java;

// reverse number using recursive method.
public class assignn1 {
    public static void main(String[] args) {
        int num = 1234;
        reverse(num);
    }

    static void reverse(int num) {
        if (num < 10) {
            System.out.println(num);
        } else {
            System.out.print(num % 10);
            reverse(num / 10);
        }

    }
}
