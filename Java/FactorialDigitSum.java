import java.math.BigInteger;

class FactorialDigitSum {
    public static void main(String[] args) {
        BigInteger factorial = factorial(new BigInteger("100"));
        int sum = 0;
        String[] numbers = factorial.toString().split("");

        for (String num : numbers) {
            sum += Integer.parseInt(num);
        }

        System.out.println(sum);
    }

    public static BigInteger factorial(BigInteger n) {
        if (n.equals(BigInteger.ONE)) {
            return BigInteger.ONE;
        } else {
            BigInteger t = factorial(n.subtract(BigInteger.ONE));
            return n.multiply(t);
        }
    }
}