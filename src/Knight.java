
public class Knight extends Character {

	public Knight(WeaponBehavior wb) {
		super(wb);
	}
	
	public Knight() {
	}

	@Override
	public String anzeigen() {
		System.out.println("See a Knight");
//		String anzeigen = "src\\res\\knight.jpg";
		String anzeigen = "knight.jpg";
		return anzeigen;
		
	}
	
	public String getRole() {
		String knightRole = "Knight";
		return knightRole;
	}
}
