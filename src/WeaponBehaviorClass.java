
public abstract class WeaponBehaviorClass {
	
	 abstract void strike(String target);
	 abstract void aim(String target);
	 abstract void prepare();
	
	public final void useWeapon(String target) {
		prepare();
		aim(target);
		strike(target);
		System.out.println("useWeapon abstrakte basisklasse");
	}

}


// implementation von Template Pattern mithilfe einer abstrakten basisklasse !`?