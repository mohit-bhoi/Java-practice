package fundamental_of_java;

import java.util.Scanner;

public class interest_calculator {
    public static void main(String[] args) {
        System.out.println("**** Interest Calculator ****");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principle Amount: ");
        int Principle = sc.nextInt();
        System.out.println("Enter rate of interest: ");
        int interest = sc.nextInt();
        System.out.println("Enter load period: ");
        int period = sc.nextInt();

        int loan = (Principle*interest*period)/100;

        System.out.println("Your Total amount is: "+(loan+Principle));


    }
}
