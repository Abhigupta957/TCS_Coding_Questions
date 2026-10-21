
class Solution {
    public boolean commonSubseq(String s1, String s2) {
        boolean[] seen = new boolean[256];

        for (int i = 0; i < s1.length(); i++) {
            seen[s1.charAt(i)] = true;
        }

        for (int i = 0; i < s2.length(); i++) {
            if (seen[s2.charAt(i)]) {
                return true;
            }
        }

        return false;
    }
}
