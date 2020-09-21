
public class NoWeapon extends WeaponBehaviorClass implements WeaponBehavior{

//	@Override
//	public String useWeapon(String target) {
//		System.out.println("Slaps " + target +" in the face!");
//		return null;
//	}

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

	@Override
	void strike() {
		System.out.println("Slaps in the face!");
		
	}

	@Override
	void aim() {
		System.out.println("Aims at the face!");
		
	}

	@Override
	void prepare() {
		System.out.println("Cracks knuckles!");
	}

	@Override
	public String useWeapon(String target) {
		super.useWeapon();
		return null;
	}
}
