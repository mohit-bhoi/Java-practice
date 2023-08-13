package methods_in_java;

import java.util.Scanner;

import fundamental_of_java.prime_number;

public class checkprime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check it is prime or not: ");
        int num = sc.nextInt();
        if (prime(num)) {
            System.out.println(num + " it is not a prime number");
        } else {
            System.out.println(num + " it is prime numbers");
        }
    }

    static boolean prime(int num) {
        int count = 0;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count == 0) {
            return false;
        } else {
            return true;
        }
    }
}
