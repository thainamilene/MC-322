public class Pecagenerica{
	char cor;
	boolean estado; //true se a peca está no jogo ainda, e false caso contrario
	int linha;
	int coluna;
	boolean pNormal; //true se e uma peca normal
	boolean pDama; //true se e uma peca do tipo Dama
	Pecanormal saidaN; //linka classe Pecanormal  
	Dama saidaD; //linka classe Dama

	Pecagenerica(char cor, boolean estado, int linha, int coluna, boolean pNormal, boolean pDama){
		this.cor = cor;
		this.estado = estado;
		this.linha = linha;
		this.coluna = coluna;
		this.pNormal = pNormal;
		this.pDama = pDama;
	}
}