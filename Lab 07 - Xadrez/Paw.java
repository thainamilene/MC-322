public class Paw extends Pieces{ 
    
    public Paw (char color, boolean state, int line, int column, char type){
        super(color, state, line, column, type);
    }

    boolean checkMoviment(int fline, int fcolumn, Chessboard chess){
        if ((color == 'P' && fline-line>=1 )|| (color == 'B' && line-fline>=1) || fline == line){ //verifica se esta andando para sua respectiva frente
            return false;
        }
        
        if (column == fcolumn && ((line-fline)*(line-fline) == 1)){ //caso ande apenas uma casa
            if (chess.board[fline][fcolumn].state == true){ // quando ha uma peca em sua frente
                return false;
            }
        }
        else if ((column - fcolumn)*(column - fcolumn) == (line - fline)*(line - fline) && (line - fline)*(line - fline) == 1){ //caso ande uma casa na diagonal
             if (chess.board[fline][fcolumn].color == color || chess.board[fline][fcolumn].state == false) { //caso nao haja peca ou a as pecas sejam da mesma cor
                 return false;
             }
        }
        else if ((column == fcolumn && (line - fline)*(line - fline) == 4)) {//caso ande duas casas para frente
            if(line == 7 || line == 0){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }

        chess.Moviment();
        return true;
    }
}