// interface WeaponBehavior
public interface WeaponBehavior {
	public void useWeapon(String target, String ownRole);
	public String waffeAnzeigen();
	public String draw(String ownRole);
	public String holster(String ownRole);
	
	public String getName();
}
