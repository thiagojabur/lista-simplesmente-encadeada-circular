
public class principal {

	public static void main(String[] args) {
		No node1, node2, node3, node4, node5;
		node1 = new No(1);
		node2 = new No(2);
		node3 = new No(3);
		node4 = new No(4);
		node5 = new No(5);
		ListaCircular listaCircular = new ListaCircular();
		listaCircular.inserir(node1);
		listaCircular.inserir(node2);
		listaCircular.inserir(node3);
		listaCircular.inserir(node4);
		listaCircular.inserir(node5);
		System.out.println(listaCircular);
		listaCircular.remover(node1);
		listaCircular.remover(node2);

		System.out.println(listaCircular);

	}

}
