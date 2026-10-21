public class EncryptString2 {
    public String encryptString(String S) {
        StringBuilder result = new StringBuilder();
        int i = 0;

        while (i < S.length()) {
            char ch = S.charAt(i);
            int count = 0;

            while (i < S.length() && S.charAt(i) == ch) {
                count++;
                i++;
            }

            result.append(ch);
            result.append(Integer.toHexString(count));
        }

        return result.reverse().toString();
    }
}
