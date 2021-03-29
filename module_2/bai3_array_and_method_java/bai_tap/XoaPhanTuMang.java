package bai3_array_and_method_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class XoaPhanTuMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1,4,6,7,8,6,0,0,9};
        System.out.printf("Array is : %s%n", Arrays.toString(arr));
        System.out.print("Enter delete number: ");
        int number = scanner.nextInt();
        for(int i = 0 ; i < arr.length-1 ; i++) {
            if ( number == arr[i]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
            if (i + 1 == arr.length - 1)
                arr[i + 1] = 0;
        }
        System.out.printf("Array after delete number : %s%n", Arrays.toString(arr));
    }
}
