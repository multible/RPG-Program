
public class FrostStaff extends WeaponBehaviorClass implements WeaponBehavior{

	@Override
	public String waffeAnzeigen() {
		String anzeigen = "src\\res\\froststaff.png";
		return anzeigen;
	}

	@Override
	public String draw() {
		System.out.println("Draws Frost Staff!");
		return null;
	}

	@Override
	public String holster() {
		System.out.println("Holsters Frost Staff!");
		return null;
	}

	@Override
	void strike(String target) {
		System.out.println("Casts magical spells at " + target );
	}

	@Override
	void aim(String target) {
		System.out.println("Aims at " + target +" with a Frost Staff");	
	}

	@Override
	void prepare() {
		System.out.println("Scrolls through tome");	
	}

}
