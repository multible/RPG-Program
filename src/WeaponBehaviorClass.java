
public abstract class WeaponBehaviorClass {
	
	public void useWeapon() {
		prepare();
		aim();
		strike();
	}

	protected abstract void strike();

	protected abstract void aim();

	protected abstract void prepare();

}


// implementation von Template Pattern mithilfe einer abstrakten basisklasse !`?