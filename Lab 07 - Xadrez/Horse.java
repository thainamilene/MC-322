public class Horse extends Pieces{ 
    
    public Horse (char color, boolean state, int line, int column, char type){
        super(color, state, line, column, type);
    }
    boolean checkMoviment(int fline, int fcolumn, Chessboard chess, boolean transforms, char newtype){
        if (chess.board[fline][fcolumn].state == true && chess.board[fline][fcolumn].color == color){//verifica se o destino ha uma peca da mesma cor
            return false;
        }
        if (((line-fline)*(line-fline) == 4 && (column-fcolumn)*(column-fcolumn) == 1) || ((line-fline)*(line-fline) == 1 && (column-fcolumn)*(column-fcolumn) == 4)){ //verifica se o cavalo anda em L
            chess.moviment(line, column, fline, fcolumn, type);
            return true;
        }
        return false;
    }
}
