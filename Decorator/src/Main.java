
public class Main {

	public static void main(String[] args) {

		IPizza tropicana = new Pineapple(new Ham(new PizzaSauce()));
		IPizza margherita = new Cheese(new PizzaSauce());
		IPizza special = new Ham(new Mushroom(new Onion(new PizzaSauce())));

		System.out.println("Tropicana: \n" + tropicana.getDescription() + "\n" + tropicana.getPrice() + "€\n");
		System.out.println("Margherita: \n" + margherita.getDescription() + "\n" + margherita.getPrice() + "€\n");
		System.out.println("Special: \n" + special.getDescription() + "\n" + special.getPrice() + "€\n");
	}

}