
public class Character {
	private WeaponBehavior currentWeapon;
	private WeaponBehavior waffenEigenschaft;
	
	public Character(WeaponBehavior wb) {
		waffenEigenschaft = wb;
	}
	
	public String fight() {
//		System.out.println("FIGHT!!!");
		waffenEigenschaft.useWeapon();
		return null;
	}
	
//	public void setWeapon(WeaponBehavior wb) {
//		waffenEigenschaft = wb;
//	}

	public WeaponBehavior getCurrentWeapon() {
		return currentWeapon;
	}

	public void setCurrentWeapon(WeaponBehavior currentWeapon) {
		waffenEigenschaft = currentWeapon;
		this.currentWeapon = currentWeapon;
	}
	public void anzeigen() {
		System.out.println("See Basic Character");
	}
}
