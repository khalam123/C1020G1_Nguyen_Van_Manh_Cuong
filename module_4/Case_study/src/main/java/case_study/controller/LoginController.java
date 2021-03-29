package case_study.controller;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class LoginController {
    public static void main(String[] args) {
        System.out.println(new BCryptPasswordEncoder().encode("456"));
    }
}
