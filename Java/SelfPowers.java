import java.math.*;

public class SelfPowers {

    public static void main(String[] args) {
        BigInteger sum = new BigInteger("0");
		
		for(int i = 1; i <= 1000; i++) {
			BigInteger a = new BigInteger(Integer.toString(i));
			BigInteger b = a.pow(i);
			sum = sum.add(b);
		}
		int len = sum.toString().length();
        System.out.println(sum.toString().substring(len - 10));
    }
}