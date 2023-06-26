import java.util.Arrays;

class PrimeCalculator {
    int nth(int nth) {
        if (nth <= 0) {
            throw new IllegalArgumentException("The input must be a positive integer.");
        }

        int count = 0;
        int number = 2;

        while (true) {
            if (isPrime(number)) {
                count++;
                if (count == nth) {
                    return number;
                }
            }
            number++;
        }
    }

    private boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

}
