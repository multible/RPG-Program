
public class Queen extends Character {

	public Queen(WeaponBehavior wb) {
		super(wb);
	}
	
	public Queen() {
		super();
	}

	@Override
	public String anzeigen() {
		System.out.println("See a Queen");
//		String anzeigen = "src\\res\\knight.jpg";
		String anzeigen = "queen.jpg";
		return anzeigen;
		
	}
	
	@Override
	public String getRole() {
		String queenRole = "Queen";
		return queenRole;
	}
	
}
