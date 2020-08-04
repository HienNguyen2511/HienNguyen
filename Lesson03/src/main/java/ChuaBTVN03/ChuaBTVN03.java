import java.util.Scanner;
public class ChuaBTVN03 { 
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhap so hang ma tran 1");
//        int matrix1Row = sc.nextInt();
//        System.out.println("Nhap so cot ma tran 1");
//        int matrix1Col = sc.nextInt();
//        int[][] matrix1 = new int[matrix1Row][matrix1Col];
//
//        System.out.println("Nhap so hang ma tran 2");
//        int matrix2Row = sc.nextInt();
//        System.out.println("Nhap so cot ma tran 2");
//        int matrix2Col = sc.nextInt();
//        int[][] matrix2 = new int[matrix2Row][matrix2Col];
//
//
//        if (matrix1Row != matrix2Row || matrix1Col != matrix2Col) {
//            System.out.println("Khong cong duoc");
//        } else {
//            matrix1 = inputMatrix(matrix1Row, matrix1Col, "1");
//            matrix2 = inputMatrix(matrix2Row, matrix2Col, "2");
//            int[][] matrixSum = sumMatrix(matrix1, matrix2);
//            printMatrix(matrixSum);
//        }
        int[] arr = {3, 2, 1};
        int status = checkArray(arr);
        switch (status) {
            case 2:
                System.out.println("Cac phan tu cua mang bang nhau");
                break;
            case 1:
                System.out.println("Tang dan");
                break;
            case -1:
                System.out.println("Giam dan");
                break;
            default:
                System.out.println("Chua duoc sap xep");

        }

    }

    // 1 2 3 5
    // 0 1 2 3
    public static int checkArray(int[] array) {
        boolean isASC = true;
        boolean isDESC = true;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                isASC = false;
            } else if (array[i] < array[i + 1]) {
                isDESC = false;
            }
        }

        if (isASC && isDESC) {
            return 2;
        } else if (isASC == true && isDESC == false) {
            return 1;
        } else if (isASC == false && isDESC == true) {
            return -1;
        } else {
            return 0;
        }

    }

    public static int[][] inputMatrix(int row, int col, String name) {
        Scanner sc = new Scanner(System.in);
        int[][] returnValue = new int[row][col];
        System.out.println("Nhap cac phan tu cua ma tran: " + name);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(name + "[" + i + ", " + j + "] : ");
                returnValue[i][j] = sc.nextInt();
            }
        }
        return returnValue;
    }

    public static int[][] sumMatrix(int[][] matrix1, int[][] matrix2) {
        int row = matrix1.length;
        int col = matrix1[0].length;
        int[][] returnValue = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                returnValue[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return returnValue;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}