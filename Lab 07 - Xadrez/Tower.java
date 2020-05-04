public class Tower extends Pieces{ 
    
    public Tower (char color, boolean state, int line, int column, char type, int count) {
        super(color, state, line, column, type, count);
    }
    boolean checkMoviment(int fline, int fcolumn, Chessboard chess, boolean transforms, char newtype) {
        if (transforms) { //verifiva se o movimento e do tipo transforma
            return false;
        }
        if (line!=fline && column!=fcolumn) { //verifica se a torre anda em linha reta
            return false;
        }
        if (chess.board[fline][fcolumn].state == true && chess.board[fline][fcolumn].color == color) { //verifica se o destino nao ha uma peca da mesma cor
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
        else if(column == fcolumn) { //verifica se esta andando na vertical
            if (line-fline<0) { //verifica se esta indo para frente
                for (int i = 1; i < fline-line; i++) {
                    if(chess.board[line+i][column].state == true) {
                        return false;
                    }
                }
            }
            else if(fline-line<0) { //verifica se esta indo para tras
                for (int i = 1; i < line-fline; i++) {
                    if(chess.board[line-i][column].state) {
                        System.out.println(i);
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
        boolean v = true;
        if(color == 'B') { //checa se o movimento nao colocara o rei em xeque
            v = chess.board[chess.KingBranco[0]][chess.KingBranco[1]].checkCheck(chess.KingBranco[0], chess.KingBranco[1], chess, chess.board[chess.KingBranco[0]][chess.KingBranco[1]].color);
        }
        else if (color == 'P') { //checa se o movimento nao coverifica selocara o rei em xeque
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