package bai18_string_regex.bai_tap.validate_phone;

public class PhoneExampleTest {
    private static final String[] phone = {"(84)-0978489648","(a8)-22222222"};

    public static void main(String[] args) {
        PhoneExample phoneExample = new PhoneExample();
        for (String value : phone){
            boolean isValid = phoneExample.validate(value);
            System.out.println("Phone is " + value +" is valid: "+ isValid);
        }
    }
}
