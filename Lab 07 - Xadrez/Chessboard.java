public class Chessboard{
    Pieces[][] board = new Pieces[8][8];
    
    Chessboard(){
		for (int i=0; i<8; i++) {
			for (int j=0; j<8; j++) {
				board[i][j] = new Pieces(i,j);							
			}			
		}
	}
    void moviment(int line, int column, int fline, int fcolumn, char type){
        if (type == 'p' || type == 'P'){
            board[fline][fcolumn] = new Paw(board[line][column].color, board[line][column].state, fline, fcolumn, board[line][column].type);
        }
        else if (type == 'b' || type == 'B'){
            board[fline][fcolumn] = new Bishop(board[line][column].color, board[line][column].state, fline, fcolumn, board[line][column].type);
        }
        else if (type == 't' || type == 'T'){
            board[fline][fcolumn] = new Tower(board[line][column].color, board[line][column].state, fline, fcolumn, board[line][column].type);
        }
        else if (type == 'h' || type == 'H'){
            board[fline][fcolumn] = new Horse(board[line][column].color, board[line][column].state, fline, fcolumn, board[line][column].type);
        }
        else if (type == 'q' || type == 'Q'){
            board[fline][fcolumn] = new Queen(board[line][column].color, board[line][column].state, fline, fcolumn, board[line][column].type);
        }
        else if (type == 'k' || type == 'K'){
            board[fline][fcolumn] = new King(board[line][column].color, board[line][column].state, fline, fcolumn, board[line][column].type);
        }
        board[line][column].color = '-';
        board[line][column].state = false;
        board[line][column].type = '-';

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