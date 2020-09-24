
public class BowAndArrow extends WeaponBehaviorClass implements WeaponBehavior {

	@Override
	public String waffeAnzeigen() {
		String anzeigen = "bow.jpg";
		return anzeigen;
	}

	@Override
	public String draw() {
		System.out.println("Draws Bow and Arrows!");
		return null;
	}

	@Override
	public String holster() {
		System.out.println("Holsters Bow and Arrows!");
		return null;
	}

	@Override
	void strike(String target) {
		System.out.println("Shoots arrows at " + target + ", this motherfucker");
	}

	@Override
	void aim(String target) {
		System.out.println("Aims with arrows at " + target + ", this motherfucker");
	}

	@Override
	void prepare() {
		System.out.println("Reloads arrows");
	}
}
