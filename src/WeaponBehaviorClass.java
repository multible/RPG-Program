// implements "Template Pattern" with abstract class
public abstract class WeaponBehaviorClass {
	
	 abstract void strike(String target,String ownRole);
	 abstract void aim(String target,String ownRole);
	 abstract void prepare(String ownRole);
	 
// final makes this method unoverrideable [every class that inherits from this one, has this method with this order]
	public final void useWeapon(String target,String ownRole) {
		prepare(ownRole);
		aim(target,ownRole);
		strike(target,ownRole);
	}

}