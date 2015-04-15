import java.util.*;

public class XWindows {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Bitte eingeben [+-*/] zahl1 zahl2: ");
		String operator = scanner.next();
		int zahl1 = scanner.nextInt();
		int zahl2 = scanner.nextInt();
		int result = 0;
		if (operator.equals("+")) {
			result = zahl1 + zahl2;
		} else if (operator.equals("-")) {
			result = zahl1 - zahl2;
		} else if (operator.equals("*")) {
			result = zahl1 * zahl2;
		}
		System.out.println(zahl1 + " " + operator + " " + zahl2 + " = " + result);
	}
}