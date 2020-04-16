public class Tabuleiros{
		pecas[][] tabuleiro;

		Tabuleiros(){
			tabuleiro = new pecas [7][7];
		}

		void montar(pecas peca){
			tabuleiro[peca.linha][peca.coluna] = peca;
		}

		void imprimir(){
			for(int i=7; i>0; i--){
				System.out.print (i); 				
				System.out.print (' '); 				
				for (int j=0; j<7; j++) {
						System.out.print (tabuleiro[i-1][j].estado);
						System.out.print (' '); 				 						
				}
				System.out.println();
			}
			System.out.println("  a b c d e f g");
			System.out.println(" ");
		}

	}