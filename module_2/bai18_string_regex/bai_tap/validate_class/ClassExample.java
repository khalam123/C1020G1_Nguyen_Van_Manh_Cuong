package bai18_string_regex.bai_tap.validate_class;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassExample {
    public static final String CLASS_REGEX = "^[ACP]\\d{4}[GHIKLM]*$";

    public ClassExample() {
    }
    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(CLASS_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
