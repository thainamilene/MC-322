public class Tower extends Pieces{ 
    
    public Tower (char color, boolean state, int line, int column, char type){
        super(color, state, line, column, type);
    }
    boolean checkMoviment(int fline, int fcolumn, Chessboard chess){
        if (line!=fline && column!=fcolumn){
            return false;
        }
        if (chess.board[fline][fcolumn].state == true && chess.board[fline][fcolumn].color == color){//verifica se o destino nao ha uma peca da mesma cor
            return false;
        }
        if (line == fline){//andando na mesma linha
            if(column-fcolumn<0){//esta indo para a direita
                for (int i = 0; i < fcolumn-column-1; i++) {
                    if(chess.board[line][i].state){
                        return false;
                    }
                }
            }
            else if(fcolumn-column<0){//esta indo para a esquerda
                for (int i = 0; i < column-fcolumn-1; i++) {
                    if(chess.board[line][i].state){
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
                for (int i = 0; i < fline-line-1; i++) {
                    if(chess.board[line][i].state){
                        return false;
                    }
                }
            }
            else if(fline-line<0){//indo para tras
                for (int i = 0; i < line-fline-1; i++) {
                    if(chess.board[line][i].state){
                        return false;
                    }
                }
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
        chess.moviment();
        return true;
    }
}