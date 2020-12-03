package bai3_array_and_method_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        int [] b = new int[5];
        int [] a = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i=0;i<a.length;i++){
            System.out.printf("Nhap phan tu a[%d]: ",i);
            a[i] = scanner.nextInt();
        }
        for (int i=0;i<b.length;i++){
            System.out.printf("Nhap phan tu b[%d]: ",i);
            b[i] = scanner.nextInt();
        }
        System.out.println("Mang 1: "+ Arrays.toString(a));
        System.out.println("Mang 2: "+ Arrays.toString(b));
        int []c = new int[a.length+b.length];
        int index =0;
        for (int value : a) {
            c[index++] = value;
        }
        for (int value : b) {
            c[index++] = value;
        }
        System.out.println("Mang gop: "+Arrays.toString(c));
    }
}
