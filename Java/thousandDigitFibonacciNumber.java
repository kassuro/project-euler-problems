import java.math.BigInteger; // Import BigInteger class

class thousandDigitFibonacciNumber {
    public static void main(String[] args) {
        int index = 0;
        // Using BigInterger class since long is to small for 1000 digit numbers
        BigInteger prev = new BigInteger("1");
        BigInteger curr = new BigInteger("0");

        while (curr.toString().length() < 1000) {
            index++;
            BigInteger tmp = curr;
            curr = curr.add(prev);
            prev = tmp;
        }
        System.out.println(index);
    }
}