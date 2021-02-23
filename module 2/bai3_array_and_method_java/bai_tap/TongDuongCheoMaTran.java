package bai3_array_and_method_java.bai_tap;

import java.util.Scanner;

public class TongDuongCheoMaTran {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soCot, soDong;
        do {

            System.out.print("Nhap so cot cua ma tran > 0: ");
            soCot = scanner.nextInt();
        } while (soCot <= 0);
        do {
            System.out.print("Nhap so dong cua ma tran > 0 : ");
            soDong = scanner.nextInt();
        } while (soDong <= 0);

        int[][] arr = new int[soCot][soDong];
        for (int i = 0; i < soCot; i++) {
            for (int j = 0; j < soDong; j++) {
                System.out.print("Nhap phan tu arr [" + i + "]" + "[" + j + "]: ");
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Ma tran: ");
        for (int i = 0; i < soCot; i++) {
            for (int j = 0; j < soDong; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < soCot ; i++) {
            sum1 += arr[i][i];
        }
        for (int i = 0,j=soCot-1; i <soCot;i++,j-- ) {
            sum2 += arr[i][j];
        }
        System.out.printf("Tong 2 duong cheo cua ma tran la: %d va %d",sum1,sum2);
        }
    }

