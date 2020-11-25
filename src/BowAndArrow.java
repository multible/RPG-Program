
public class BowAndArrow extends WeaponBehaviorClass implements WeaponBehavior {

	@Override
	public String waffeAnzeigen() {
		String anzeigen = "bow.jpg";
		return anzeigen;
	}

	@Override
	public String draw(String ownRole) {
		System.out.println(ownRole + ": Draws Bow and Arrows!");
		return null;
	}

	@Override
	public String holster(String ownRole) {
		System.out.println(ownRole + ": Holsters Bow and Arrows!");
		return null;
	}

	@Override
	void strike(String target,String ownRole) {
		System.out.println(ownRole + ": Shoots arrows at " + target + ", this motherfucker");
	}

	@Override
	void aim(String target,String ownRole) {
		System.out.println(ownRole + ": Aims with arrows at " + target + ", this motherfucker");
	}

	@Override
	void prepare(String ownRole) {
		System.out.println(ownRole + ": Reloads arrows");
	}

	@Override
	public String getName() {
		return "Bow and Arrow";
	}
}
