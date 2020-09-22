
public class Sword extends WeaponBehaviorClass implements WeaponBehavior{

	@Override
	public String waffeAnzeigen() {
		String anzeigen = "src\\res\\sword.png";
		return anzeigen;
	}

	@Override
	public String draw() {
		System.out.println("Draws Sword!");
		return null;
	}

	@Override
	public String holster() {
		System.out.println("Holsters Sword!");
		return null;
	}

	@Override
	void strike(String target) {
		System.out.println("Hits " + target +" with a Sword");
	}

	@Override
	void aim(String target) {
		System.out.println("Aims at " + target +" with a Sword");	
	}

	@Override
	void prepare() {
		System.out.println("Fondles the blade");	
	}
}
