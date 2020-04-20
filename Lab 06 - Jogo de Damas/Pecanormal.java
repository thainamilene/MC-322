public class Pecanormal extends Pecagenerica{

	Pecanormal(char cor, boolean estado, int linha, int coluna){
		super(cor, estado, linha, coluna);
	}

	void Lance(int linhafinal, int colunafinal, Tabuleiro tabuleiro){
		int ver;
		if (linhafinal!=-1){
			ver = verificacao1(linhafinal, colunafinal, tabuleiro);
		} else{
			ver = verificacao2(tabuleiro);
		}
	}

	/*essa funcao verifica se a jogada informada na entrada e possivel de ser realizada, 
	retorna 1, se apenas anda uma casa sem comer peca, 2 se comer peca e 0 se nao for possivel*/
	int verificacao1(int linhafinal, int colunafinal, Tabuleiro tabuleiro){
		if ((linhafinal == linha + 1 || linhafinal == linha + 2 || linhafinal == linha - 1 || linhafinal == linha - 2) && (colunafinal == coluna + 1 || colunafinal == coluna + 2 || colunafinal == coluna - 1 || colunafinal == coluna - 2)){ // verifica se o movimento e compativel com a peca
			if (tabuleiro.tabuleiro[linhafinal][colunafinal].estado == false){
				if ((linhafinal == linha + 1 || linhafinal == linha - 1) && (colunafinal == coluna + 1 || colunafinal == coluna - 1)){
					return 1;
				}
				if(tabuleiro.tabuleiro[(linha+linhafinal)/2][(coluna+colunafinal)/2].estado == true && tabuleiro.tabuleiro[(linha+linhafinal)/2][(coluna+colunafinal)/2].cor != cor){
					return 2;
				}	
			}
		}
		return 0;
	}

	/*essa funcao verifica se tem peca suscetiveis a serem comidas 
	retorna 0, se não há
	retorna 1 se há na diagonal direita para cima
	retorna 2 se há na diagonal esquerda para cima 
	retorna 3 se há na diagonal direita para baixo
	retorna 4 se há na diagonal esquerda para baixo
	*/
	int verificacao2(Tabuleiro tabuleiro){
		if ((linha<6 && coluna<6) && (tabuleiro.tabuleiro[linha+1][coluna+1].estado == true && tabuleiro.tabuleiro[linha+1][coluna+1].cor != cor && tabuleiro.tabuleiro[linha+2][coluna+2].estado == false)){
			return 1;
		}
		if ((linha<6 && coluna>1) && (tabuleiro.tabuleiro[linha+1][coluna-1].estado == true && tabuleiro.tabuleiro[linha+1][coluna-1].cor != cor && tabuleiro.tabuleiro[linha+2][coluna-2].estado == false)){
			return 2;
		}
		if ((linha>1 && coluna<6) && (tabuleiro.tabuleiro[linha-1][coluna+1].estado == true && tabuleiro.tabuleiro[linha-1][coluna+1].cor != cor && tabuleiro.tabuleiro[linha-2][coluna+2].estado == false)){
			return 3;
		}

		if ((linha>1 && coluna>1) && ((tabuleiro.tabuleiro[linha-1][coluna-1].estado == true && tabuleiro.tabuleiro[linha-1][coluna-1].cor != cor && tabuleiro.tabuleiro[linha-2][coluna-2].estado == false))){
			return 4;
		}
	return 0;
	}
}