package com.example.demo.model;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;

public class User  implements Validator {

    private String firstName;
    private String lastName;

    private String phoneNumber;
    @Min(value = 18,message = "Age must greater than or equal to 18!")
    private int age;
    @Email(message = "Fail format email! Format email: abc@abc.com")
    private String email;

    public User() {
    }

    public User(String firstName, String lastName, String phoneNumber, int age, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return User.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        User user = (User) target;
        String firstName = user.getFirstName();
        ValidationUtils.rejectIfEmpty(errors, "firstName", "firstName.empty");
        String lastName = user.getLastName();
        ValidationUtils.rejectIfEmpty(errors, "lastName", "lastName.empty");
        String phoneNumber = user.getPhoneNumber();
        ValidationUtils.rejectIfEmpty(errors, "phoneNumber","phoneNumber.empty" );
        String email = user.getEmail();
        ValidationUtils.rejectIfEmpty(errors, "email","email.empty" );

        if (firstName.length() <= 5 || firstName.length() >= 45){
            errors.rejectValue("firstName","firstName.length");
        }
        if (lastName.length() <= 5 || lastName.length() >= 45){
            errors.rejectValue("lastName","lastName.length");
        }

        if (phoneNumber.length()>11 || phoneNumber.length()<10){
            errors.rejectValue("phoneNumber", "phoneNumber.length");
        }
        if (!phoneNumber.startsWith("0")){
            errors.rejectValue("phoneNumber", "phoneNumber.startsWith");
        }
        if (!phoneNumber.matches("(^$|[0-9]*$)")){
            errors.rejectValue("phoneNumber", "phoneNumber.matches");
        }
    }
}
