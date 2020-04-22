public class Pecanormal extends Pecagenerica{

	Pecanormal(char cor, boolean estado, int linha, int coluna, boolean pNormal, boolean pDama){
		super(cor, estado, linha, coluna, pNormal, pDama);
	}
	boolean verificacaoLance(int linhafinal, int colunafinal, Tabuleiro tabuleiro){
		if (tabuleiro.tabuleiro[linhafinal][colunafinal].estado == false){ //verifica se o destino final esta vazio
							System.out.println("im here" + linha + coluna);
			if((linha-linhafinal)*(linha-linhafinal) == (coluna-colunafinal)*(coluna-colunafinal)){ //verifica se a posicao inicial e o destino estao na mesma diagonal
				if((linha-linhafinal==1 && tabuleiro.tabuleiro[linha][coluna].cor == 'B') || (linha-linhafinal==-1 && tabuleiro.tabuleiro[linha][coluna].cor == 'P')){//verifica se caso a peça ande uma casa apenas, ela está indo para sua respectiva frente
					return false;
				}
				else if(linha-linhafinal==1 || linha-linhafinal == -1){
					if(tabuleiro.tabuleiro[linhafinal][colunafinal].estado==true){
						return false;
					}
					else{
						tabuleiro.movimentopecaNormal(linha, coluna, linhafinal, colunafinal);
						return true;
					}
				}
				if ((linha-linhafinal) < 0){ //esta indo para frente
					if (coluna-colunafinal < 0){ //esta indo para a direita
						if((tabuleiro.tabuleiro[linha+1][coluna+1].estado == true && tabuleiro.tabuleiro[linha+1][coluna+1].cor == tabuleiro.tabuleiro[linha][coluna].cor) || (tabuleiro.tabuleiro[linha+2][coluna+2].estado == true)){
							return false;
						} 
					}
					else{ //esta indo para a esquerda
						if((tabuleiro.tabuleiro[linha+1][coluna-1].estado == true && tabuleiro.tabuleiro[linha+1][coluna-1].cor == tabuleiro.tabuleiro[linha][coluna].cor) || (tabuleiro.tabuleiro[linha+2][coluna-2].estado == true )){
							return false;
						} 
					} 
				}
				else{ // esta indo para tras
					if (coluna-colunafinal < 0){ //esta indo para a direita
						if((tabuleiro.tabuleiro[linha-1][coluna+1].estado == true && tabuleiro.tabuleiro[linha-1][coluna+1].cor == tabuleiro.tabuleiro[linha][coluna].cor) || (tabuleiro.tabuleiro[linha-2][coluna+2].estado == true)){
							return false;
						}
					} 
					else{ //esta indo para a esquerda
						if((tabuleiro.tabuleiro[linha-1][coluna-1].estado == true && tabuleiro.tabuleiro[linha-1][coluna-1].cor == tabuleiro.tabuleiro[linha][coluna].cor) || (tabuleiro.tabuleiro[linha-2][coluna-2].estado == true)){
							return false;
						} 
					}
				}	
			}
			else{
				return false;
			}
		} 
		else{
			return false;
		}
	tabuleiro.movimentopecaNormal(linha, coluna, linhafinal, colunafinal);
	return true;
	}	
}