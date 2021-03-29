package case_study.model;

public class Regex {
//    static String regex;
    public static boolean nameRegex(String str){
        String regex = "^[A-Z][a-z]+(\\s[A-Z][a-z]+)*$";
        return str.matches(regex);
    }
    public static boolean emailRegex(String str){
        String regex = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
        return str.matches(regex);
    }
    public static boolean genderRegex(String str){
        return str.equals("Male") || str.equals("Female") || str.equals("Unknown");
    }
    public static boolean idCardRegex(String str){
        String regex = "^\\d{9}";
        return str.matches(regex);
    }
    public static boolean dobRegex(String str){
        String regex = "^(?=\\d{2}([-.,\\/])\\d{2}\\1\\d{4}$)(?:0[1-9]|1\\d|[2][0-8]|29(?!.02.(?!(?!(?:[02468][1-35-79]|[13579][0-13-57-9])00)" +
                "\\d{2}(?:[02468][048]|[13579][26])))|30(?!.02)|31(?=.(?:0[13578]|10|12))).(?:0[1-9]|1[012]).(19\\d{2}|200[0-2])$";
        return str.matches(regex);
    }
    public static boolean idVilla(String str){
        String regex = "^(SVVL)[-]\\d{4}$";
        return str.matches(regex);
    }
    public static boolean idHouse(String str){
        String regex = "^(SVHO)[-]\\d{4}$";
        return str.matches(regex);
    }
    public static boolean idRoom(String str){
        String regex = "^(SVRO)[-]\\d{4}$";
        return str.matches(regex);
    }
    public static boolean areaPool(String str){
        String regex = "^[3-9][0-9][.]?[0-9]+|[1-9]+[1-9]{2,}[.]?[0-9]+|[3-9][0-9]$";
        return str.matches(regex);
    }
    public static boolean areaRegex(String str){
        String regex = "^[3-9][0-9][.]?[0-9]+|[1-9]+[1-9]{2,}[.]?[0-9]+|[3-9][0-9]$";
        return str.matches(regex);
    }
    public static boolean costRent(String str){
        String regex = "^(\\d+)$";
        return str.matches(regex);
    }
    public static boolean peopleRegex(String str){
        String regex = "^([0-1]\\d)$";
        return str.matches(regex);
    }
    public static boolean floorRegex(String str){
        String regex = "^(\\d)$";
        return str.matches(regex);
    }


}
