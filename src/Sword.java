
public class Sword implements WeaponBehavior{

	@Override
	public String useWeapon(String target) {
		System.out.println("Hits " + target +" with a Sword");
		return null;
	}

	@Override
	public String waffeAnzeigen() {
		String anzeigen = "src\\res\\sword.png";
		return anzeigen;
	}

	@Override
	public String draw() {
		System.out.println("Draw Sword!");
		return null;
	}

	@Override
	public String holster() {
		System.out.println("Holster Sword!");
		return null;
	}

}
