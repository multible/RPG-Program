
public class NoWeapon extends WeaponBehaviorClass implements WeaponBehavior{

	@Override
	public String waffeAnzeigen() {
		String anzeigen = "fist.png";
		return anzeigen;
	}

	@Override
	public String draw(String ownRole) {
		System.out.println(ownRole + ": Makes fist");
		return null;
	}

	@Override
	public String holster(String ownRole) {
		System.out.println(ownRole + ": Puts fist in pocket!");
		return null;
	}

	@Override
	void prepare(String ownRole) {
		System.out.println(ownRole + ": Cracks knuckles!");
	}

	@Override
	void strike(String target,String ownRole) {
		System.out.println(ownRole + ": Slaps " + target + " in the face!");
	}

	@Override
	void aim(String target,String ownRole) {
		System.out.println(ownRole + ": Aims " + target + " at the face!");	
	}

	@Override
	public String getName() {
		return "Fist";
	}
}
