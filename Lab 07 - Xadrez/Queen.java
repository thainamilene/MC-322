public class Queen extends Pieces{ 
    
    public Queen (char color, boolean state, int line, int column, char type){
        super(color, state, line, column, type);
    }

    boolean checkMoviment(int fline, int fcolumn, Chessboard chess, boolean transforms, char newtype){
        if (chess.board[fline][fcolumn].state == true && chess.board[fline][fcolumn].color == color){//verifica se o destino ha uma peca da mesma cor
            return false;
        }
        if (line == fline){//andando na mesma linha
            if(column-fcolumn<0){//esta indo para a direita
                for (int i = 1; i < fcolumn-column; i++) {
                    if(chess.board[line][column+i].state){
                        return false;
                    }
                }
            }
            else if(fcolumn-column<0){//esta indo para a esquerda
                for (int i = 1; i < column-fcolumn; i++) {
                    if(chess.board[line][column-i].state){
                        return false;
                    }
                }
            }
            else{
                return false;
            }
        }
        else if(column == fcolumn){//andando na vertical
            if (line-fline<0){//indo para frente
                for (int i = 1; i < fline-line; i++) {
                    if(chess.board[line+i][column].state == true){
                        return false;
                    }
                }
            }
            else if(fline-line<0){//indo para tras
                for (int i = 0; i < line-fline; i++) {
                    if(chess.board[line-i][column].state){
                        return false;
                    }
                }
            }
            else{
                return false;
            }
        }
        if (((fline-line) * (fline-line)) == ((fcolumn-column) * (fcolumn-column))) {//verifica se esta indo na diagonal
            if (line - fline < 0) { //indo para frente
                if (column - fcolumn < 0){ //direita
                    int k = 1;
                    for (int i = 1; i < (fline-line); i++) {
                        if(chess.board[line+i][column+k].state) {
                            return false;
                        }
                        k++;                   
                    }
                } 
                else if (fcolumn-column>0){ //esquerda
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
            else if (fline - line < 0) { //indo para tras
                if (column - fcolumn < 0){ //direita
                    int k = 1;
                    for (int i = 1; i < (line-fline); i++) {
                        if(chess.board[line-i][column+k].state) {
                            return false;
                        }
                        k++;                   
                    }
                } 
                else if (fcolumn - column<0){ //esquerda
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

        chess.moviment(line, column, fline, fcolumn, type);
        return true;
    }
}
