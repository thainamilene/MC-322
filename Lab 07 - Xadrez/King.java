public class King extends Pieces{ 
    
    public King (char color, boolean state, int line, int column, char type) {
        super(color, state, line, column, type);
    }
    boolean checkMoviment(int fline, int fcolumn, Chessboard chess) {
        if((line-fline)*(line-fline)>1 || (column-fcolumn)*(column-fcolumn)>1) {//verifica se o rei anda uma casa
            return false;
        } 
        if (chess.board[fline][fcolumn].state == true && chess.board[fline][fcolumn].color == color) {//verifica se o destino ha uma peca da mesma cor
            return false;
        }
        chess.moviment();
        return true;
    }       
}
