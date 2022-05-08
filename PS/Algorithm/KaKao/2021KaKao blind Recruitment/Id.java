/*신규 아이디 추천 */

public class Id {
    public String solution(String new_id) {
        String answer = "";
        new_id = new_id.toLowerCase();
        char[] arr = new_id.toCharArray();
        StringBuffer str = new StringBuffer();
        for (char c : arr) {
            if (('a' <= c && 'z' >= c) || ('0' <= c && '9' >= c) || c == '-' || c == '_' || c == '.')
                str.append(c);
        }

        String str2 = str.toString().replace("..", ".");

        while (str2.contains("..")) {
            str2 = str2.replace("..", ".");
        }
        if (str2.length() > 0) {
            if (str2.charAt(0) == '.')
                str2 = str2.substring(1, str2.length());
        }
        if (str2.length() > 0) {
            if (str2.charAt(str2.length() - 1) == '.')
                str2 = str2.substring(0, str2.length() - 1);
        }
        if (str2.equals("")) {
            str2 = "a";
        }
        if (str2.length() > 15) {
            str2 = str2.substring(0, 15);
        }
        if (str2.length() > 0) {
            if (str2.charAt(str2.length() - 1) == '.')
                str2 = str2.substring(0, str2.length() - 1);
        }
        StringBuffer str3 = new StringBuffer(str2);
        if (str3.length() <= 2) {
            char last = str3.charAt(str3.length() - 1);
            while (str3.length() < 3) {
                str3.append(last);
            }
        }

        answer = str3.toString();
        return answer;
    }
}
