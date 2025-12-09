import java.util.ArrayList;
import java.util.Scanner;
public class PrimeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter starting number: ");
        int start = scanner.nextInt();
        System.out.print("Enter ending number: ");
        int end = scanner.nextInt();

        ArrayList<Integer> primeList = new ArrayList<>();

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                primeList.add(i);
            }
        }
        int[] primes = new int[primeList.size()];
        for (int i = 0; i < primeList.size(); i++) {
            primes[i] = primeList.get(i);
        }

        System.out.println("Prime numbers between " + start + " and " + end + ":");
        for (int prime : primes) {
            System.out.print(prime + " ");
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
