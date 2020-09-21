
public class Main {

	public static void main(String[] args) {
		Character knight = new Knight(new Sword());
		knight.fight("deine mutter");
		
		knight.setCurrentWeapon(new NoWeapon());
		
		knight.fight("deinen vater");
		
		knight.getCurrentWeapon().useWeapon("deine oma");
	}
}
