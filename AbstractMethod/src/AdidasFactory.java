
public class AdidasFactory implements ClothingFactory {

	@Override
	public Cap makeCap() {
		return new AdidasCap();
	}

	@Override
	public Tshirt makeTshirt() {
		return new AdidasTshirt();
	}

	@Override
	public Jeans makeJeans() {
		return new AdidasJeans();
	}

	@Override
	public Shoes makeShoes() {
		return new AdidasShoes();
	}

}
