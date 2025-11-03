public class CleanExtract {
    public static String extract(String s) {
        String clean = "";
        
        for (String subString : s.split("\\|")) {
            int dot = subString.indexOf('.');
            if (dot == -1) {
                clean = spaceJoin(clean, subString);
                continue;
            }
            
            String portion = "";
            for (int i = dot+1; i < subString.length(); i++) {
                char ch = subString.charAt(i);
                if (ch == '.') break;
                portion += ch;
            }

            clean = spaceJoin(clean, portion);
        }

        return clean;
    }

    static String spaceJoin(String a, String b) {
        String trimed = b.trim();
        if (!trimed.isEmpty()) {
            a += trimed + ' ';
        }
        return a;
    }
}
