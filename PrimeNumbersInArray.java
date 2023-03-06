import java.util.*;
public class PrimeNumbersInArray {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {5, 7, 2, 1, 9, 6, 17, 7};
        HashSet<Integer> primeNumbers = new HashSet<>();

        for (int i : arr) {
            if (isPrime(i)) {
                primeNumbers.add(i);
            }
        }

        List<Integer> sortedPrimeNumbers = new ArrayList<>(primeNumbers);
        Collections.sort(sortedPrimeNumbers);

        System.out.println("Prime numbers in the array: " + sortedPrimeNumbers);
    }
}
