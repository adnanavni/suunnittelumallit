
public class Main {
	public static void main(String[] args) {
		BurgerBuilder hesburgerBuilder = new HesburgerBuilder();
		BurgerBuilder mcdonaldsBuilder = new McDonaldsBuilder();

		BurgerDirector director = new BurgerDirector(hesburgerBuilder);
		director.makeBurger();
		Burger hesburger = director.getBurger();
		System.out.println("Hesburger:\n" + hesburger);

		director = new BurgerDirector(mcdonaldsBuilder);
		director.makeBurger();
		Burger mcdonalds = director.getBurger();
		System.out.println("McDonald's:\n" + mcdonalds);
	}
}
