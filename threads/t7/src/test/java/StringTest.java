public class StringTest {
    public static String stringout(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isLetter(s.charAt(i)) && s.charAt(i) != ' ')
                return "包含其他字符";
            if (i == 0 && s.charAt(i) == ' ') {
                stringBuilder.append(s.charAt(i));
            } else if (i == 0 && Character.isLowerCase(s.charAt(i))) {
                stringBuilder.append(Character.toUpperCase(s.charAt(i)));
            }

            if (i > 0 && s.charAt(i - 1) == ' ' && s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                stringBuilder.append(Character.toUpperCase(s.charAt(i)));
            } else {
                stringBuilder.append(s.charAt(i));
            }
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String s = "   hefjasf dslkfj dkfjsl   dfj  ijfds s s fs";
        System.out.println(stringout(s));
    }
}
