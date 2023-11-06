package case_study.utils.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexFacility {
    private static final String REGEX_CODE = "^SV(VL|HO|RO)-\\d{4}$";
    private static final String REGEX_NAME = "^([\\p{Lu}][\\p{Ll}]{1,8})(\\s([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,10})){0,5}$";
    public static boolean regexCode(String code) {
        Pattern pattern = Pattern.compile(REGEX_CODE);
        Matcher matcher = pattern.matcher(code);
        return matcher.matches();
    }

    public static boolean regexName(String name) {
        Pattern pattern = Pattern.compile(REGEX_NAME);
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }
}
