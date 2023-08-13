package fundamental_of_java;

public class bitwise {
    public static void main(String[] args) {
        int num = 15;
        int num2 = 19;
        int or = num | num2;
        int and = num & num2;
        int xor = num ^ num2;

        /*
         * In xor if there are same bit in two operator then output bit is 0
         * and if there are different bit then output is 1.
         */

        System.out.println("num bit value: " + Integer.toBinaryString(num));
        System.out.println("num2 bit value: " + Integer.toBinaryString(num2));

        System.out.println("| value " + or + " and there bit value: " + Integer.toBinaryString(or));
        System.out.println("& value: " + and + " and there bit value: " + Integer.toBinaryString(and));
        System.out.println("^ value: " + xor + " and there bit value: " + Integer.toBinaryString(xor));
    }
}
