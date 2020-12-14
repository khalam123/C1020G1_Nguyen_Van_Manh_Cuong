package bai10_stack_queue.bai_tap.stack_reverse_array;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseArrayStack {
    public static void reserveArray(String str){
        String[] arr1 = str.split("");
        System.out.println("chuoi trc khi dao nguoc: " +str);
        str = "";
        Stack<String> wStack = new Stack<>();
        for (String element : arr1)
            wStack.push(element);
        for(int i=0; i <arr1.length;i++){
             str += wStack.pop();
        }
        System.out.println("chuoi sau khi dao nguoc: " + str);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dao nguoc mang so nguyen");
        System.out.print("Nhap n so phan tu co trong mang: ");
        int num = scanner.nextInt();
        Stack<Integer> stack = new Stack<>();
        int[] arr = new int[num];
        for ( int i = 0; i < num ;i++){
            System.out.print("Nhap phan tu thu "+(i+1)+": ");
            arr[i] = scanner.nextInt();
            stack.push(arr[i]);
        }

        System.out.println("Stack has: " + Arrays.toString(arr));
        for (int i = 0; i<arr.length;i++){
            arr[i]= stack.pop();
        }

        System.out.println("Stack has after reverse: " + Arrays.toString(arr));
        System.out.println("Dao nguoc chuoi");
        reserveArray("ohc noc");
    }
}
