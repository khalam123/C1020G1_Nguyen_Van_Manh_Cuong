package bai18_string_regex.thuc_hanh.validate_email;

import java.util.Scanner;

public class EmailExampleTest {
    private static EmailExample emailExample;
    public static final String[] validEmail = new String[] { "a@gmail.com", "ab@yahoo.com", "abc@hotmail.com" };
    public static final String[] invalidEmail = new String[] { "@gmail.com", "ab@gmail.", "@#abc@gmail.com" };

    public static void main(String[] args) {
        emailExample = new EmailExample();
        for (String email : validEmail) {
            boolean isValid = emailExample.validate(email);
            System.out.println("Email is " + email +" is valid: "+ isValid);
        }
        for (String email : invalidEmail) {
            boolean isValid = emailExample.validate(email);
            System.out.println("Email is " + email +" is valid: "+ isValid);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your email: ");
        String email = scanner.nextLine();
        boolean isValid = emailExample.validate(email);
        if (isValid){
            System.out.println("Email hop le");
        }else System.out.println("Email ko hop le");
    }
}
