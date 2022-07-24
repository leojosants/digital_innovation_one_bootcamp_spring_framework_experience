package modulo_1_POO_JAVA.POO.Heranca_Associacao_Interface.Associacao;

public class Compra {

	double valorDaCompra;
	Cupom cupom;

	public Compra() {}
	
	public Compra(Cupom cupom) {
		this.cupom = cupom;
	}

	public Cupom getCupom() {
		return cupom;
	}

	public void setCupom(Cupom cupom) {
		this.cupom = cupom;
	}

	public double getValorDaCompra() {
		return valorDaCompra;
	}

	public void setValorDaCompra(double valorDaCompra) {
		this.valorDaCompra = valorDaCompra;
	}
	
	double finalizarCompra(Cupom cupom) {
		return valorDaCompra -= cupom.valor;
	}
	
}
