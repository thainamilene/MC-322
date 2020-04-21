public class Dama extends Pecagenerica{

	Dama(char cor, boolean estado, int linha, int coluna, boolean pNormal, boolean pDama){
		super(cor, estado, linha, coluna, pNormal, pDama);
	}

	boolean verificacaoLance(int linhafinal, int colunafinal, Tabuleiro tabuleiro){
		/*if (tabuleiro.tabuleiro[linhafinal][colunafinal].estado == false){ //verifica se o destino final esta vazio
			//System.out.println("im here " + (linha) + " " + (coluna) + " " + estado);
			if((linha-linhafinal) == (coluna-colunafinal)){ //verifica se a posicao inicial e o destino estao na mesma diagonal
				if ((linha-linhafinal) < 0){ //esta indo para frente
					if (coluna-colunafinal < 0){ //esta indo para a direita
						for (int i=0; i<linhafinal-linha; i++) {
							
						}
					}
					else{ //esta indo para a esquerda
						for (int i=0; i<linhafinal-linha; i++) {
							

					} 
				}
				else{ // esta indo para tras
					if (coluna-colunafinal < 0){ //esta indo para a direita
						for (int i=0; i<linhafinal-linha; i++) {
							
						}
					}
					else{ //esta indo para a esquerda
						for (int i=0; i<linhafinal-linha; i++) {

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
		}*/
	return true;
	}	
}