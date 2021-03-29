package bai3_array_and_method_java.thuc_hanh;

import java.util.Arrays;

public class TimMinTrongMang {
    public static void main(String[] args) {
        int []arr = {4,12,5, 7, 8, 1, 6, 9};
        int index = minValue(arr);
        System.out.printf("Array is: %s%n", Arrays.toString(arr));
        System.out.println("The smallest element in the array is: " + arr[index]);
    }
    public static int minValue(int []arr){
        int min = arr[0];
        int index =0;
        for (int i =0;i<arr.length;i++)
            if (min > arr[i]) {
                min = arr[i];
                index = i;
            }
        return index;
    }
}
