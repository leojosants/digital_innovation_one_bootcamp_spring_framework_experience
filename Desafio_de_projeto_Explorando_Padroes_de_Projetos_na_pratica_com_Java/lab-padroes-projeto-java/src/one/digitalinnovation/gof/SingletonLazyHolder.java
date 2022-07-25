package one.digitalinnovation.gof;

public class SingletonLazyHolder {

	private class InstanceHolder {
		private static SingletonLazyHolder instance = new SingletonLazyHolder();
	}

	private SingletonLazyHolder() {
		super();
	}

	public static SingletonLazyHolder getInstancia() {
		return InstanceHolder.instance;
	}

}
