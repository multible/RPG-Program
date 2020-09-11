
public class Sword implements WeaponBehavior{

	@Override
	public String useWeapon() {
		System.out.println("Hits em with a Sword");
		return null;
	}

	@Override
	public String waffeAnzeigen() {
		String anzeigen = "src\\res\\sword.png";
		return anzeigen;
	}

}
