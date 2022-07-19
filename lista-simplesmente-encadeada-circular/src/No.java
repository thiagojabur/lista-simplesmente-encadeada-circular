
public class No {
	private int valor;
	private No proximo;
	
	public No(int valor, No proximo) {
		this.valor = valor;
		this.proximo = proximo;
	}
	
	public No(int valor) {
		this.valor = valor;
		this.proximo = null;
	}
	
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public No getProximo() {
		return proximo;
	}
	public void setProximo(No proximo) {
		this.proximo = proximo;
	}

	public String toString() {
		return "" + valor;
	}

	
}
