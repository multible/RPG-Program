
public class NoWeapon extends WeaponBehaviorClass implements WeaponBehavior{

	@Override
	public String waffeAnzeigen() {
		String anzeigen = "src\\res\\fist.png";
		return anzeigen;
	}

	@Override
	public String draw() {
		System.out.println("Makes fist");
		return null;
	}

	@Override
	public String holster() {
		System.out.println("Puts fist in pocket!");
		return null;
	}

	@Override
	void prepare() {
		System.out.println("Cracks knuckles!");
	}

	@Override
	void strike(String target) {
		System.out.println("Slaps " + target + " in the face!");
	}

	@Override
	void aim(String target) {
		System.out.println("Aims " + target + " at the face!");	
	}
}
