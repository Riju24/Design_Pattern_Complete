
public class AudiFactory extends Factory {

	@Override
	public Headlight makeHeadlight() {
		Headlight audiHeadlight = new AudiHeadlight();
		return audiHeadlight;
	}

	@Override
	public Tire makeTire() {
		Tire audiTire = new AudiTire();
		return audiTire;
	}

}
