import java.util.Scanner;

public class MakeChangeApp {

	public static double[] changeType = { 20, 10, 5, 1, 0.25, 0.10, 0.05, 0.01 };

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Price of the item: ");
		double price = input.nextDouble();
		System.out.println("Amount pay: ");
		double amount = input.nextDouble();
		if (amount == price) {
			promptUserGoodday();
		} else if (amount < price) {
			promptUserNotEnough();
		} else {
			giveChange(price, amount);
			promptUserGoodday();
		}
		input.close();
	}

	public static void promptUserGoodday() {
		System.out.println("Thank you have a good day!");
	}

	public static void promptUserNotEnough() {
		System.out.println("Not enough!!");
	}

	public static void giveChange(double price, double amount) {
		double change = (amount - price) + 0.001;
		for (int i = 0; i < changeType.length; i++) {
			if (change >= changeType[i]) {
				amount = (int) (change / changeType[i]);
				change -= amount * changeType[i];
				System.out.println((int) amount + " $" + changeType[i]);
			}
		}
	}

}
