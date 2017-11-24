package exemplo_ed;

public class ABP {
	private No raiz;
	private int id, nivel = 1;
        String caminho;
        
	public ABP(){
		raiz = null;
	}
	
	/** Verifica se a Ã¡rvore estÃ¡ vazia */
	public boolean vazia (){
		return (raiz == null);
	}

	/**Buscar recursivamente a partir da raiz.
	    Retorna o endereÃ§o se o elemento for
	    encontrado, caso contrÃ¡rio retorna NULL*/
	private No busca(No T, int valor) {
            if (T == null)
                return null;  // Arvore Vazia

            if(T.getConteudo() == valor)
		return T; 	// Elem. encontrado na raiz
		
            if (valor < T.getConteudo())
            {
                caminho = caminho + "-> Esquerda";
		return busca(T.getEsq(), valor);
            }
	    else
            {
                caminho = caminho + "-> Direita";
		return busca(T.getDir(), valor);
            }
	}
	
	/**Buscar um elemento na ABP
    		Retorna o endereÃ§o se o elemento for
    		encontrado, caso contrÃ¡rio retorna NULL*/
	public No busca(int valor) { 
            caminho = "Raiz";
            if (raiz != null) 
                return busca(raiz, valor);
		
            return null;
	}
	

	/**Exibe o conteÃºdo de uma Ã¡rvore no formato in-ordem
	    (preserva a ordenaÃ§Ã£o)*/
	private void exibe (No T){
		if (T != null) {
			exibe(T.getEsq());
			System.out.print(" " + T.getConteudo());
			exibe(T.getDir());
		}
	}

	public void exibe() {
		if (raiz == null)
			System.out.println("Arvore vazia");
		else
			exibe(raiz);
	}
	
	/**Insere um nÃ³ em uma Ã¡rvore ABP
	    Retorna 1 se a inserÃ§Ã£o for com sucesso.
	    Caso contrÃ¡rio retorna 0*/
	public boolean insere(int valor){
            id = 1;
            
            No novoNo = new No();
            novoNo.setConteudo(valor);
            novoNo.setEsq(null);
            novoNo.setDir(null);

            if (raiz == null){ // Arvore vazia
	 	raiz = novoNo;
                id = 1;
		return true;
            }

	    // Procura a posicao correta pra inserir o novo no
	    No aux = raiz;
	    No p = null;
	    while (aux != null) {
	    	p = aux;
		if (valor < aux.getConteudo())
                {
                    aux = aux.getEsq();
                    id = id*2;
                }
		else
                {
                    aux = aux.getDir();
                    id = (id*2) + 1;
                }
            }

		// Encontrou um nÃ³ folha para inserir
            if (valor < p.getConteudo())
		p.setEsq(novoNo);
            else
		p.setDir(novoNo);
            
            return true;
	}
        
        public int retornaID()
        {
            return this.id;
        }
        
        public String retornaCaminho()
        {
            return caminho;
        }
}