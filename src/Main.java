
public class Main {

	public static void main(String[] args) {
		Character knight = new Knight();
		knight.fight("deine mutter");
		
		knight.setCurrentWeapon(new Sword());
		
		knight.fight("deinen vater");
		
		knight.getCurrentWeapon().useWeapon("deine oma");
	}
}
