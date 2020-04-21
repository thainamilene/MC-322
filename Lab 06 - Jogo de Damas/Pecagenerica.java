public class Pecagenerica{
	char cor;
	boolean estado; //true se a peca está no jogo ainda, e false caso contrario
	int linha;
	int coluna;
	boolean pNormal;
	boolean pDama;
	Pecanormal saidaN;
	Dama saidaD;

	Pecagenerica(char cor, boolean estado, int linha, int coluna, boolean pNormal, boolean pDama){
		this.cor = cor;
		this.estado = estado;
		this.linha = linha;
		this.coluna = coluna;
		this.pNormal = pNormal;
		this.pDama = pDama;
	}
}