package bai3_array_and_method_java.bai_tap;

import java.util.Scanner;

public class DemSoLanKiTuTrongChuoi {
    public static void main(String[] args) {
        String str = "Con Cho";
        char kitu;
        int dem=0;
        System.out.printf("chuoi: %s%n", str);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ki tu muon kiem tra so lan xuat hien trong chuoi: ");
        kitu = scanner.next().charAt(0);
        for (int i=0;i<str.length();i++){
            if(kitu == str.charAt(i))
                dem++;
        }
        System.out.printf("Ki tu '%s' xuat hien %d lan trong chuoi.%n", kitu, dem);
    }
}
