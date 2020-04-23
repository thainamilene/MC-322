public class Dama extends Pecagenerica{

	Dama(char cor, boolean estado, int linha, int coluna, boolean pNormal, boolean pDama){
		super(cor, estado, linha, coluna, pNormal, pDama);
	}

	boolean verificacaoLance(int linhafinal, int colunafinal, Tabuleiro tabuleiro, int cont){
		if (tabuleiro.tabuleiro[linhafinal][colunafinal].estado == false){ //verifica se o destino final esta vazio
			if(linha-linhafinal==1 || linha-linhafinal == -1){
				if (cont>1){
						return false;
				}
				else{
					tabuleiro.movimentoDama(linha, coluna, linhafinal, colunafinal);
					return true;
				}
			} 
			if((linha-linhafinal)*(linha-linhafinal) == (coluna-colunafinal)*(coluna-colunafinal)){ //verifica se a posicao inicial e o destino estao na mesma diagonal
				if ((linha-linhafinal) < 0){ //esta indo para frente
					if (coluna-colunafinal < 0){ //esta indo para a direita
						int i=0;
						while(i<(linhafinal-linha)){
							if((tabuleiro.tabuleiro[linha+i+1][coluna+i+1].estado==true) && (tabuleiro.tabuleiro[linha+i+1][coluna+i+1].cor == tabuleiro.tabuleiro[linha][coluna].cor) || (tabuleiro.tabuleiro[linha][coluna].cor == 'Q' && tabuleiro.tabuleiro[linha+i+1][coluna+i+1].cor == 'P') || (tabuleiro.tabuleiro[linha][coluna].cor == 'D' && tabuleiro.tabuleiro[linha+i+1][coluna+i+1].cor == 'B')){
								return false;
							}
							if(tabuleiro.tabuleiro[linha+i+1][coluna+i+1].estado==true && (tabuleiro.tabuleiro[linha+i+1][coluna+i+1].cor != tabuleiro.tabuleiro[linha][coluna].cor) || (tabuleiro.tabuleiro[linha][coluna].cor == 'Q' && tabuleiro.tabuleiro[linha+i+1][coluna+i+1].cor == 'B') || (tabuleiro.tabuleiro[linha][coluna].cor == 'D' && tabuleiro.tabuleiro[linha+i+1][coluna+i+1].cor == 'D')){
								if(tabuleiro.tabuleiro[linha+i+2][coluna+i+2].estado==true){
									return false;
								}
								if(tabuleiro.tabuleiro[linha+i+1][coluna+i+1] == tabuleiro.tabuleiro[linhafinal][colunafinal]){
									tabuleiro.movimentoDama(linha, coluna, linhafinal, colunafinal);
									return true;
								}
							}
							i++;
						}
					}
					else{ //esta indo para a esquerda
						int i=0;
						while(i<(linhafinal-linha)){
							if((tabuleiro.tabuleiro[linha+i+1][coluna-i-1].estado==true) && (tabuleiro.tabuleiro[linha+i+1][coluna-i-1].cor == tabuleiro.tabuleiro[linha][coluna].cor) || (tabuleiro.tabuleiro[linha][coluna].cor == 'Q' && tabuleiro.tabuleiro[linha+i+1][coluna-i-1].cor == 'P') || (tabuleiro.tabuleiro[linha][coluna].cor == 'D' && tabuleiro.tabuleiro[linha+i+1][coluna-i-1].cor == 'B')){
								return false;
							}
							if(tabuleiro.tabuleiro[linha+i+1][coluna-i-1].estado==true && (tabuleiro.tabuleiro[linha+i+1][coluna-i-1].cor != tabuleiro.tabuleiro[linha][coluna].cor) || (tabuleiro.tabuleiro[linha][coluna].cor == 'Q' && tabuleiro.tabuleiro[linha+i+1][coluna-i-1].cor == 'B') || (tabuleiro.tabuleiro[linha][coluna].cor == 'D' && tabuleiro.tabuleiro[linha+i+1][coluna-i-1].cor == 'D')){
								if(tabuleiro.tabuleiro[linha+i+2][coluna-i-2].estado==true){
									return false;
								}
								if(tabuleiro.tabuleiro[linha+i+1][coluna+i+1] == tabuleiro.tabuleiro[linhafinal][colunafinal]){
									tabuleiro.movimentoDama(linha, coluna, linhafinal, colunafinal);
									return true;
								}
							}
							i++;
						}
					} 
				}
				else{ // esta indo para tras
					if (coluna-colunafinal < 0){ //esta indo para a direita
						int i=0;
						while(i<(linha-linhafinal)){
							if((tabuleiro.tabuleiro[linha-i-1][coluna+i+1].estado==true) && (tabuleiro.tabuleiro[linha-i-1][coluna+i+1].cor == tabuleiro.tabuleiro[linha][coluna].cor) || (tabuleiro.tabuleiro[linha][coluna].cor == 'Q' && tabuleiro.tabuleiro[linha-i-1][coluna+i+1].cor == 'P') || (tabuleiro.tabuleiro[linha][coluna].cor == 'D' && tabuleiro.tabuleiro[linha-i-1][coluna+i+1].cor == 'B')){
								return false;
							}
							if(tabuleiro.tabuleiro[linha-i-1][coluna+i+1].estado==true && (tabuleiro.tabuleiro[linha-i-1][coluna+i+1].cor != tabuleiro.tabuleiro[linha][coluna].cor) || (tabuleiro.tabuleiro[linha][coluna].cor == 'Q' && tabuleiro.tabuleiro[linha-i-1][coluna+i+1].cor == 'B') || (tabuleiro.tabuleiro[linha][coluna].cor == 'D' && tabuleiro.tabuleiro[linha-i-1][coluna+i+1].cor == 'D')){
								if(tabuleiro.tabuleiro[linha-i-2][coluna+i+2].estado==true){
									return false;
								}
								if(tabuleiro.tabuleiro[linha-i-1][coluna+i+1] == tabuleiro.tabuleiro[linhafinal][colunafinal]){
									tabuleiro.movimentoDama(linha, coluna, linhafinal, colunafinal);
									return true;
								}
							}
							i++;
						}
					} 
					else{ //esta indo para a esquerda
						int i=0;
						while(i<(linha-linhafinal)){
							if((tabuleiro.tabuleiro[linha-i-1][coluna-i-1].estado==true) && (tabuleiro.tabuleiro[linha-i-1][coluna-i-1].cor == tabuleiro.tabuleiro[linha][coluna].cor) || (tabuleiro.tabuleiro[linha][coluna].cor == 'Q' && tabuleiro.tabuleiro[linha-i-1][coluna-i-1].cor == 'P') || (tabuleiro.tabuleiro[linha][coluna].cor == 'D' && tabuleiro.tabuleiro[linha-i-1][coluna-i-1].cor == 'B')){
								return false;
							}
							if(tabuleiro.tabuleiro[linha-i-1][coluna-i-1].estado==true && (tabuleiro.tabuleiro[linha-i-1][coluna-i-1].cor != tabuleiro.tabuleiro[linha][coluna].cor) || (tabuleiro.tabuleiro[linha][coluna].cor == 'Q' && tabuleiro.tabuleiro[linha-i-1][coluna-i-1].cor == 'B') || (tabuleiro.tabuleiro[linha][coluna].cor == 'D' && tabuleiro.tabuleiro[linha-i-1][coluna-i-1].cor == 'D')){
								if(tabuleiro.tabuleiro[linha-i-2][coluna-i-2].estado==true){
									return false;
								}
								if(tabuleiro.tabuleiro[linha-i-1][coluna-i-1] == tabuleiro.tabuleiro[linhafinal][colunafinal]){
									tabuleiro.movimentoDama(linha, coluna, linhafinal, colunafinal);
									return true;
								}
							}
							i++;
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
	tabuleiro.movimentoDama(linha, coluna, linhafinal, colunafinal);
	return true;
	}	
}