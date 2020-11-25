
public class Sword extends WeaponBehaviorClass implements WeaponBehavior{

	@Override
	public String waffeAnzeigen() {
		String anzeigen = "sword.png";
		return anzeigen;
	}

	@Override
	public String draw(String ownRole) {
		System.out.println(ownRole + ": Draws Sword!");
		return null;
	}

	@Override
	public String holster(String ownRole) {
		System.out.println(ownRole + ": Holsters Sword!");
		return null;
	}

	@Override
	void strike(String target, String ownRole) {
		System.out.println(ownRole + ": Hits " + target +" with a Sword");
	}

	@Override
	void aim(String target,String ownRole) {
		System.out.println(ownRole +": Aims at " + target +" with a Sword");	
	}

	@Override
	void prepare(String ownRole) {
		System.out.println(ownRole + ": Fondles the blade");	
	}

	@Override
	public String getName() 
	{
		return "Sword";
	}
}
