public class Paw extends Pieces { 
    
    public Paw (char color, boolean state, int line, int column, char type, int count) {
        super(color, state, line, column, type, count);
    }
    
    boolean checkMoviment(int fline, int fcolumn, Chessboard chess, boolean transforms, char newtype) {
        
        boolean v = true;
        if(transforms && !((line+1 == 7 && color == 'B') || line-1 == 0 && color == 'P')) { //verifica se o movimento do tipo transformar pode ser valido 
            return false;
        }
        if ((color == 'P' && fline-line>=1 )|| (color == 'B' && line-fline>=1) || fline == line) { //verifica se esta andando para sua respectiva frente
            return false;
        }
        if (chess.board[fline][fcolumn].state == true && chess.board[fline][fcolumn].color == color) { //verifica se no destino ha peca da mesma cor
            return false;
        }
        if (column == fcolumn && ((line-fline)*(line-fline) == 1)) { //caso ande apenas uma casa
            if (chess.board[fline][fcolumn].state == true) { // quando ha uma peca em sua frente
                return false;
            }
        }
        else if ((column - fcolumn)*(column - fcolumn) == (line - fline)*(line - fline) && (line - fline)*(line - fline) == 1) { //caso ande uma casa na diagonal
            if (chess.board[fline][fcolumn].state == false) { //caso nao haja peca
                if (chess.board[line][column].color == 'B' && line == 4 && chess.board[fline-1][fcolumn].state && chess.board[fline-1][fcolumn].type == 'P' && chess.board[fline-1][fcolumn].count == 1) { //movimento En passant
                    v = chess.board[chess.KingBranco[0]][chess.KingBranco[1]].checkCheck(chess.KingBranco[0], chess.KingBranco[1], chess, chess.board[chess.KingBranco[0]][chess.KingBranco[1]].color);
                    if (!v) {
                        chess.board[fline-1][fcolumn].type = '-';
                        chess.board[fline-1][fcolumn].color = '-';
                        chess.board[fline-1][fcolumn].state = false;
                        count++;
                        chess.moviment(line, column, fline, fcolumn, type);
                        return true;
                    }
                    else{
                        return false;
                    }
                }
                if (chess.board[line][column].color == 'P' && line == 3 && chess.board[fline+1][fcolumn].state && chess.board[fline+1][fcolumn].type == 'P' && chess.board[fline+1][fcolumn].count == 1) { //movimento En passant
                    v = chess.board[chess.KingPreto[0]][chess.KingPreto[1]].checkCheck(chess.KingPreto[0], chess.KingPreto[1], chess, chess.board[chess.KingPreto[0]][chess.KingPreto[1]].color);
                    if (!v) {
                        chess.board[fline+1][fcolumn].type = '-';
                        chess.board[fline+1][fcolumn].color = '-';
                        chess.board[fline+1][fcolumn].state = false;
                        count++;
                        chess.moviment(line, column, fline, fcolumn, type);
                        return true;
                    }
                    else{
                        return false;
                    }
                }
                else{
                    return false;
                }
             }
        }
        else if ((column == fcolumn && (line - fline)*(line - fline) == 4)) {//caso ande duas casas para frente
            if((line == 6 && color == 'P')|| (line == 1 && color =='B') && chess.board[fline][fcolumn].state==false) {//verifica se e o primeiro movimento e se o destino esta vazio
                if(color == 'B') { //checa se o movimento nao colocara o rei em xeque
                    v = chess.board[chess.KingBranco[0]][chess.KingBranco[1]].checkCheck(chess.KingBranco[0], chess.KingBranco[1], chess, chess.board[chess.KingBranco[0]][chess.KingBranco[1]].color);
                }
                else if (color == 'P') { //checa se o movimento nao colocara o rei em xeque
                    v =  chess.board[chess.KingPreto[0]][chess.KingPreto[1]].checkCheck(chess.KingPreto[0], chess.KingPreto[1], chess, chess.board[chess.KingPreto[0]][chess.KingPreto[1]].color);
                }
                if (!v) {
                    if (transforms) {
                        count++;
                        chess.moviment(line, column, fline, fcolumn, newtype);
                    } 
                    else{
                        count++;
                        chess.moviment(line, column, fline, fcolumn, type);
                    }
                    count++;
                    return true;
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
        
        if(color == 'B') { //checa se o movimento nao colocara o rei em xeque
            v = chess.board[chess.KingBranco[0]][chess.KingBranco[1]].checkCheck(chess.KingBranco[0], chess.KingBranco[1], chess, chess.board[chess.KingBranco[0]][chess.KingBranco[1]].color);
        }
        else if (color == 'P') { //checa se o movimento nao colocara o rei em xeque
            v = chess.board[chess.KingPreto[0]][chess.KingPreto[1]].checkCheck(chess.KingPreto[0], chess.KingPreto[1], chess, chess.board[chess.KingPreto[0]][chess.KingPreto[1]].color);
        }
        if (!v) {
            count++;
            if (transforms) {
                count++;
                chess.moviment(line, column, fline, fcolumn, newtype);
            } 
            else{
                count++;
                chess.moviment(line, column, fline, fcolumn, type);
            }
            return true;
        }
        else{
            return false;
        }
    }
}
