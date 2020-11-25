
public class HeroFactory 
{
	WeaponBehavior selectWeapon;
	Character chara;
	
	public Character chooseChar(String charac, String weapon) 
	{

		
		switch(weapon) {
		case "Sword":
			selectWeapon = new Sword();
			break;
		case "Bow and Arrow":
			selectWeapon = new BowAndArrow();
			break;
		case "No Weapon":
			selectWeapon = new NoWeapon();
			break;
		case "Frost Staff":
			selectWeapon = new FrostStaff();
			break;
		default:
			selectWeapon = new NoWeapon();
		}
				

	switch(charac) {
	case "Knight":
		chara = new Knight(selectWeapon);
		break;
	case "Troll":
		chara = new Troll(selectWeapon);
		break;
	case "Queen":
		chara = new Queen(selectWeapon);
		break;
	case "King":
		chara = new King(selectWeapon);
		break;
	default:
		chara = new Knight(selectWeapon);
	}
	return chara;
	}
	
	public Character getChar() 
	{
		return chara;
	}
	
	public WeaponBehavior getWeapon() 
	{
		return selectWeapon;
	}
	
}
