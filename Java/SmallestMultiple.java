class SmallestMutlie {
    // find the smallest multiple of the numbers 1 to 20
    public static void main(String[] args) {
        int number = 2520;
        boolean isDivisbale = true;

        do {
            isDivisbale = true;
            for (int i = 1; i <= 20; i++) {
                if (number % i != 0) {
                    isDivisbale = false;
                    number += 2;
                    break;
                }
            }
        } while (!isDivisbale);

        System.out.println(number);
    }
}