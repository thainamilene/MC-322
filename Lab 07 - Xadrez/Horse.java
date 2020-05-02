public class Horse extends Pieces{ 
    
    public Horse (char color, boolean state, int line, int column, char type) {
        super(color, state, line, column, type);
    }
    boolean checkMoviment(int fline, int fcolumn, Chessboard chess, boolean transforms, char newtype) {
        if (transforms) { //verifica se o movimento e do tipo transforma
            return false;
        }
        if (chess.board[fline][fcolumn].state == true && chess.board[fline][fcolumn].color == color) { //verifica se o destino ha uma peca da mesma cor
            return false;
        }
        if (((line-fline)*(line-fline) == 4 && (column-fcolumn)*(column-fcolumn) == 1) || ((line-fline)*(line-fline) == 1 && (column-fcolumn)*(column-fcolumn) == 4)) { //verifica se o cavalo anda em L
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
            else {
                return false;
            }
        }
        return false;
    }
}
