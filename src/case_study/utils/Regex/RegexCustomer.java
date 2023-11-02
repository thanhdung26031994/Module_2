package case_study.utils.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexCustomer {
    private static final String REGEX_ID = "^KH-\\d{4}$";
    private static final String REGEX_NAME = "^([\\p{Lu}][\\p{Ll}]{1,8})(\\s([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,10})){0,5}$";
    private static final String REGEX_IDCARD = "^[0-9]{9,12}$";
    private static final String REGEX_PHONE = "^0[0-9]{9}$";
    private static final String REGEX_EMAIL = "^([a-zA-Z0-9_.\\-])+@(([a-zA-Z0-9\\-])+\\.)+([a-zA-Z0-9]{2,4})+$";
    public static boolean regexId(String point){
        Pattern pattern = Pattern.compile(REGEX_ID);
        Matcher matcher = pattern.matcher(point);
        return matcher.matches();
    }

    public static boolean regexName(String name) {
        Pattern pattern = Pattern.compile(REGEX_NAME);
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }


    public static boolean regexEmail(String email) {
        Pattern pattern = Pattern.compile(REGEX_EMAIL);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();

    }

    public static boolean regexPhone(String phone) {
        Pattern pattern = Pattern.compile(REGEX_PHONE);
        Matcher matcher = pattern.matcher(phone);
        return matcher.matches();
    }

    public static boolean regexIdCard(String idCard) {
        Pattern pattern = Pattern.compile(REGEX_IDCARD);
        Matcher matcher = pattern.matcher(idCard);
        return matcher.matches();
    }
}
