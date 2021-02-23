package bai18_string_regex.bai_tap.validate_class;

public class ClassExampleTest {
    private static final String[] str1 = {"C0318G","M0318G", "P0323A","C1234_H","C3123G_"};
//    private static final String[] str2 = {"M0318G", "P0323A"};

    public static void main(String[] args) {
        ClassExample classExample = new ClassExample();
        for (String value : str1){
            boolean isValid = classExample.validate(value);
            System.out.println("Class is " + value +" is valid: "+ isValid);
        }
//
//        for (String value : str2){
//            boolean isValid = classExample.validate(value);
//            System.out.println("Class is " + value +" is valid: "+ isValid);
//        }
    }
}
