// Base-Character for every Role in the program
public class Character {
	private WeaponBehavior currentWeapon;
	private WeaponBehavior waffenEigenschaft;
	
	public Character(WeaponBehavior wb) {
		waffenEigenschaft = wb;
	}
	
	//default character without weapon
	public Character() {
		waffenEigenschaft = new NoWeapon();
	}
	
// default fight method //
	public String fight(String target,String ownRole) {
		waffenEigenschaft.draw(ownRole);
		for(int i=0;i<3;i++) {
			waffenEigenschaft.useWeapon(target,ownRole);
		}
		waffenEigenschaft.holster(ownRole);
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
	public String getRole() {
		String basicRole = "Basic";
		return basicRole;
	}
}
