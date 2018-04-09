/**
 * SumSquareDifference
 */
public class SumSquareDifference {

   public static void main(String[] args) {
       int sumOfSquares = 0;
       int sumOfNumbers = 0;
       int difference = 0;

       for (int i = 1; i < 101; i++) {
           sumOfSquares += (i * i);
           sumOfNumbers += i;
       }

       difference = (sumOfNumbers * sumOfNumbers) - sumOfSquares;

       System.out.println(difference);

   } 
}