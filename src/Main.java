
public class Main {

	public static void main(String[] args) {
		Character knight = new Knight(new Sword());
		knight.fight();
		
		knight.setCurrentWeapon(new BowAndArrow());
		
		knight.fight();
	}
}
