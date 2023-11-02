package ss19_string_regex.exercise.class_room;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassRoom {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String CLASS_REGEX = "^[ACP][0-9]{4}[GHIK]$";

    public ClassRoom(){}
    public boolean validate(String regex){
        pattern = Pattern.compile(CLASS_REGEX);
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }



}
