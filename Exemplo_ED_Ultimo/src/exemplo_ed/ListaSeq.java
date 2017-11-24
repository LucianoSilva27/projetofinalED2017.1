package exemplo_ed;


public class ListaSeq {
    private int dados[]; // Vetor que contÃ©m os dados da lista 
    private int nElementos; 
    private int tamMax;
    
    public ListaSeq(){
    		tamMax = 100;
    		nElementos = 0;
    		dados = new int[tamMax];
    }
    
    public ListaSeq(int n){
    		tamMax = n;
    		nElementos = 0;
		dados = new int[tamMax];
    }

    /** Verifica se a Lista estÃ¡ vazia */
    public boolean vazia(){
		if (nElementos == 0 )
			return true;
		else
			return false;
	}
	
    /**Verifica se a Lista estÃ¡ cheia */
    public boolean cheia(){
		if (nElementos == tamMax)
			return true;
		else
			return false;
	}
	
    /**ObtÃ©m o tamanho da Lista*/
    public int tamanho(){
		return nElementos;
	}
    
    /** ObtÃ©m o i-Ã©simo elemento de uma lista.
    		Retorna -1 se a posiÃ§Ã£o for invÃ¡lida. */
    public int elemento(int pos){
        
    	/* Se posiÃ§Ã£o estiver fora dos limites <= 0 
         * ou > tamanho da lista */
        if ((pos > nElementos) || (pos <= 0))
            return -1;

       return dados[pos-1];
    }

    /**	Retorna a posiÃ§Ã£o de um elemento pesquisado.
    		Retorna -1 caso nÃ£o seja encontrado */
	public int posicao (int valor){
	    /* Procura elemento a elemento, se o dado estÃ¡ na
	    		lista. Se estiver, retorna a sua posiÃ§Ã£o no array+1 */
	    for (int i = 0; i < nElementos; i++){
	        if (dados[i] == valor){
	            return (i + 1);
	        }
	    }

	    return -1;
	}
	
	/**	Retorna a posiÃ§Ã£o de um elemento pesquisado.
	Retorna -1 caso nÃ£o seja encontrado */
	public int posicao (int valor, int desloc){
		/* Procura elemento a elemento, se o dado estÃ¡ na
		lista. Se estiver, retorna a sua posiÃ§Ã£o no array+1 */
		for (int i = desloc+1; i < nElementos; i++){
		    if (dados[i] == valor){
		        return (i + 1);
		    }
		}
		
		return -1;
	}
	
	/**Insere um elemento em uma determinada posiÃ§Ã£o
    		Retorna false se a lista estiver cheia ou
    		a posiÃ§Ã£o for invÃ¡lida. Caso contrÃ¡rio retorna true */
	public boolean insere (int pos, int dado){
	    /* Verifica se a lista estÃ¡ cheia ou se a posicao a ser
	    inserida eh invalida (i.e., > tamanho da lista+1*/
	    if (cheia() || (pos > nElementos+1) || (pos <=0)){
	        return false;
	    }

	    /* Desloca os elementos apÃ³s pos, uma posicao a
	    direita. Isso serve para abrir espaÃ§o para insercao
	    do novo elemento */
	    for (int i = nElementos; i >= pos; i--){
	 		 dados[i] = dados[i-1];
	    }

	    /* Insere o dado na posicao correta */
	    dados[pos - 1] = dado;

	 	/* Incrementa o numero de elementos na lista */
	    nElementos++;
	    return true;
	}
	
	/**Remove um elemento de uma determinada posiÃ§Ã£o
    Retorna o valor do elemento removido. -1 caso a remoÃ§Ã£o falhe  */
	public int remove(int pos){
	    int dado;
		/* Verifica se a posicao eh valida */
	    if ((pos > nElementos) || (pos < 1 ))
			   return -1;

	    /* Armazena o dado a ser removido na var "dado" */
	    dado = dados[pos-1];

	    /* Desloca todos os elementos apÃ³s 'pos', uma
	    posicao a esquerda */
	    for (int i = pos - 1; i < nElementos - 1; i++){
	 		  dados[i] = dados[i+1];
		 }

	   /* Decrementa o numero de elementos na lista */
	    nElementos--;
	    return dado;
	}
    
}
