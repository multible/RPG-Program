// Base-Character for every Role in the program
public class Character {
	private WeaponBehavior currentWeapon;
	private WeaponBehavior waffenEigenschaft;
	
	public Character(WeaponBehavior wb) {
		waffenEigenschaft = wb;
	}
	
// default fight method //
	public String fight(String target) {
		waffenEigenschaft.draw();
		for(int i=0;i<5;i++) {
			waffenEigenschaft.useWeapon(target);
		}
		waffenEigenschaft.holster();
		return null;
	}
	
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
