public class Tabuleiro{
	Pecagenerica[][] tabuleiro = new Pecagenerica[8][8];


	Tabuleiro(){
		for (int i=0; i<8; i++) {
			for (int j=0; j<8; j++) {
				tabuleiro[i][j] = new Pecagenerica('-', false, i, j, false, false);							
			}			
		}
	}


	void Montar(Pecagenerica p1, Pecagenerica p2, Pecagenerica p3, Pecagenerica p4, Pecagenerica p5, Pecagenerica p6, Pecagenerica p7, Pecagenerica p8, Pecagenerica p9, Pecagenerica p10, Pecagenerica p11, Pecagenerica p12, Pecagenerica b1, Pecagenerica b2, Pecagenerica b3, Pecagenerica b4, Pecagenerica b5, Pecagenerica b6, Pecagenerica b7, Pecagenerica b8, Pecagenerica b9, Pecagenerica b10, Pecagenerica b11, Pecagenerica b12){
			tabuleiro[7][1] = p1;
			tabuleiro[7][3] = p2;
			tabuleiro[7][5] = p3;
			tabuleiro[7][7] = p4;
			tabuleiro[6][0] = p5;
			tabuleiro[6][2] = p6;
			tabuleiro[6][4] = p7;
			tabuleiro[6][6] = p8;
			tabuleiro[5][1] = p9;
			tabuleiro[5][3] = p10;
			tabuleiro[5][5] = p11;
			tabuleiro[5][7] = p12;

			tabuleiro[0][0] = b1;
			tabuleiro[0][2] = b2;
			tabuleiro[0][4] = b3;
			tabuleiro[0][6] = b4;
			tabuleiro[1][1] = b5;
			tabuleiro[1][3] = b6;
			tabuleiro[1][5] = b7;
			tabuleiro[1][7] = b8;
			tabuleiro[2][0] = b9;
			tabuleiro[2][2] = b10;
			tabuleiro[2][4] = b11;
			tabuleiro[2][6] = b12;

			p1.saidaN = new Pecanormal(p1.cor, p1.estado, p1.linha, p1.coluna, p1.pNormal, p1.pDama);
			p2.saidaN = new Pecanormal(p2.cor, p2.estado, p2.linha, p2.coluna, p2.pNormal, p2.pDama);
			p3.saidaN = new Pecanormal(p3.cor, p3.estado, p3.linha, p3.coluna, p3.pNormal, p3.pDama);
			p4.saidaN = new Pecanormal(p4.cor, p4.estado, p4.linha, p4.coluna, p4.pNormal, p4.pDama);
			p5.saidaN = new Pecanormal(p5.cor, p5.estado, p5.linha, p5.coluna, p5.pNormal, p5.pDama);
			p6.saidaN = new Pecanormal(p6.cor, p6.estado, p6.linha, p6.coluna, p6.pNormal, p6.pDama);
			p7.saidaN = new Pecanormal(p7.cor, p7.estado, p7.linha, p7.coluna, p7.pNormal, p7.pDama);
			p8.saidaN = new Pecanormal(p8.cor, p8.estado, p8.linha, p8.coluna, p8.pNormal, p8.pDama);
			p9.saidaN = new Pecanormal(p9.cor, p9.estado, p9.linha, p9.coluna, p9.pNormal, p9.pDama);
			p10.saidaN = new Pecanormal(p10.cor, p10.estado, p10.linha, p10.coluna, p10.pNormal, p10.pDama);
			p11.saidaN = new Pecanormal(p11.cor, p11.estado, p11.linha, p11.coluna, p11.pNormal, p11.pDama);
			p12.saidaN = new Pecanormal(p12.cor, p12.estado, p12.linha, p12.coluna, p12.pNormal, p12.pDama);

			b1.saidaN = new Pecanormal(b1.cor, b1.estado, b1.linha, b1.coluna, b1.pNormal, b1.pDama);
			b2.saidaN = new Pecanormal(b2.cor, b2.estado, b2.linha, b2.coluna, b2.pNormal, b2.pDama);
			b3.saidaN = new Pecanormal(b3.cor, b3.estado, b3.linha, b3.coluna, b3.pNormal, b3.pDama);
			b4.saidaN = new Pecanormal(b4.cor, b4.estado, b4.linha, b4.coluna, b4.pNormal, b4.pDama);
			b5.saidaN = new Pecanormal(b5.cor, b5.estado, b5.linha, b5.coluna, b5.pNormal, b5.pDama);
			b6.saidaN = new Pecanormal(b6.cor, b6.estado, b6.linha, b6.coluna, b6.pNormal, b6.pDama);
			b7.saidaN = new Pecanormal(b7.cor, b7.estado, b7.linha, b7.coluna, b7.pNormal, b7.pDama);
			b8.saidaN = new Pecanormal(b8.cor, b8.estado, b8.linha, b8.coluna, b8.pNormal, b8.pDama);
			b9.saidaN = new Pecanormal(b9.cor, b9.estado, b9.linha, b9.coluna, b9.pNormal, b9.pDama);
			b10.saidaN = new Pecanormal(b10.cor, b10.estado, b10.linha, b10.coluna, b10.pNormal, b10.pDama);
			b11.saidaN = new Pecanormal(b11.cor, b11.estado, b11.linha, b11.coluna, b11.pNormal, b11.pDama);
			b12.saidaN = new Pecanormal(b12.cor, b12.estado, b12.linha, b12.coluna, b12.pNormal, b12.pDama);

		System.out.println("Tabuleiro inicial:");
		Imprimir();
		return;
	}

	void movimentopecaNormal(int linhainicial, int colunainicial, int linhafinal, int colunafinal){
		if((linhainicial-linhafinal) * (linhainicial-linhafinal) == (colunainicial-colunafinal)*(colunainicial-colunafinal)){ //verifica se a posicao inicial e o destino estao na mesma diagonal
				tabuleiro[linhafinal][colunafinal].estado = true;
				tabuleiro[linhafinal][colunafinal].cor = tabuleiro[linhainicial][colunainicial].cor;
				tabuleiro[linhafinal][colunafinal].pNormal = true;
				tabuleiro[linhafinal][colunafinal].linha = linhafinal;
				tabuleiro[linhafinal][colunafinal].coluna = colunafinal;
				if(tabuleiro[linhafinal][colunafinal].saidaN == null){
					tabuleiro[linhafinal][colunafinal].saidaN = new Pecanormal(tabuleiro[linhafinal][colunafinal].cor, tabuleiro[linhafinal][colunafinal].estado, tabuleiro[linhafinal][colunafinal].linha, tabuleiro[linhafinal][colunafinal].coluna, tabuleiro[linhafinal][colunafinal].pNormal, tabuleiro[linhafinal][colunafinal].pDama);
				}
				tabuleiro[linhainicial][colunainicial].estado = false;
				tabuleiro[linhainicial][colunainicial].pNormal = false;
				if ((linhainicial-linhafinal) < 0){ //esta indo para frente
					if (colunainicial-colunafinal < 0){ //esta indo para a direita
						for (int i=0; i<linhafinal-linhainicial; i++) {
							if(i%2 == 1){
								tabuleiro[linhainicial+i+1][colunainicial+i+1].estado = false;
								tabuleiro[linhainicial+i+1][colunainicial+i+1].pNormal = false;
							}
						}
					}
					else{ //esta indo para a esquerda
						for (int i=0; i<linhafinal-linhainicial; i++) {
							if (i%2 == 1){
								tabuleiro[linhainicial+i+1][colunainicial-i-1].estado = false;
								tabuleiro[linhainicial+i+1][colunainicial-i-1].pNormal = false;
							}
						}
					} 
				}
				else{ // esta indo para tras
					if (colunainicial-colunafinal < 0){ //esta indo para a direita
						for (int i=0; i<linhafinal-linhainicial; i++) {
							if (i%2 == 1){
								tabuleiro[linhainicial-i-1][colunainicial+i+1].estado = false;
								tabuleiro[linhainicial-i-1][colunainicial+i+1].pNormal = false;
							}
						}
					}
					else{ //esta indo para a esquerda
						for (int i=0; i<linhafinal-linhainicial; i++) {
							if (i%2 == 1){
								tabuleiro[linhainicial-i-1][colunainicial-i-1].estado = false;
								tabuleiro[linhainicial-i-1][colunainicial-i-1].pNormal = false;
							}
						}
					}
				}	
			}
			Imprimir();
	}

	void Imprimir(){
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