
public class King extends Character {

	public King(WeaponBehavior wb) {
		super(wb);
	}
	
	public King() {
		super();
	}

	@Override
	public String anzeigen() {
		System.out.println("See a King");
//		String anzeigen = "src\\res\\knight.jpg";
		String anzeigen = "king.jpg";
		return anzeigen;
		
	}
	
	public String getRole() {
		String kingRole = "King";
		return kingRole;
	}
	
}