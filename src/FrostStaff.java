
public class FrostStaff extends WeaponBehaviorClass implements WeaponBehavior{

	@Override
	public String waffeAnzeigen() {
		String anzeigen = "froststaff.png";
		return anzeigen;
	}

	@Override
	public String draw(String ownRole) {
		System.out.println(ownRole + ": Draws Frost Staff!");
		return null;
	}

	@Override
	public String holster(String ownRole) {
		System.out.println(ownRole + ": Holsters Frost Staff!");
		return null;
	}

	@Override
	void strike(String target,String ownRole) {
		System.out.println(ownRole + ": Casts magical spells at " + target );
	}

	@Override
	void aim(String target,String ownRole) {
		System.out.println(ownRole + ": Aims at " + target +" with a Frost Staff");	
	}

	@Override
	void prepare(String ownRole) {
		System.out.println(ownRole + ": Scrolls through tome");	
	}

}
