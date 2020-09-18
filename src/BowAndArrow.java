
public class BowAndArrow implements WeaponBehavior {

	@Override
	public String useWeapon(String target) {
		System.out.println("Shoots arrows at " + target + ", this motherfucker");
		return null;
	}

	@Override
	public String waffeAnzeigen() {
		String anzeigen = "src\\res\\bow.jpg";
		return anzeigen;
	}

	@Override
	public String draw() {
		System.out.println("Draw Bow and Arrows!");
		return null;
	}

	@Override
	public String holster() {
		System.out.println("Holster Bow and Arrows!");
		return null;
	}

}
