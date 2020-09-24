
public class Troll extends Character {

	public Troll(WeaponBehavior wb) {
		super(wb);
	}
	
	public Troll() {
		
	}
	
	@Override
	public String anzeigen() {
		System.out.println("See a Troll");
		String anzeigen = "troll.jpg";
		return anzeigen;
	}
}
