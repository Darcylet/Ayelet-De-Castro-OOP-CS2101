import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size of multiplication table: ");
        int size = scanner.nextInt() + 1;

        int[][] table = new int[size][size];

        for (int i = 1; i < size; i++) {
            for (int j = 1; j < size; j++) {
                table[i][j] = i * j;
            }
        }

        printTable(table);
    }

    public static void printTable(int[][] table) {
        System.out.println("Multiplication Table:");
        for (int i = 1; i < table.length; i++) {
            for (int j = 1; j < table[i].length; j++) {
                System.out.printf("%4d", table[i][j]);
            }
            System.out.println();
        }
    }
}