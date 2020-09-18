
public class Character {
	private WeaponBehavior currentWeapon;
	private WeaponBehavior waffenEigenschaft;
	
	public Character(WeaponBehavior wb) {
		waffenEigenschaft = wb;
	}
	
	public String fight(String target) {
//		System.out.println("FIGHT!!!");
		waffenEigenschaft.draw();
		for(int i=0;i<5;i++) {
			waffenEigenschaft.useWeapon(target);
		}
		waffenEigenschaft.holster();
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
	public String anzeigen() {
		System.out.println("See Basic Character");
		return null;
	}
}
