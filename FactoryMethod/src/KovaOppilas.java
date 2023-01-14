
public class KovaOppilas extends AterioivaOtus {

	@Override
	public Juoma createJuoma() {
		return new Piima();
	}

	@Override
	public Ruoka createRuoka() {
		return new LihapullatMuusi();
	}

}
