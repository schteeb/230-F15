import java.text.DecimalFormat;


public class SumExample {

	public static int recursive(int n) {
		if (n < 1)
			return 0;
		else
			return n + recursive(n-1);
	}

	public static int nested_loop(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++)
			for (int j = 1; j <= i; j++)
				sum++;
		return sum;
	}

	public static int iterative(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++)
			sum += i;
		return sum;
	}

	public static int equation(int n) {
		return n * (n + 1) / 2;
	}

	public static void main(String[] args) {
		long start, end; 
		DecimalFormat df = new DecimalFormat("####0.0000");
		int numbers[] = {1, 1, 1, 10, 100, 1000, 100000, 1000000, 1000000000};

		for (int n : numbers) {
			double[] time = new double[4];

			start = System.nanoTime();
			try {
				recursive(n);
				end = System.nanoTime();
				time[0] = (end - start) / 1000000d;
			} catch (StackOverflowError e) {
				time[0] = Double.NaN;
			}
			

			start = System.nanoTime();
			nested_loop(n);
			end = System.nanoTime();
			time[1] = (end - start) / 1000000d;

			start = System.nanoTime();
			iterative(n);
			end = System.nanoTime();
			time[2] = (end - start) / 1000000d;

			start = System.nanoTime();
			equation(n);
			end = System.nanoTime();
			time[3] = (end - start) / 1000000d;

			System.out.println("\n####### " + n + " #######");
			System.out.println("Recursive:   " + df.format(time[0]) + " ms");
			System.out.println("Nested Loop: " + df.format(time[1]) + " ms");
			System.out.println("Iterative:   " + df.format(time[2]) + " ms");
			System.out.println("Equation:    " + df.format(time[3]) + " ms");
		}
	}
}
