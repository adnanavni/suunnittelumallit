
public class ClothingBrand {

	private Tshirt tshirt;
	private Cap cap;
	private Jeans jeans;
	private Shoes shoes;

	public ClothingBrand(ClothingFactory clothingFactory) {
		this.tshirt = clothingFactory.makeTshirt();
		this.cap = clothingFactory.makeCap();
		this.jeans = clothingFactory.makeJeans();
		this.shoes = clothingFactory.makeShoes();
	}

	public void changeClothingBrand(ClothingFactory clothingFactory) {
		this.tshirt = clothingFactory.makeTshirt();
		this.cap = clothingFactory.makeCap();
		this.jeans = clothingFactory.makeJeans();
		this.shoes = clothingFactory.makeShoes();
	}

	@Override
	public String toString() {
		return "Vaatetus: Lippis:" + cap + " T-paita: " + tshirt + " Farkut: " + jeans + " kengät: " + shoes;
	}
}
