package arraysandstrings;

class odd extends Thread {
	int[] number;

	odd(int[] num) {
		this.number = num;
	}

	@Override
	public void run() {
		System.out.println("Odd numbers are:");
		for (int i = 0; i < number.length; i++) {
			if (number[i] % 2 != 0) {
				System.out.println(i);
			}
		}
	}
}

class even extends Thread {
	int[] number;

	even(int[] num) {
		this.number = num;
	}

	@Override
	public void run() {
		System.out.println("Even Numbers are");
		for (int i = 0; i < number.length; i++) {
			if (number[i] % 2 == 0) {
				System.out.println(i);
			}
		}
	}

}

public class EvenOdNumberThread {
	public static void main(String[] args) throws InterruptedException {
		int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		odd odd1 = new odd(arr);
		even even1 = new even(arr);

		odd1.start();

		Thread.sleep(5000);
		even1.start();

	}
}