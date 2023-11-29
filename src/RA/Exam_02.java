package RA;

import java.util.Scanner;

public class Exam_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row, col;
        int count = 0;
        System.out.println("Nhập vào số dòng: ");
        row = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào số cột: ");
        col = Integer.parseInt(scanner.nextLine());
        //Khai báo mảng số nguyên 2 chiều
        int[][] arrNumber = new int[row][col];
        //In menu
        do {
            System.out.println("\n********** Menu **********");
            System.out.println("1. Nhập giá trị các phần tử của mảng");
            System.out.println("2. In giá trị các phần tử trong mảng theo ma trận");
            System.out.println("3. Tính số lượng các phần tử chia hết cho 2 và 3 trong mảng");
            System.out.println("4. In các phần tử và tổng các phần tử nằm trên đường biên, " +
                    "đường chéo chính và đường chéo phụ ");
            System.out.println("5. Sử dụng thuật toán sắp xếp lựa chọn sắp xếp các phần tử " +
                    "tăng dần theo cột của mảng ");
            System.out.println("6. In ra các phần tử là số nguyên tố trong mảng");
            System.out.println("7. Sử dụng thuật toán chèn sắp xếp các phần tử" +
                    "trên đường chéo chính của mảng giảm dần");
            System.out.println("8. Nhập giá trị một mảng 1 chiều gồm m phần tử và " +
                    "chỉ số dòng muốn chèn vào mảng, thực hiện chèn vào mảng 2 chiều");
            System.out.println("9. Thoát");
            System.out.println("Lựa chọn của bạn: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    //Nhập giá trị các phần tử của mảng
                    System.out.println("Nhập vào giá trị các phần tử mảng:");
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            System.out.printf("arrNumber[%d][%d]= ", i, j);
                            arrNumber[i][j] = Integer.parseInt(scanner.nextLine());
                        }
                    }
                    break;
                case 2:
                    //In giá trị các phần tử mảng theo ma trận
                    System.out.println("Mảng theo ma trận:");
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            System.out.printf("%d\t", arrNumber[i][j]);
                        }
                        System.out.printf("\n");
                    }
                    System.out.printf("\n");
                    break;
                case 3:
                    for (int i = 0; i < arrNumber.length; i++) {
                        for (int j = 0; j < arrNumber[i].length; j++) {
                            if (arrNumber[i][j] % 2 == 0 && arrNumber[i][j] % 3 == 0) {
                                count++;
                            }
                        }
                    }
                    System.out.println("Tổng số phần tử chia hết cho 2 và 3 trong mảng là: " + count);
                    break;
                case 4:
                    //In và tính tổng các phần tử tren đường biên
                    int row2 = arrNumber.length;
                    int col2 = arrNumber.length;
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            if (i == 0 || j == 0 || i == row - 1 || j == col - 1) {
                                System.out.print(arrNumber[i][j] + " ");
                                count += arrNumber[i][j];
                            } else {
                                System.out.print("  ");
                            }
                        }
                        System.out.println();
                    }
                    System.out.printf("Tổng các phần tử trên đường biên là: %d\n", count);

                    //In và tính tổng các phần tử trên đường chéo chính và chéo phụ
                    int sumDiagonal01 = 0;
                    int sumDiagonal02 = 0;
                    if (row != col) {
                        System.out.println("Mảng không phải là mảng vuông, không thể tính đường chéo.");
                        return;
                    }
                    // In và tính tổng các phần tử trên đường chéo chính và chéo phụ
                    for (int i = 0; i < row2; i++) {
                        for (int j = 0; j < col2; j++) {
                            // Kiểm tra xem phần tử có nằm trên đường chéo chính hay chéo phụ hay không
                            if (i == j) {
                                System.out.print(arrNumber[i][j] + " ");
                                sumDiagonal01 += arrNumber[i][j];
                            } else if (i + j == row2 - 1) {
                                System.out.print(arrNumber[i][j] + " ");
                                sumDiagonal02 += arrNumber[i][j];
                            } else {
                                System.out.print("  ");
                            }
                        }
                        System.out.println();
                    }
                    // In tổng
                    System.out.println("Tổng các phần tử trên đường chéo chính là: " + sumDiagonal01);
                    System.out.println("Tổng các phần tử trên đường chéo phụ là: " + sumDiagonal02);
                    break;
                case 5:
                    // Sắp xếp mảng tăng dần theo cột
                    for (int i = 0; i < arrNumber.length; i++) {
                        for (int j = 0; j < arrNumber.length - 1; j++) {
                            for (int k = 0; k < arrNumber.length - j - 1; k++) {
                                if (arrNumber[k][i] > arrNumber[k + 1][i]) {
                                    int temp = arrNumber[k][i];
                                    arrNumber[k][i] = arrNumber[k + 1][i];
                                    arrNumber[k + 1][i] = temp;
                                }
                            }
                        }
                    }
                    for (int[] row1 : arrNumber) {
                        for (int num : row1) {
                            System.out.print(num + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 6:
                    //in ra cac phan tu la so nguyen to trong mang
                    System.out.println("Các phần tử là số nguyen tố là: ");
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            boolean prime = true;
                            if (arrNumber[i][j] >= 2) {
                                for (int k = 2; k <= Math.sqrt(arrNumber[i][j]); k++) {
                                    if (arrNumber[i][j] % k == 0) {
                                        prime = false;
                                        break;
                                    }
                                }
                            } else {
                                prime = false;
                            }
                            if (prime) {
                                System.out.printf("%d\t", arrNumber[i][j]);
                            }
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    System.out.println("Chương trình kết thúc. Xin tạm biệt!");
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không phù hợp. Vui lòng nhập lại!");
            }
        } while (true);
    }
}
