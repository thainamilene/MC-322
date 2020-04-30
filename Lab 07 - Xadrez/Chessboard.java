public class Chessboard{
    Pieces[][] board = new Pieces[8][8];
    
    Chessboard(){
		for (int i=0; i<8; i++) {
			for (int j=0; j<8; j++) {
				board[i][j] = new Pieces(i,j);							
			}			
		}
	}
    void Moviment(){

    }
    
    void printOut(){
		for(int i=8; i>0; i--){
				System.out.print (i); 				
				System.out.print (' '); 				
				for (int j=0; j<8; j++) {
					if (board[i-1][j].state == true){
						System.out.print (board[i-1][j].type);
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