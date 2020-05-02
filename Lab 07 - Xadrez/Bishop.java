public class Bishop extends Pieces { 
    
    public Bishop (char color, boolean state, int line, int column, char type) {
        super(color, state, line, column, type);
    }
    
    boolean checkMoviment(int fline, int fcolumn, Chessboard chess, boolean transforms, char newtype) {

        if (transforms) { //verifica se e um movimento e valido
            return false;
        }
        if (chess.board[fline][fcolumn].state && chess.board[fline][fcolumn].color == color) { //verifica se o destino nao ha uma peca da mesma cor
            return false;
        }
        if (((fline-line) * (fline-line)) == ((fcolumn-column) * (fcolumn-column))) { //verifica se esta indo na diagonal
            if (line - fline < 0) { //verifica se esta indo para frente
                if (column - fcolumn < 0) { //verifica se esta indo direita
                    int k = 1;
                    for (int i = 1; i < (fline-line); i++) {
                        if(chess.board[line+i][column+k].state) {
                            return false;
                        }
                        k++;                   
                    }
                } 
                else if (fcolumn-column<0) { //verifica se esta indo esquerda
                    int k = 1;
                    for (int i = 1; i < (fline-line); i++) {
                        if(chess.board[line+i][column-k].state) {
                            return false;
                        }
                        k++;                   
                    }
                }
                else{
                    return false;
                }
            }
            else if (fline - line < 0) { //verifica se esta indo para tras
                if (column - fcolumn < 0) { //verifica se esta indo direita
                    int k = 1;
                    for (int i = 1; i < (line-fline); i++) {
                        if(chess.board[line-i][column+k].state) {
                            return false;
                        }
                        k++;                   
                    }
                } 
                else if (fcolumn - column<0) { //verifica se esta indo esquerda
                    int k = 1;
                    for (int i = 1; i < (line-fline); i++) {
                        if(chess.board[line-i][column-k].state) {
                            return false;
                        }
                        k++;                   
                    }
                }
                else{
                    return false;
                }
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
        boolean v = true;
        if(color == 'B') { //checa se o movimento nao colocara o rei em xeque
            v = chess.board[chess.KingBranco[0]][chess.KingBranco[1]].checkCheck(chess.KingBranco[0], chess.KingBranco[1], chess, chess.board[chess.KingBranco[0]][chess.KingBranco[1]].color);
        }
        else if (color == 'P') { //checa se o movimento nao colocara o rei em xeque
            v =  chess.board[chess.KingPreto[0]][chess.KingPreto[1]].checkCheck(chess.KingPreto[0], chess.KingPreto[1], chess, chess.board[chess.KingPreto[0]][chess.KingPreto[1]].color);
        }
        if (!v) {
            chess.moviment(line, column, fline, fcolumn, type);
            return true;
        }
        else{
            return false;
        }
	}	
}