
//check minimum from 2 dimmensional array and insert to the single dimmenstional array.
// it contain error
import java.util.Arrays;
import java.util.Scanner;

public class assign2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements in row: ");
        int row = scan.nextInt();
        System.out.println("Enter the number of elements in colunmn:  ");
        int col = scan.nextInt();
        int[][] array = new int[row][col];

        if (row == 0 || col == 0) {
            System.out.println("There are no element in given 2D array.");
        } else {
            System.out.println("Enter the elements for 2D array: ");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    array[i][j] = scan.nextInt();
                }
            }
            System.out.println("Inserted Array: " + Arrays.deepToString(array));
            System.out.println("Minimum value in given array is: " + Arrays.toString(giiveminimumarray(array, row)));

        }
    }

    public static int[] giiveminimumarray(int[][] number, int row) {
        int mini = number[0][0];
        int[] res = new int[row];
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++) {
                if (number[i][j] < mini) {
                    mini = number[i][j];
                }
                res[i] = mini;
            }

        }
        return res;
    }
}
