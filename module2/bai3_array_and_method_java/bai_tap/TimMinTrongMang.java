package bai3_array_and_method_java.bai_tap;

import java.util.Scanner;

public class TimMinTrongMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        do{
            System.out.print("Nhap do dai cua mang: ");
            size = scanner.nextInt();
        }while(size <= 0);
        int []arr = new int[size];
        for (int i=0; i < size;i++){
            System.out.printf("Nhap phan thu thu %d: ",i);
            arr[i] = scanner.nextInt();
        }
        int min = arr[0];
        for (int i=0; i<size;i++){
            if (min>arr[i])
                min = arr[i];
        }
        System.out.printf("So nho nhat trong mang la: %d",min);
    }
}
