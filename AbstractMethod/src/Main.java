
public class Main {

	public static void main(String[] args) {

		ClothingBrand jasper = new ClothingBrand(new AdidasFactory());

		System.out.println(jasper);

		jasper.changeClothingBrand(new BossFactory());

		System.out.println(jasper);
	}

}
