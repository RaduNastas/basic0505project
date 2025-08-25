package javaPro.lesson18;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TelNumberExample {

    public static void main(String[] args) {
        String telNumber1 = "1234567";
        String telNumber2 = "123 4567";
        String telNumber3 = "123-4567";
        String telNumber4 = "(+123) 1234567";

        String regex = "\\d{3}(\\s|-)?\\d{4}";
        String regexInternational ="\\(\\+\\d{1,3}\\)\\s\\d{7}";

        Pattern pattern = Pattern.compile(regex);
        Pattern pattern1 = Pattern.compile(regexInternational);

        Matcher matcher = pattern.matcher(telNumber1);
        System.out.println(telNumber1 + " is correct? " + matcher.matches());

        matcher = pattern.matcher(telNumber2);
        System.out.println(telNumber2 + " is correct? " + matcher.matches());

        matcher = pattern.matcher(telNumber3);
        System.out.println(telNumber3 + " is correct? " + matcher.matches());

        matcher = pattern1.matcher(telNumber4);
        System.out.println(telNumber4 + " is correct? " + matcher.matches());
    }

}