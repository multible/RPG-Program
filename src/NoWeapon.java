
public class NoWeapon implements WeaponBehavior{

	@Override
	public String useWeapon(String target) {
		System.out.println("Slaps " + target +" in the face!");
		return null;
	}

	@Override
	public String waffeAnzeigen() {
		String anzeigen = "src\\res\\fist.png";
		return anzeigen;
	}

	@Override
	public String draw() {
		System.out.println("Make fist");
		return null;
	}

	@Override
	public String holster() {
		System.out.println("Put fist in pocket!");
		return null;
	}

}
