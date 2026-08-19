class Solution {
    public boolean halvesAreAlike(String s) {
        int n = s.length();
        int half = n / 2;
        int countA = 0;
        int countB = 0;
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < half; i++) {
            if (vowels.indexOf(s.charAt(i)) != -1) {
                countA++;
            }
            if (vowels.indexOf(s.charAt(i + half)) != -1) {
                countB++;
            }
        }
        return countA == countB;
    }
}