package exemplo_ed;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dayane
 */

public class FilasSeq {
	private int dados[];
	private int inicio;
	private int fim;
	
	private int nElementos;
	private int tamMax;
	
	public FilasSeq() {
		inicio = 0;
		fim = -1;
		nElementos = 0;
		
		tamMax = 100;
		dados =  new int[tamMax];
	}
	
	public FilasSeq(int n) {
		inicio = 0;
		fim = -1;
		nElementos = 0;
		
		tamMax = n;
		dados =  new int[tamMax];
	}

	/** Verifica se a Fila está vazia */
	public boolean vazia () {
		if (nElementos == 0)
			return true;
		else
			return false;
	}

	/**Verifica se a Fila está cheia */
	public boolean cheia () {
		if (nElementos == tamMax)
			return true;
		else
			return false;
	}
        
        public int elemento(int pos){
        
    	/* Se posiÃ§Ã£o estiver fora dos limites <= 0 
         * ou > tamanho da lista */
        if ((pos > nElementos) || (pos <= 0))
            return -1;

       return dados[pos-1];
    }

	/** Obtém o tamanho da Fila */
	public int tamanho() {
		return nElementos;
	}

	/** Consulta o elemento do início da fila.
	    Retorna -1 se a fila estiver vazia. */
	public int primeiro() {
		if (vazia())
			return -1; // Erro: Fila vazia 
		
		return dados[inicio];
	}

	/**Insere um elemento no fim de uma fila
    Retorna false se a fila estiver cheia, true caso contrário. */
	public boolean insere(int valor) {
		if (cheia()){
			return false;
		}
	
		fim = (fim + 1) % tamMax; // Circularidade 
	    dados[fim] = valor;
		nElementos++;
		return true;
	}

	/**Remove o elemento do início da fila e retorna o valor removido.
	    Retorna -1 se a fila estiver vazia.*/
	public int remove() {
		if (vazia())
			return -1;
	
		int res = primeiro();
		inicio = (fim + 1) % tamMax; //Circularidade 
		nElementos--;
		return res;
	}
        
        public int tamanhoMax()
        {
            return tamMax;
        }

}
