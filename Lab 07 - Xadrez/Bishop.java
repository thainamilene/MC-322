public class Bishop extends Pieces{ 
    char type;
    
    public Bishop (char color, boolean state, int line, int column, char type){
        super(color, state, line, column, type);
    }

    boolean checkMoviment(int fline, int fcolumn, Chessboard chess){
        if (chess.board[fline][fcolumn].state ==true && chess.board[fline][fcolumn].color == color){
            return false;
        }
        if (fline-line * fline-line == fcolumn-column * fcolumn-column){
            if (line - fline < 0) { //indo para frente
                if (column - fcolumn < 0){ //direita
                    int k = 0;
                    for (int i = 0; i < (fline-line)-1; i++) {
                        if(chess.board[line+i][column+k].state){
                            return false;
                        }
                        k++;                   
                    }
                } 
                else{ //esquerda
                    int k = 0;
                    for (int i = 0; i < (fline-line)-1; i++) {
                        if(chess.board[line+i][column-k].state){
                            return false;
                        }
                        k++;                   
                    }
                }
            }
        }
        else{
           return false;
        }
        
	chess.Moviment();
	return true;
	}	
}