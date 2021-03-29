package bai3_array_and_method_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.*;

public class ThemPhanTu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        int[] arr = {1,4,6,7,8,6,9,0,0};
        out.printf("Array is : %s%n", Arrays.toString(arr));
        out.print("Enter add number: ");
        int number = scanner.nextInt();
        out.print("Enter add index: ");
        int index = scanner.nextInt();
        for(int i=arr.length-1; i >= index ; i--){
            if((index <= 0) || (index >= arr.length-1)){
                out.println("Can't add element");
            }else
                arr[i] = arr[i-1];

        }
        arr[index]=number;
        out.println("Array after add: " + Arrays.toString(arr));
    }
}
