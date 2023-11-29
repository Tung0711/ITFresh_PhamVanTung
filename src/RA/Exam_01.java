package RA;

import java.util.Scanner;

public class Exam_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Khai báo mảng
        int[] arrNumber = new int[100];
        int number = 0;
        int temp = 0;
        //In menu
        do {
            System.out.println("\n************ Menu ************");
            System.out.println("1. Nhập giá trị n phần tử của mảng");
            System.out.println("2. In giá trị các phần tử trong mảng");
            System.out.println("3. Tính trung bình các phần tử dương trong mảng");
            System.out.println("4. In ra vị trí các phần tử có giá trị = k trong mảng");
            System.out.println("5. Su dụng thuật toán sắp xếp nổi bọt sắp xếp mảng giảm dần");
            System.out.println("6. Tính số lượng các phần tử là số nguyên trong mảng");
            System.out.println("7. Sắp xếp các phần tử chẵn chia hết cho 3 ở đầu mảng theo thứ tự tăng" +
                    "dần, các phần tử lẻ chia hết cho 3 ở cuối mảng theo thứ tự giảm dần," +
                    "các phần tử còn lại ở giữa mảng theo thu tự tăng dần");
            System.out.println("8. Nhập giá trị m từ bàn phím, chèn giá trị m vào mảng");
            System.out.println("9. Thoát");
            System.out.println("Lựa chọn của bạn là:");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    //Nhập giá trị các phần tử mảng
                    System.out.println("Nhập vào giá trị n:");
                    number = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhập giá trị các phần tử mảng: ");
                    for (int i = 0; i < number; i++) {
                        System.out.printf("arrNumber[%d]= ", i);
                        arrNumber[i] = Integer.parseInt(scanner.nextLine());
                    }
                    break;
                case 2:
                    //In giá trị các phần tử trong mảng
                    System.out.println("Giá trị các phần tử trong mảng: ");
                    for (int i = 0; i < number; i++) {
                        System.out.printf("%d\t", arrNumber[i]);
                    }
                    break;
                case 3:
                    //Tính trung bình các phần tử dương trong mảng
                    int sum = 0, k = 0;
                    System.out.println("Trung bình cộng các phần tử dương trong mảng là:");
                    for (int i = 0; i < number; i++) {
                        if (arrNumber[i] > 0) {
                            sum += arrNumber[i];
                            k++;
                        }
                    }
                    System.out.printf("%d\t", sum);
                    break;
                case 4:
                    //In ra vị trí (chỉ số) các phần tử có giá trị bằng k trong mảng
                    System.out.println("Nhập vào giá trị cần find:");
                    number = Integer.parseInt(scanner.nextLine());
                    System.out.printf("Vị trí của phần tử %d trong mảng là: ", number);
                    for (int i = 0; i < number; i++) {
                        if (arrNumber[i] == number) {
                            System.out.printf("%d\t", i);
                        }
                    }
                    break;
                case 5:
                    //Sử dụng thuật toán sắp xếp nổi bọt sắp xếp mảng giảm dần
                    System.out.println("Mảng sau khi sắp xếp:");

                    for (int i = 0; i < number - 1; i++) {
                        for (int j = 0; j < number - 1 - i; j++) {
                            if (arrNumber[j] < arrNumber[j + 1]) {
                                temp = arrNumber[j];
                                arrNumber[j] = arrNumber[j + 1];
                                arrNumber[j + 1] = temp;
                            }
                        }
                    }
                    for (int i = 0; i < number; i++) {
                        System.out.printf("%d\t", arrNumber[i]);
                    }
                    break;
                case 6:
                    //Tính số lượng các phần tử là số nguyên tố trong mảng
                    int count = 0;
                    System.out.println("Số lượng các phần tử là số nguyen tố là: ");
                    for (int i = 0; i < arrNumber.length; i++) {
                        boolean soNT = true;
                        if (arrNumber[i] >= 2) {
                            for (int j = 2; j <= Math.sqrt(arrNumber[i]); j++) {
                                if (arrNumber[i] % j == 0) {
                                    soNT = false;
                                    break;
                                }
                            }
                        } else {
                            soNT = false;
                        }
                        if (soNT) {
                            count++;
                        }
                    }
                    System.out.printf("%d\t", count);
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    System.out.println("Chương trình ket thúc. Xin tạm biệt!");
                    System.exit(0);
                default:
                    System.err.println("Lựa chọn không phù hợp. Vui lòng nhập lại!");
            }
        } while (true);
    }
}
