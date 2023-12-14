package one.digitalinnovation.gof.singleton;

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
