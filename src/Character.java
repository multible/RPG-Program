
public class Character {
	private String currentWeapon;
	private WeaponBehavior waffenEigenschaft;
	
	public Character(WeaponBehavior wb) {
		waffenEigenschaft = wb;
	}
	
	public String fight() {
		System.out.println("FIGHT!!!");
		return null;
	}
	
	public void setWeapon(WeaponBehavior wb) {
		waffenEigenschaft = wb;
	}
	
}
