import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;

class PowerDigitSum {
    public static void main(String[] args) {
        BigDecimal sum = new BigDecimal(Math.pow(2, 1000));

        long digitSum = 0;
        String[] numbers = sum.toString().split("");

        for (int i = 0; i < numbers.length; i++) {
            digitSum += Long.parseLong(numbers[i]);
        }

        System.out.println(digitSum);
        
    }
}