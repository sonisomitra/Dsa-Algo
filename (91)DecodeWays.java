class Solution {
    public int numDecodings(String s) {
        int n = s.length();

        if (n == 0 || s.charAt(0) == '0') {
            return 0;
        }

        int prev2 = 1;
        int prev1 = 1;

        for (int i = 2; i <= n; i++) {
            int current = 0;

            char one = s.charAt(i - 1);
            if (one != '0') {
                current += prev1;
            }

            int two = Integer.parseInt(s.substring(i - 2, i));

            if (two >= 10 && two <= 26) {
                current += prev2;
            }

            prev2 = prev1;
            prev1 = current;
        }

        return prev1;
    }
}
