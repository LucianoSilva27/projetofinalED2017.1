package exemplo_ed;

public class LDE {
	
	class No {
		private No ant;
		private int conteudo;
		private No prox;
		
		public No(){
			setProx(null);
		}

		public int getConteudo() {
			return conteudo;
		}

		public void setConteudo(int conteudo) {
			this.conteudo = conteudo;
		}

		public No getProx() {
			return prox;
		}

		public void setProx(No prox) {
			this.prox = prox;
		}

		public No getAnt() {
			return ant;
		}

		public void setAnt(No ant) {
			this.ant = ant;
		}
	}
	
	private No inicio;
	private No fim;
	private int tamanho;
	
	public LDE(){
		inicio = null;
		fim = null;		
		tamanho = 0;
	}
	
	/** Verifica se a Lista estÃ¡ vazia */
	public boolean vazia() {
	    if (tamanho == 0)
	        return true;
	    else
	        return false;
	}

	/**ObtÃ©m o tamanho da Lista*/
	public int tamanho() {
	    return tamanho;
	}

	/** ObtÃ©m o i-Ã©simo elemento de uma lista
	    Retorna o valor encontrado. */
	public int elemento (int pos) {
	    No aux = inicio;
	    int cont = 1;

	    if (vazia()) {
	        return -1; // Consulta falhou 
	    }

	    if ((pos < 1) || (pos > tamanho())){
	        return -1; // Posicao invalida 
	    }

	    // Percorre a lista do 1o elemento atÃ© pos 
	    while (cont < pos){
	        // modifica "aux" para apontar para o proximo elemento da lista 
	        aux = aux.getProx();
	        cont++;
	    }

	    return aux.getConteudo();
	}

	/**Retorna a posiÃ§Ã£o de um elemento pesquisado.
	    Retorna 0 caso nÃ£o seja encontrado */
	public int posicao (int dado) {
	    int cont = 1;
	    No aux;

	    /* Lista vazia */
	    if (vazia()) {
	        return -1;
	    }

	    /* Percorre a lista do inicio ao fim atÃ© encontrar o elemento*/
	    aux = inicio;
		while (aux != null) {
	        /* Se encontrar o elemento, retorna sua posicao n;*/
	        if (aux.getConteudo() == dado){
	            return cont;
	        }

	        /* modifica "aux" para apontar para o proximo elemento da lista */
	        aux = aux.getProx();
	        cont++;
	    }

	    return -1;
	}

	/** Insere nÃ³ em lista vazia */
	private boolean insereInicioLista(int valor) {
		// Aloca memoria para novo no 
	    No novoNo = new No();
	    
	    // Insere novo elemento na cabeca da lista
	    novoNo.setConteudo(valor);
	    novoNo.setProx(inicio);
	    
	    novoNo.setAnt(null); // Nova instrucao
	    if (vazia())
    			fim = novoNo; // Nova instrucao
	    else
    			inicio.setAnt(novoNo); // Nova instrucao	    
	    
	    inicio = novoNo;
	    tamanho++;
	    return true;
	}

	/** Insere nÃ³ no meio da lista */
	private boolean insereMeioLista(int pos, int dado){
	    int cont = 1;

	    // Aloca memoria para novo no
	    No novoNo = new No();
	    novoNo.setConteudo(dado);

	    // Localiza a pos. onde serÃ¡ inserido o novo nÃ³
	    No aux = inicio;
	    while ((cont < pos-1) && (aux != null)){
	          aux = aux.getProx();
	          cont++;
	    }

	    if (aux == null) {  // pos. invÃ¡lida 
	    		return false;
	    }

	    // Insere novo elemento apos aux
	    novoNo.setAnt(aux); // Nova instrucao
	    novoNo.setProx(aux.getProx());
	    
	    aux.getProx().setAnt(novoNo); // Nova instrucao
	    
	    aux.setProx(novoNo);

	    tamanho++;
	    return true;
	}

	/** Insere nÃ³ no fim da lista */
	private boolean insereFimLista(int dado){
	    // Aloca memoria para novo no 
	    No novoNo = new No();
	    novoNo.setConteudo(dado);

	    // Procura o final da lista 
	    No aux = inicio;
	    while(aux.getProx() != null){
	        aux = aux.getProx();
	    }

	    novoNo.setProx(null);
	    aux.setProx(novoNo);
	    
	    novoNo.setAnt(fim);  // Nova instrucao
	    fim.setProx(novoNo); // Nova instrucao
	    fim = novoNo; 		// Nova instrucao
	    
	    this.tamanho++;
	    return true;
	}

	/**Insere um elemento em uma determinada posiÃ§Ã£o
	    Retorna true se conseguir inserir e 
	    false caso contrario */
	public boolean insere(int pos, int dado) {
		if ((vazia()) && (pos != 1)){
	        return false; /* lista vazia mas posicao inv*/
	    }

	 	/* inserÃ§Ã£o no inÃ­cio da lista (ou lista vazia)*/
	    if (pos == 1){
	        return insereInicioLista(dado);
	    }
	    /* inserÃ§Ã£o no fim da lista */
	    else if (pos == tamanho+1){
	        return insereFimLista(dado);
	   }
	   /* inserÃ§Ã£o no meio da lista */
	   else{
	        return insereMeioLista(pos, dado);
	   }
	}

	// Remove elemento do inÃ­cio de uma lista unitÃ¡ria
	private int removeInicioListaUnitaria(){          
	    int dado = inicio.getConteudo();
	    inicio = null;
	    fim = null; 
	    tamanho--;
	    return dado;
	}
	
	/** Remove elemento do inÃ­cio da lista */
	private int removeInicioLista(){
	    No p = inicio;

	    // Dado recebe o dado removido
	    int dado = p.getConteudo();

	    // Retira o 1o elemento da lista (p)
	    inicio = p.getProx();
	    p.getProx().setAnt(null);  // Nova instrucao
	    
	    tamanho--;

	    // Sugere ao garbage collector que libere a memoria
	    //  da regiao apontada por p
	    p = null;

	    return dado;
	}

	/** Remove elemento no meio da lista */
	private int removeMeioLista(int pos){
	     No p = inicio;
	     int n = 1;
	     
	     // Localiza o nÃ³ que serÃ¡ removido
	     while((n <= pos-1) && (p != null)){ 
	    	 	p = p.getProx();
	        n++;
	     }
	     
	     if (p == null) {
	    	 	return -1; // pos. invÃ¡lida
	     }
	     
	    	 int dado = p.getConteudo();
	    	 p.getAnt().setProx(p.getProx());
	    	 p.getProx().setAnt(p.getAnt());
			 
	     tamanho--;
	     
	     /* sugere ao garbage collector que libere a memoria
	     *  da regiao apontada por p*/
	    p = null;
	    return dado;
	}
	
	/** Remove elemento do inÃ­cio da lista */
	private int removeFimLista(){          
	     No p = fim;
	     int dado = p.getConteudo();
	     
	     fim.getAnt().setProx(null);
	     fim = fim.getAnt();
	     tamanho--;
	     
	     p = null; 
	     return dado;
	}

	
	/**Remove um elemento de uma determinada posiÃ§Ã£o
	    Retorna o valor a ser removido. 
	    -1 se a posiÃ§Ã£o for invÃ¡lida ou a lista estiver vazia*/
	public int remove(int pos) {
		// Lista vazia 
	    if (vazia()) {
	    		return -1;
	    }

	    // RemoÃ§Ã£o do elemento da cabeÃ§a da lista 
	    if ((pos == 1) && (tamanho() == 1)){ 
	 		 return removeInicioListaUnitaria();
	    }
	    else if (pos == 1){
	        return removeInicioLista();
	    }
	    // Remocao no fim da lista
	    else if (pos == tamanho()){ 
	 		 return removeFimLista();
	    }
	    // RemoÃ§Ã£o em outro lugar da lista
	    else{
	        return removeMeioLista(pos);
	    }
	}	
}
    
