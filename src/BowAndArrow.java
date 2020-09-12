
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

}
