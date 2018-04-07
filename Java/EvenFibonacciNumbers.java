class EvenFibonacciNumbers {
    public static void main(String[] args) {
        int sum = 0;
        int prev = 0;
        int curr = 1;

        while (curr < 4000000) {
            if (curr % 2 == 0) {
                sum += curr;
            }
            int tmp = curr;
            curr += prev;
            prev = tmp;
        }
        System.out.println(sum);
    }
}