package bai10_stack_queue.bai_tap.chuyen_doi_he_nhi_phan;

import java.util.Scanner;
import java.util.Stack;

public class ChuyenDoiHeNhiPhan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số muốn đổi sang hệ nhị phân: ");
        int number = scanner.nextInt();
        int temp = number;
        Stack stack = new Stack();
        while (temp != 0){
            stack.push(temp % 2);
            temp /= 2;
        }
        String str="";
        while (!(stack.isEmpty())){
          str += stack.pop();
        }
        System.out.print("Chuyển đổi sang hệ nhị phân: "+ number + " => " + str );
    }
}
