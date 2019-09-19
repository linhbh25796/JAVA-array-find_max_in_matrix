import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int row = 0, column = 0;
        int array[][] = null;

        System.out.println("Nhập vào số dòng của ma trận: ");
        row = input(row);
        System.out.println("Nhập vào số cột của ma trận: ");
        column = input(column);
        int max = processed(column, row, array);
        display(max);
    }


    public static void display(int max) {
        System.out.println("Phần tử lớn nhất trong ma trận = " + max);
    }

    public static int input(int number) {
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        return number;

    }

    public static int processed(int column, int row, int array[][]) {
        Scanner scanner = new Scanner(System.in);
        array = new int[row][column];

        System.out.println("Nhập các phần tử cho ma trận: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                array[i][j] = scanner.nextInt();
            }
        }
        int max = array[0][0];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }
}
