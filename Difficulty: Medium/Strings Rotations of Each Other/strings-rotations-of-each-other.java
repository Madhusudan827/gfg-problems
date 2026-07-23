class Solution {
    public boolean areRotations(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        String txt = s1 + s1;
        String pat = s2;

        return kmpSearch(txt, pat);
    }

    private boolean kmpSearch(String txt, String pat) {
        int n = txt.length();
        int m = pat.length();

        int[] lps = lpsArray(pat, m);

        int i = 0;
        int j = 0;

        while (i < n) {

            if (txt.charAt(i) == pat.charAt(j)) {
                i++;
                j++;
            }

            if (j == m) {
                return true;
            } else if (i < n && txt.charAt(i) != pat.charAt(j)) {   // Corrected here
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }

        return false;
    }

    public int[] lpsArray(String pat, int m) {
        int[] lps = new int[m];
        int len = 0;
        int i = 1;

        while (i < m) {
            if (pat.charAt(i) == pat.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }

        return lps;
    }
}