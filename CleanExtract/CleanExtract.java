public class CleanExtract {
    public static String extract(String s) {
        String[] splited = s.split("\\|");
        String clean = "";

        for (int i = 0; i < splited.length; i++) {
            String portion = getPortion(splited[i]).trim();
            if (!portion.isEmpty())
                clean = String.join(" ", clean, portion);
        }

        return clean.trim();
    }

    static String getPortion(String subString) {
        int firstDot = subString.indexOf('.');
        if (firstDot == -1)
            return subString;

        int lastDot = subString.lastIndexOf('.');
        if (lastDot == -1 || firstDot == lastDot)
            lastDot = subString.length();

        return subString.substring(firstDot + 1, lastDot);
    }
}
