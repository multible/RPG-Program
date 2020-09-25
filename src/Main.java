
public class Main {

	public static void main(String[] args) {
		Character knight = new Knight();
		knight.fight("deine mutter",knight.getRole());
		
		knight.setCurrentWeapon(new Sword());
		
		knight.fight("deinen vater",knight.getRole());
		
//		knight.getCurrentWeapon().useWeapon("deine oma");
	}
}
