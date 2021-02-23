package commons;

public class Validate {
    public static boolean idValidate(String id) {
        String CUSTOMER_ID = "(KH-)[0-9]{4}";
        return id.matches(CUSTOMER_ID);
    }
    public static boolean phone(String phone ){
        String PHONE_VALID="(((090|091)[0-9]{7})|((84+)(90|91)[0-9]{7}))";
        return phone.matches(PHONE_VALID);
    }
    public static boolean cmnd(String cmnd){
        String CMND_VALID="([0-9]{9}|[0-9]{12})";
        return cmnd.matches(CMND_VALID);
    }
    public static boolean email(String email){
        String EMAIL_VALID="[a-z0-9]+[@][a-z]+[.][a-z]+";
        return email.matches(EMAIL_VALID);
    }
    public static boolean serviceId(String id){
        String SERVICE_ID="(DV-)[0-9]{4}";
        return id.matches(SERVICE_ID);
    }
    public static boolean floorValid(String floor){
        String FLOOR_VALID="[1-9]+";
        return floor.matches(FLOOR_VALID);
    }
    public static boolean money(String money){
        String MONEY_VALID="[0-9]+";
        return money.matches(MONEY_VALID);
    }
//    public static boolean dateCheck(String dateCheck){
//        String DATE_VALID="^(?:(?:31(\\/)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/)(?:0?[1,3-9]|1[0-2])\\2))(?:(?:1[6-9]|" +
//                "[2-9]\\d)?\\d{2})$|^(?:29(\\/)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16" +
//                "|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:(19)" +
//                "[0-9]{2}|(20)([0][0-2])))$";
//        return dateCheck.matches(DATE_VALID);
//    }
}