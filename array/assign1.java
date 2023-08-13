//count even odd from array

import java.util.Scanner;

public class assign1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int eve = 0;
        int odd = 0;
        int size = 4;
        int arr[] = new int[size];
        System.out.println("Enter your 5 values: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 == 0) {
                eve++;
            } else {
                odd++;
            }

        }
        System.out.println("count of even number in array is : " + eve);
        System.out.println("count of odd number in array is : " + odd);

    }
}
