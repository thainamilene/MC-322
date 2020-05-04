public class Queen extends Pieces{ 
    
    public Queen (char color, boolean state, int line, int column, char type, int count) {
        super(color, state, line, column, type, count);
    }
    
    boolean checkMoviment(int fline, int fcolumn, Chessboard chess, boolean transforms, char newtype) {
        if (transforms) { //verifica se o movimento e do tipo transforma
            return false;
        }
        if (chess.board[fline][fcolumn].state == true && chess.board[fline][fcolumn].color == color) { //verifica se o destino ha uma peca da mesma cor
            return false;
        }
        if (line == fline) { //verifica se esta andando na mesma linha
            if(column-fcolumn<0) { //verifica se esta indo para a direita
                for (int i = 1; i < fcolumn-column; i++) {
                    if(chess.board[line][column+i].state) {
                        return false;
                    }
                }
            }
            else if(fcolumn-column<0) { //verifica se esta indo para a esquerda
                for (int i = 1; i < column-fcolumn; i++) {
                    if(chess.board[line][column-i].state) {
                        return false;
                    }
                }
            }
            else{
                return false;
            }
        }
        else if(column == fcolumn) { //verifica se andando na vertical
            if (line-fline<0) {//verifica se indo para frente
                for (int i = 1; i < fline-line; i++) {
                    if(chess.board[line+i][column].state == true) {
                        return false;
                    }
                }
            }
            else if(fline-line<0) { //verifica se indo para tras
                for (int i = 0; i < line-fline; i++) {
                    if(chess.board[line-i][column].state) {
                        return false;
                    }
                }
            }
            else{
                return false;
            }
        }
        else if (((fline-line) * (fline-line)) == ((fcolumn-column) * (fcolumn-column))) { //verifica se esta indo na diagonal
            if (line - fline < 0) { //verifica se indo para frente
                if (column - fcolumn < 0) { //verifica se direita
                    int k = 1;
                    for (int i = 1; i < (fline-line); i++) {
                        if(chess.board[line+i][column+k].state) {
                            return false;
                        }
                        k++;                   
                    }
                } 
                else if (fcolumn-column<0) { //verifica se esta indo para esquerda
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
                if (column - fcolumn < 0) { //verifica se esta indo para a direita
                    int k = 1;
                    for (int i = 1; i < (line-fline); i++) {
                        if(chess.board[line-i][column+k].state) {
                            return false;
                        }
                        k++;                   
                    }
                } 
                else if (fcolumn - column<0) { //verifica se esta indo para a esquerda
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
            count++;
            chess.moviment(line, column, fline, fcolumn, type);
            return true;
        }
        else{
            return false;
        }
    }
}
