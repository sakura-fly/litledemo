
public class Ttet {
	public static void main(String[] args) {
		printNum(15);
	}

	public static void printNum(int num) {

		for (int i = 1; i < num; i++) {
			int sum = i;
			for (int j = i + 1; sum < num; j++) {
				sum += j;
				if (sum == num) {
					String res = num + "=";
					for (int k = i; k < j; k++) {
						res += k + "+";
					}
					res += j;
					System.out.println(res);
				}
			}
		}
	}
}
