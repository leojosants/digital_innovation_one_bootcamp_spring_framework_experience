import one.digitalinnovation.gof.facade.Facade;

public class Test {

	public static void main(String[] args) {

		// Testes relacionados ao Design Pattern Singleton

//		SingletonLazy lazy = SingletonLazy.getInstancia();
//		System.out.println(lazy);
//		lazy = SingletonLazy.getInstancia();
//		System.out.println(lazy);
//		System.out.println();
//		
//		SingletonEager eager = SingletonEager.getInstancia();
//		System.out.println(eager);
//		eager = SingletonEager.getInstancia();
//		System.out.println(eager);
//		System.out.println();
//		
//		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
//		System.out.println(lazyHolder);
//		lazyHolder = SingletonLazyHolder.getInstancia();
//		System.out.println(lazyHolder);

		
		// Testes relacionados ao Design Pattern Strategy

//		Comportamento normal = new ComportamentoNormal();
//		Comportamento defensivo = new ComportamentoDefensivo();
//		Comportamento agressivo = new ComportamentoAgressivo();
//
//		Robo robo = new Robo();
//
//		robo.setComportamento(normal);
//		robo.mover();
//
//		robo.setComportamento(defensivo);
//		robo.mover();
//
//		robo.setComportamento(agressivo);
//		robo.mover();

		
		// Testes relacionados ao Design Pattern Facade
		
		Facade facade = new Facade();
		facade.migrarCliente("Leonardo", "11.111-111");
		
	}

}
