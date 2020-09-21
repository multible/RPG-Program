
public abstract class WeaponBehaviorClass {
	
	 abstract void strike();
	 abstract void aim();
	 abstract void prepare();
	
	public final void useWeapon() {
		prepare();
		aim();
		strike();
		System.out.println("useWeapon abstrakte basisklasse");
	}

}


// implementation von Template Pattern mithilfe einer abstrakten basisklasse !`?