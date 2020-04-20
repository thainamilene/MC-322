public class Tabuleiro{
	Pecagenerica[][] tabuleiro = new Pecagenerica [8][8];

	Tabuleiro(){
		for (int i=0; i<8; i++) {
			for (int j=0; j<8; j++) {
				tabuleiro[i][j] = new Pecagenerica('-', false, i, j);							
			}			
		}
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
	}
}