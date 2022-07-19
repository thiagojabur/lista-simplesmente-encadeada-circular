
public class ListaCircular {
	No cursor;
    private int quantidadeElementos = 0;
	
	public void inserir(No novoNo) {
		if (quantidadeElementos == 0 ) {
			cursor = novoNo;
			novoNo.setProximo(novoNo);
		} else {	
			novoNo.setProximo(cursor.getProximo());
			cursor.setProximo(novoNo);
			advance();
		}	
		quantidadeElementos += 1;	
	}

	public int getQuantidadeElementos() {
		return quantidadeElementos;
	}
	
	public void advance(){
        cursor = cursor.getProximo();
    }

	public String toString() {
		String retorno ="";
		
		for (int i=0; i<quantidadeElementos; i++) {
			advance();
			retorno += cursor.getValor() + " ";	
		}
		return retorno;
	}
	
	
	boolean remover(No noRemover) {
		if (quantidadeElementos == 0) return false;
		
		if (buscar(noRemover.getValor())) {
			//achar o anterior do noRemover
			//laço com tamanho n-1
			
			No anterior = noRemover;
			
			for (int i=0; i<quantidadeElementos-1; i++) {
				anterior = anterior.getProximo();
			}
			
			//se estiver apagando o cursor, então colocar como cursor o anterior 
			if (noRemover == cursor)
				 cursor = anterior;
			
			anterior.setProximo(noRemover.getProximo());
			noRemover.setProximo(noRemover);
			
			quantidadeElementos--;
			return true;
		}
		
		return false;
	}
	
	boolean buscar(int numeroBuscado) {
		if (quantidadeElementos == 0) return false;
		
		//enquanto percorre todos os elementos
		No cursorInicial = cursor;
		for (int i=0; i<quantidadeElementos; i++) {
			
			//compara cada elemento com o numero buscado
			if (cursor.getValor() == numeroBuscado) {
				cursor = cursorInicial;
				return true;
			}		
			advance();
		}
		
		cursor = cursorInicial;
		return false;
	}
	
}
