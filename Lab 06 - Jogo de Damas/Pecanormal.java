public class Pecanormal extends Pecagenerica{

	Pecanormal(char cor, boolean estado, int linha, int coluna, boolean pNormal, boolean pDama){
		super(cor, estado, linha, coluna, pNormal, pDama);
	}
	boolean verificacaoLance(int linhafinal, int colunafinal, Tabuleiro tabuleiro){
	System.out.println(tabuleiro.tabuleiro[linha][coluna].cor + " " + cor);
								System.out.println("im here " + (linha) + " " + (coluna) + " " + estado  );
		if (tabuleiro.tabuleiro[linhafinal][colunafinal].estado == false){ //verifica se o destino final esta vazio
			if((linha-linhafinal)*(linha-linhafinal) == (coluna-colunafinal)*(coluna-colunafinal)){ //verifica se a posicao inicial e o destino estao na mesma diagonal
				if((linha-linhafinal==1 && tabuleiro.tabuleiro[linha][coluna].cor == 'B') || (linha-linhafinal==-1 && tabuleiro.tabuleiro[linha][coluna].cor == 'P')){
					return false;
				}
				if ((linha-linhafinal) < 0){ //esta indo para frente
					if (coluna-colunafinal < 0){ //esta indo para a direita
						for (int i=0; i<linhafinal-linha; i++) {
							if(i%2 == 0 && tabuleiro.tabuleiro[linha+i+1][coluna+i+1].estado == true && tabuleiro.tabuleiro[linha+i+1][coluna+i+1].cor == tabuleiro.tabuleiro[linha][coluna].cor){
								System.out.println(i);
								return false;
							} 
							else if (i%2 == 1 && (tabuleiro.tabuleiro[linha+i+1][coluna+i+1].estado == true || tabuleiro.tabuleiro[linha+i][coluna+i].estado == false)){
								return false;
							}
						}
					}
					else{ //esta indo para a esquerda
						for (int i=0; i<linhafinal-linha; i++) {
							if(i%2 == 0 && tabuleiro.tabuleiro[linha+i+1][coluna-i-1].estado == true && tabuleiro.tabuleiro[linha+i+1][coluna-i-1].cor == cor){
								return false;
							} 
							else if (i%2 == 1 && (tabuleiro.tabuleiro[linha+i+1][coluna-i-1].estado == true || tabuleiro.tabuleiro[linha+i][coluna-i].estado == false)){
								return false;
							}
						}
					} 
				}
				else{ // esta indo para tras
					if (coluna-colunafinal < 0){ //esta indo para a direita
						for (int i=0; i<linhafinal-linha; i++) {
							if(i%2 == 0 && tabuleiro.tabuleiro[linha-i-1][coluna+i+1].estado == true && tabuleiro.tabuleiro[linha-i-1][coluna+i+1].cor == cor){
								return false;
							} 
							else if (i%2 == 1 && (tabuleiro.tabuleiro[linha-i-1][coluna+i+1].estado == true || tabuleiro.tabuleiro[linha-i][coluna+i].estado == false)){
								return false;
							}
						}
					}
					else{ //esta indo para a esquerda
						for (int i=0; i<linhafinal-linha; i++) {
							if(i%2 == 0 && tabuleiro.tabuleiro[linha-i-1][coluna-i-1].estado == true && tabuleiro.tabuleiro[linha-i-1][coluna-i-1].cor == cor){
								return false;
							} 
							else if (i%2 == 1 && (tabuleiro.tabuleiro[linha-i-1][coluna-i-1].estado == true|| tabuleiro.tabuleiro[linha-i][coluna-i].estado == false)){
								return false;
							}
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
	return true;
	}	
}