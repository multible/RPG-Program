// implements "Template Pattern" with abstract class
public abstract class WeaponBehaviorClass {
	
	 abstract void strike(String target);
	 abstract void aim(String target);
	 abstract void prepare();
	 
// final makes this method unoverrideable [every class that inherits from this one, has this method with this order]
	public final void useWeapon(String target) {
		prepare();
		aim(target);
		strike(target);
		System.out.println("useWeapon abstrakte basisklasse");
	}

}