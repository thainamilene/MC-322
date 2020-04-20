public class Pecagenerica{
	char cor;
	boolean estado = false; //true se a peca está no jogo ainda, e false caso contrario
	int linha;
	int coluna;

	Pecagenerica(char cor, boolean estado, int linha, int coluna){
		this.cor = cor;
		this.estado = estado;
		this.linha = linha;
		this.coluna = coluna;
	}
}