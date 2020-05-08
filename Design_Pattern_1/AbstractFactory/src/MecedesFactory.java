
public class MecedesFactory extends Factory {

	@Override
	public Headlight makeHeadlight() {
		Headlight mercedesHeadlight = new MercedesHeadlight();
		return mercedesHeadlight;
	}

	@Override
	public Tire makeTire() {
		Tire mercedesTire = new MercedesTire();
		return mercedesTire;
	}

}
