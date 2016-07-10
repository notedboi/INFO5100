import java.util.Scanner;

public class Prime {

	private static Scanner s;

	public boolean isPrime(int number) {

		if (number == 1 || number == 0) {

			return false;
		}

		if (number == 2)
			return true;
		if (number % 2 == 0)
			return false;
		for (int i = 3; i * i <= number; i += 2)
			if (number % i == 0)
				return false;
		return true;

	}

	public static void main(String[] args) {

		Prime p = new Prime();
		System.out.println("Please input an integer:");
		s = new Scanner(System.in);
		int number = s.nextInt();
		boolean ret = p.isPrime(number);
		if (ret) {
			System.out.println(number + " is prime");
		} else {
			System.out.println(number + " is not prime");
		}
	}

}
