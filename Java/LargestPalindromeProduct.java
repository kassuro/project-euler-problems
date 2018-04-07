class LargestPalindromeProduct {
    public static void main(String[] args) {
        int largestPalindrom = 0;
        for (int i = 999; i > 99; i--) {
            for (int j = 100; i > j; j++) {
                int num = i * j;
                if (isPalindrom(num) && num > largestPalindrom) {
                    largestPalindrom = num;
                }
            }
       }
       System.out.println(largestPalindrom);
    }

    public static boolean isPalindrom(int n) {
        int reverse = 0;
        int orginalNum = n;
        while (n > 0) {
            int lastDigit = n % 10;
            reverse = (reverse * 10) + lastDigit;
            n /= 10;
        }

        return reverse == orginalNum;
    }
}