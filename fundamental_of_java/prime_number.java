package fundamental_of_java;

public class prime_number {
    public static void main(String[] args) {
        int num = 52, flag = 0;
        int n = num / 2;

        for (int i = 2; i <= n; i++) {
            if (num % i == 0) {
                System.out.println("It is not prime number");
                flag++;
                break;
            }
        }
        if (flag == 0) {
            System.out.println("Prime number");
        }
    }
}
