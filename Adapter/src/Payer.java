
public class Payer implements Payment {

	PaymentAdapter paymentAdapter;

	@Override
	public void pay(String paymentType, int amount) {

		if (paymentType.equalsIgnoreCase("check")) {
			System.out.println("Paying with a check, amount: " + amount);
		}

		else if (paymentType.equalsIgnoreCase("card") || paymentType.equalsIgnoreCase("cash")) {
			paymentAdapter = new PaymentAdapter(paymentType);
			paymentAdapter.pay(paymentType, amount);
		}

		else {
			System.out.println("Invalid payment type. " + paymentType + " not supported");
		}

	}

}