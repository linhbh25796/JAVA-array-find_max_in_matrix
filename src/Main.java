import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int row;
        int column;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số dòng của ma trận: ");
        row = sc.nextInt();
        System.out.println("Nhập vào số cột của ma trận: ");
        column = sc.nextInt();

        int[][] arr = new int[row][column];
        System.out.println("Nhập phần tử cho ma trận: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("arr[" + i + "][" + j + "] = ");
                arr[i][j] = sc.nextInt();
            }
        }
        int max = arr[0][0];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Phần tử lớn nhất trong ma trận = " + max);
    }


}
