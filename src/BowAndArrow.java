
public class BowAndArrow implements WeaponBehavior {

	@Override
	public String useWeapon() {
		System.out.println("Shoots arrows at this motherfucker");
		return null;
	}

	@Override
	public String waffeAnzeigen() {
		String anzeigen = "src\\res\\bow.jpg";
		return anzeigen;
	}

}
