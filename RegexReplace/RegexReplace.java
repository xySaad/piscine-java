import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexReplace {
    public static String removeUnits(String s) {
        return s.replaceAll("(\\d)(?:cm|€)(\\s|$)", "$1$2");
    }

    public static String obfuscateEmail(String s) {
        StringBuilder result = new StringBuilder(s);
        Pattern pattern = Pattern
                .compile("(?:\\w+[\\.\\-_]|\\w{3})(\\w+)@(\\w+)\\.(?:\\w+\\.(\\w+)|(?:com|net|org)|(\\w+))");

        Matcher matcher = pattern.matcher(s);
        if (!matcher.matches())
            return s;

        for (int i = 1; i <= matcher.groupCount(); i++) {
            String sensitive = matcher.group(i);
            if (sensitive == null)
                continue;

            String placeholder = "*".repeat(sensitive.length());
            result = result.replace(matcher.start(i), matcher.end(i), placeholder);
        }

        return result.toString();
    }
}
