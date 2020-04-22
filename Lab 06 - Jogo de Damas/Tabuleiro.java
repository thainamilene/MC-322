public class Tabuleiro{
	Pecagenerica[][] tabuleiro = new Pecagenerica[8][8];


	Tabuleiro(){
		for (int i=0; i<8; i++) {
			for (int j=0; j<8; j++) {
				tabuleiro[i][j] = new Pecagenerica('-', false, i, j, false, false);							
			}			
		}
	}


	void montar(){
			tabuleiro[7][1].saidaN = new Pecanormal(tabuleiro[7][1].cor, tabuleiro[7][1].estado, tabuleiro[7][1].linha, tabuleiro[7][1].coluna, tabuleiro[7][1].pNormal, tabuleiro[7][1].pDama);
			tabuleiro[7][3].saidaN = new Pecanormal(tabuleiro[7][3].cor, tabuleiro[7][3].estado, tabuleiro[7][3].linha, tabuleiro[7][3].coluna, tabuleiro[7][3].pNormal, tabuleiro[7][3].pDama);
			tabuleiro[7][5].saidaN = new Pecanormal(tabuleiro[7][5].cor, tabuleiro[7][5].estado, tabuleiro[7][5].linha, tabuleiro[7][5].coluna, tabuleiro[7][5].pNormal, tabuleiro[7][5].pDama);
			tabuleiro[7][7].saidaN = new Pecanormal(tabuleiro[7][7].cor, tabuleiro[7][7].estado, tabuleiro[7][7].linha, tabuleiro[7][7].coluna, tabuleiro[7][7].pNormal, tabuleiro[7][7].pDama);
			tabuleiro[6][0].saidaN = new Pecanormal(tabuleiro[6][0].cor, tabuleiro[6][0].estado, tabuleiro[6][0].linha, tabuleiro[6][0].coluna, tabuleiro[6][0].pNormal, tabuleiro[6][0].pDama);
			tabuleiro[6][2].saidaN = new Pecanormal(tabuleiro[6][2].cor, tabuleiro[6][2].estado, tabuleiro[6][2].linha, tabuleiro[6][2].coluna, tabuleiro[6][2].pNormal, tabuleiro[6][2].pDama);
			tabuleiro[6][4].saidaN = new Pecanormal(tabuleiro[6][4].cor, tabuleiro[6][4].estado, tabuleiro[6][4].linha, tabuleiro[6][4].coluna, tabuleiro[6][4].pNormal, tabuleiro[6][4].pDama);
			tabuleiro[6][6].saidaN = new Pecanormal(tabuleiro[6][6].cor, tabuleiro[6][6].estado, tabuleiro[6][6].linha, tabuleiro[6][6].coluna, tabuleiro[6][6].pNormal, tabuleiro[6][6].pDama);
			tabuleiro[5][1].saidaN = new Pecanormal(tabuleiro[5][1].cor, tabuleiro[5][1].estado, tabuleiro[5][1].linha, tabuleiro[5][1].coluna, tabuleiro[5][1].pNormal, tabuleiro[5][1].pDama);
			tabuleiro[5][3].saidaN = new Pecanormal(tabuleiro[5][3].cor, tabuleiro[5][3].estado, tabuleiro[5][3].linha, tabuleiro[5][3].coluna, tabuleiro[5][3].pNormal, tabuleiro[5][3].pDama);
			tabuleiro[5][5].saidaN = new Pecanormal(tabuleiro[5][5].cor, tabuleiro[5][5].estado, tabuleiro[5][5].linha, tabuleiro[5][5].coluna, tabuleiro[5][5].pNormal, tabuleiro[5][5].pDama);
			tabuleiro[5][7].saidaN = new Pecanormal(tabuleiro[5][7].cor, tabuleiro[5][7].estado, tabuleiro[5][7].linha, tabuleiro[5][7].coluna, tabuleiro[5][7].pNormal, tabuleiro[5][7].pDama);

			tabuleiro[0][0].saidaN = new Pecanormal(tabuleiro[0][0].cor, tabuleiro[0][0].estado, tabuleiro[0][0].linha, tabuleiro[0][0].coluna, tabuleiro[0][0].pNormal, tabuleiro[0][0].pDama);
			tabuleiro[0][2].saidaN = new Pecanormal(tabuleiro[0][2].cor, tabuleiro[0][2].estado, tabuleiro[0][2].linha, tabuleiro[0][2].coluna, tabuleiro[0][2].pNormal, tabuleiro[0][2].pDama);
			tabuleiro[0][4].saidaN = new Pecanormal(tabuleiro[0][4].cor, tabuleiro[0][4].estado, tabuleiro[0][4].linha, tabuleiro[0][4].coluna, tabuleiro[0][4].pNormal, tabuleiro[0][4].pDama);
			tabuleiro[0][6].saidaN = new Pecanormal(tabuleiro[0][6].cor, tabuleiro[0][6].estado, tabuleiro[0][6].linha, tabuleiro[0][6].coluna, tabuleiro[0][6].pNormal, tabuleiro[0][6].pDama);
			tabuleiro[1][1].saidaN = new Pecanormal(tabuleiro[1][1].cor, tabuleiro[1][1].estado, tabuleiro[1][1].linha, tabuleiro[1][1].coluna, tabuleiro[1][1].pNormal, tabuleiro[1][1].pDama);
			tabuleiro[1][3].saidaN = new Pecanormal(tabuleiro[1][3].cor, tabuleiro[1][3].estado, tabuleiro[1][3].linha, tabuleiro[1][3].coluna, tabuleiro[1][3].pNormal, tabuleiro[1][3].pDama);
			tabuleiro[1][5].saidaN = new Pecanormal(tabuleiro[1][5].cor, tabuleiro[1][5].estado, tabuleiro[1][5].linha, tabuleiro[1][5].coluna, tabuleiro[1][5].pNormal, tabuleiro[1][5].pDama);
			tabuleiro[1][7].saidaN = new Pecanormal(tabuleiro[1][7].cor, tabuleiro[1][7].estado, tabuleiro[1][7].linha, tabuleiro[1][7].coluna, tabuleiro[1][7].pNormal, tabuleiro[1][7].pDama);
			tabuleiro[2][0].saidaN = new Pecanormal(tabuleiro[2][0].cor, tabuleiro[2][0].estado, tabuleiro[2][0].linha, tabuleiro[2][0].coluna, tabuleiro[2][0].pNormal, tabuleiro[2][0].pDama);
			tabuleiro[2][2].saidaN = new Pecanormal(tabuleiro[2][2].cor, tabuleiro[2][2].estado, tabuleiro[2][2].linha, tabuleiro[2][2].coluna, tabuleiro[2][2].pNormal, tabuleiro[2][2].pDama);
			tabuleiro[2][4].saidaN = new Pecanormal(tabuleiro[2][4].cor, tabuleiro[2][4].estado, tabuleiro[2][4].linha, tabuleiro[2][4].coluna, tabuleiro[2][4].pNormal, tabuleiro[2][4].pDama);
			tabuleiro[2][6].saidaN = new Pecanormal(tabuleiro[2][6].cor, tabuleiro[2][6].estado, tabuleiro[2][6].linha, tabuleiro[2][6].coluna, tabuleiro[2][6].pNormal, tabuleiro[2][6].pDama);

		System.out.println("Tabuleiro inicial:");
		imprimir();
		return;
	}

	void movimentoPecaNormal(int linhainicial, int colunainicial, int linhafinal, int colunafinal){
		boolean v = false;
		if((linhainicial-linhafinal) * (linhainicial-linhafinal) == (colunainicial-colunafinal)*(colunainicial-colunafinal)){ //verifica se a posicao inicial e o destino estao na mesma diagonal
			tabuleiro[linhafinal][colunafinal].estado = true;
			tabuleiro[linhafinal][colunafinal].cor = tabuleiro[linhainicial][colunainicial].cor;
			tabuleiro[linhafinal][colunafinal].pNormal = true;
			tabuleiro[linhafinal][colunafinal].pDama = false;
			tabuleiro[linhafinal][colunafinal].linha = linhafinal;
			tabuleiro[linhafinal][colunafinal].coluna = colunafinal;
			if(tabuleiro[linhafinal][colunafinal].saidaN == null){
				tabuleiro[linhafinal][colunafinal].saidaN = new Pecanormal(tabuleiro[linhafinal][colunafinal].cor, tabuleiro[linhafinal][colunafinal].estado, tabuleiro[linhafinal][colunafinal].linha, tabuleiro[linhafinal][colunafinal].coluna, tabuleiro[linhafinal][colunafinal].pNormal, tabuleiro[linhafinal][colunafinal].pDama);
			}
			tabuleiro[linhainicial][colunainicial].estado = false;
			tabuleiro[linhainicial][colunainicial].pNormal = false;
			tabuleiro[linhainicial][colunainicial].cor = '-';
			if(linhainicial-linhafinal==1 || linhainicial-linhafinal==-1){ //verifica se a peca anda apenas uma casa sem comer nenhuma peca
				v = true;
			}
			if (v==false){ //elimina a peca intermediaria se ela existir
				if ((linhainicial-linhafinal) < 0){ //esta indo para frente
					if (colunainicial-colunafinal < 0){ //esta indo para a direita
						tabuleiro[linhainicial+1][colunainicial+1].estado = false;
						tabuleiro[linhainicial+1][colunainicial+1].pNormal = false;
						tabuleiro[linhainicial+1][colunainicial+1].pDama = false;
						tabuleiro[linhainicial+1][colunainicial+1].cor = '-';
					}
					else{ //esta indo para a esquerda
						tabuleiro[linhainicial+1][colunainicial-1].estado = false;
						tabuleiro[linhainicial+1][colunainicial-1].pNormal = false;
						tabuleiro[linhainicial+1][colunainicial-1].pDama = false;
						tabuleiro[linhainicial+1][colunainicial-1].cor = '-';
					} 
				}
				else{ // esta indo para tras
					if (colunainicial-colunafinal < 0){ //esta indo para a direita
						tabuleiro[linhainicial-1][colunainicial+1].estado = false;
						tabuleiro[linhainicial-1][colunainicial+1].pNormal = false;
						tabuleiro[linhainicial-1][colunainicial+1].pDama = false;
						tabuleiro[linhainicial-1][colunainicial+1].cor = '-';
					} 
					else{ //esta indo para a esquerda
						tabuleiro[linhainicial-1][colunainicial-1].estado = false;
						tabuleiro[linhainicial-1][colunainicial-1].pNormal = false;
						tabuleiro[linhainicial-1][colunainicial-1].pDama = false;
						tabuleiro[linhainicial-1][colunainicial-1].cor = '-';
					}
				}	
			}
		}
		if((tabuleiro[linhafinal][colunafinal].linha==0 && tabuleiro[linhafinal][colunafinal].cor=='P') || (tabuleiro[linhafinal][colunafinal].linha==7 && tabuleiro[linhafinal][colunafinal].cor=='B')){ //transforma em Dama se puder
			tabuleiro[linhafinal][colunafinal].pNormal = false;
			tabuleiro[linhafinal][colunafinal].pDama = true;
			tabuleiro[linhafinal][colunafinal].saidaN = null;
			if(tabuleiro[linhafinal][colunafinal].saidaD == null){
				tabuleiro[linhafinal][colunafinal].saidaD = new Dama(tabuleiro[linhafinal][colunafinal].cor, tabuleiro[linhafinal][colunafinal].estado, tabuleiro[linhafinal][colunafinal].linha, tabuleiro[linhafinal][colunafinal].coluna, tabuleiro[linhafinal][colunafinal].pNormal, tabuleiro[linhafinal][colunafinal].pDama);
			}
		}
		imprimir();
	}

	void movimentoDama(int linhainicial, int colunainicial, int linhafinal, int colunafinal){
		tabuleiro[linhafinal][colunafinal].estado = true;
		tabuleiro[linhafinal][colunafinal].cor = tabuleiro[linhainicial][colunainicial].cor;
		tabuleiro[linhafinal][colunafinal].pDama = true;
		tabuleiro[linhafinal][colunafinal].pNormal = false;
		tabuleiro[linhafinal][colunafinal].linha = linhafinal;
		tabuleiro[linhafinal][colunafinal].coluna = colunafinal;
		if(tabuleiro[linhafinal][colunafinal].saidaD == null){
			tabuleiro[linhafinal][colunafinal].saidaD = new Dama(tabuleiro[linhafinal][colunafinal].cor, tabuleiro[linhafinal][colunafinal].estado, tabuleiro[linhafinal][colunafinal].linha, tabuleiro[linhafinal][colunafinal].coluna, tabuleiro[linhafinal][colunafinal].pNormal, tabuleiro[linhafinal][colunafinal].pDama);
		}
		tabuleiro[linhainicial][colunainicial].estado = false;
		tabuleiro[linhainicial][colunainicial].pDama = false;
		tabuleiro[linhainicial][colunainicial].cor = '-';
		if ((linhainicial-linhafinal) < 0){ //esta indo para frente
			if (colunainicial-colunafinal < 0){ //esta indo para a direita
				if(tabuleiro[linhafinal-1][colunafinal-1].estado == true){
					tabuleiro[linhafinal-1][colunafinal-1].estado = false;
					tabuleiro[linhafinal-1][colunafinal-1].pNormal = false;
					tabuleiro[linhafinal-1][colunafinal-1].pDama = false;
					tabuleiro[linhafinal-1][colunafinal-1].cor = '-';
				}
			}
			else{ //esta indo para a esquerda
				if(tabuleiro[linhafinal-1][colunafinal+1].estado == true){
					tabuleiro[linhafinal-1][colunafinal+1].estado = false;
					tabuleiro[linhafinal-1][colunafinal+1].pNormal = false;
					tabuleiro[linhafinal-1][colunafinal+1].pDama = false;
					tabuleiro[linhafinal-1][colunafinal+1].cor = '-';
				}
			} 
		}
		else{ // esta indo para tras
			if (colunainicial-colunafinal < 0){ //esta indo para a direita
				if(tabuleiro[linhafinal+1][colunafinal-1].estado == true){
					tabuleiro[linhafinal+1][colunafinal-1].estado = false;
					tabuleiro[linhafinal+1][colunafinal-1].pNormal = false;
					tabuleiro[linhafinal+1][colunafinal-1].pDama = false;
					tabuleiro[linhafinal+1][colunafinal-1].cor = '-';
				}
			} 
			else{ //esta indo para a esquerda
				if(tabuleiro[linhafinal+1][colunafinal+1].estado == true){
					tabuleiro[linhafinal+1][colunafinal+1].estado = false;
					tabuleiro[linhafinal+1][colunafinal+1].pNormal = false;
					tabuleiro[linhafinal+1][colunafinal+1].pDama = false;
					tabuleiro[linhafinal+1][colunafinal+1].cor = '-';
				}
			}
		}	
		imprimir();
	}

	void imprimir(){
		for(int i=8; i>0; i--){
				System.out.print (i); 				
				System.out.print (' '); 				
				for (int j=0; j<8; j++) {
					if (tabuleiro[i-1][j].estado == true){
						System.out.print (tabuleiro[i-1][j].cor);
					} else{
						System.out.print ('-');
					}
						System.out.print (' '); 				 						
				}
				System.out.println();
			}
			System.out.println("  a b c d e f g h");
			System.out.println(" ");
	return;
	}
}