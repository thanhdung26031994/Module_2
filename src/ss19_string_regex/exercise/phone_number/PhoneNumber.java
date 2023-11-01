package ss19_string_regex.exercise.phone_number;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String PHONE_REGEX = "^[(]\\d{2}[)][-][(][0][0-9]\\d{8}[)]$";

    public PhoneNumber(){}
    public boolean validate(String regex){
        pattern = Pattern.compile(PHONE_REGEX);
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
