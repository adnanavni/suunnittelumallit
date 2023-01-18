
public class BossFactory implements ClothingFactory {

	@Override
	public Cap makeCap() {
		return new BossCap();
	}

	@Override
	public Tshirt makeTshirt() {
		return new BossTshirt();
	}

	@Override
	public Jeans makeJeans() {
		return new BossJeans();
	}

	@Override
	public Shoes makeShoes() {
		return new BossShoes();
	}

}
