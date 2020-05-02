public class King extends Pieces{ 
    
    public King (char color, boolean state, int line, int column, char type) {
        super(color, state, line, column, type);
    }
    boolean checkMoviment(int fline, int fcolumn, Chessboard chess, boolean transforms, char newtype) {
        if (transforms) { //verifica se o movimento nao e do tipo transforms
            return false;
        }
        boolean v = true;
        if((line-fline)*(line-fline)>1 || (column-fcolumn)*(column-fcolumn)>1) { //verifica se o rei anda uma casa
            return false;
        } 
        if (chess.board[fline][fcolumn].state == true && chess.board[fline][fcolumn].color == color) { //verifica se o destino ha uma peca da mesma cor
            return false;
        }
        v = checkCheck(fline, fcolumn, chess, color); //checa se o movimento nao colocara o rei em xeque
        if (!v) {
            chess.moviment(line, column, fline, fcolumn, type);
            return true;
        }
        return false;
    }       
    boolean checkCheck(int lline, int ccolumn, Chessboard chess, char ccolor) {
        int i = 1;
        int v1 = 0, v2 = 0, v3 = 0, v4 = 0, v5 = 0, v6 = 0, v7 = 0, v8 = 0;
        while(i<8) {
            if (lline+i<8) { // verifica na mesma coluna indo para frente
                if(chess.board[lline+i][ccolumn].state && v1 == 0) {
                    if (i==1 && (chess.board[lline+i][ccolumn].color!=ccolor && (chess.board[lline+i][ccolumn].type == 'k' || chess.board[lline+i][ccolumn].type == 'K' ))) {
                        return true;
                    }
                    if((chess.board[lline+i][ccolumn].color!=ccolor && (chess.board[lline+i][ccolumn].type == 'q' || chess.board[lline+i][ccolumn].type == 'Q' || chess.board[lline+i][ccolumn].type == 't' || chess.board[lline+i][ccolumn].type == 'T'))) {
                        return true;
                    } 
                    else{
                        v1 = 1;
                    }
                }
            }
            if (lline-i>=0) { //verifica na mesma coluna indo para tras
                if(chess.board[lline-i][ccolumn].state && v2 == 0)  {
                    if (i==1 && chess.board[lline-i][ccolumn].color!=ccolor && (chess.board[lline-i][ccolumn].type == 'k' || chess.board[lline-i][ccolumn].type == 'K')) {
                        return true;    
                    }
                    if (chess.board[lline-i][ccolumn].color!=ccolor && (chess.board[lline-i][ccolumn].type == 'q' || chess.board[lline-i][ccolumn].type == 'Q' || chess.board[lline-i][ccolumn].type == 't' || chess.board[lline-i][ccolumn].type == 'T')) {
                        return true;
                    }
                    else{
                        v2 = 1;
                    }
                }
            }
            if (ccolumn+i<8) { //verifica na mesma linha indo para direita
                if(chess.board[lline][ccolumn+i].state && v3 == 0) {
                    if (i==0 && chess.board[lline][ccolumn+i].color!=ccolor && (chess.board[lline][ccolumn+i].type == 'k' || chess.board[lline][ccolumn+i].type == 'K')) {
                        return true;
                    }
                    if (chess.board[lline][ccolumn+i].color!=ccolor && (chess.board[lline][ccolumn+i].type == 'q' || chess.board[lline][ccolumn+i].type == 'Q' || chess.board[lline][ccolumn+i].type == 't' || chess.board[lline][ccolumn+i].type == 'T')) {
                        return true;
                    }
                    else{
                        v3 = 1;
                    }
                }
            }
            if (ccolumn-i>=0) { //verifica na mesma linha indo para esquerda
                if(chess.board[lline][ccolumn-i].state && v4 == 0) {
                    if (i==0 && chess.board[lline][ccolumn-i].color!=ccolor && (chess.board[lline][ccolumn-i].type == 'k' || chess.board[lline][ccolumn-i].type == 'K')) {
                        return true;   
                    }
                    if (chess.board[lline][ccolumn-i].color!=ccolor && (chess.board[lline][ccolumn-i].type == 'q' || chess.board[lline][ccolumn-i].type == 'Q' || chess.board[lline][ccolumn-i].type == 't' || chess.board[lline][ccolumn-i].type == 'T')) {
                        return true;
                    }
                    else{
                        v4 = 1;
                    }
                }
            }
            if (lline+i<8 && ccolumn+i<8) { //verifica na diagonal direita para frente
                if(i==1 && chess.board[lline+i][ccolumn+i].state && chess.board[lline+i][ccolumn+i].color!=ccolor && (chess.board[lline+i][ccolumn+i].type == 'p' || chess.board[lline+i][ccolumn+i].type == 'P' || chess.board[lline+i][ccolumn+i].type == 'k' || chess.board[lline+i][ccolumn+i].type == 'K')) {
                    return true;
                }
                if(chess.board[lline+i][ccolumn+i].state && v5 == 0) {
                    if (chess.board[lline+i][ccolumn+i].color!=ccolor && (chess.board[lline+i][ccolumn+i].type == 'q' || chess.board[lline+i][ccolumn+i].type == 'Q' || chess.board[lline+i][ccolumn+i].type == 'b' || chess.board[lline+i][ccolumn+i].type == 'B')) {
                        return true;
                    }
                    else{
                        v5 = 1;
                    }
                }
            }
            if (lline+i<8 && ccolumn-i>=0) { // verifica na diagonal esquerda para frente
                if(i==1 && chess.board[lline+i][ccolumn-i].state && chess.board[lline+i][ccolumn-i].color!=ccolor && (chess.board[lline+i][ccolumn-i].type == 'p' || chess.board[lline+i][ccolumn-i].type == 'P' || chess.board[lline+i][ccolumn-i].type == 'k' || chess.board[lline+i][ccolumn-i].type == 'K')) {
                    return true;
                }
                if(chess.board[lline+i][ccolumn-i].state && v6 == 0) {
                    if (chess.board[lline+i][ccolumn-i].color!=ccolor && (chess.board[lline+i][ccolumn-i].type == 'q' || chess.board[lline+i][ccolumn-i].type == 'Q' || chess.board[lline+i][ccolumn-i].type == 'b' || chess.board[lline+i][ccolumn-i].type == 'B')) {
                       return true;
                    }
                    else{
                        v6 = 1;
                    }
                }
            }
            if (lline-i>=0 && ccolumn+i<8) { //verifica na diagonal direita para tras
                if(i==1 && chess.board[lline-i][ccolumn+i].state && chess.board[lline-i][ccolumn+i].color!=ccolor && (chess.board[lline-i][ccolumn+i].type == 'p' || chess.board[lline-i][ccolumn+i].type == 'P' || chess.board[lline+i][ccolumn-i].type == 'k' || chess.board[lline+i][ccolumn-i].type == 'K')) {
                    return true;
                }
                if(chess.board[lline-i][ccolumn+i].state && v7 == 0) {
                    if(chess.board[lline-i][ccolumn+i].color!=ccolor && (chess.board[lline-i][ccolumn+i].type == 'q' || chess.board[lline-i][ccolumn+i].type == 'Q' || chess.board[lline-i][ccolumn+i].type == 'b' || chess.board[lline-i][ccolumn+i].type == 'B')) {
                        return true;
                    }
                    else{
                        v7 = 1;
                    }
                }
            }
            if (lline-i>=0 && ccolumn-i>=0) { // verifica na diagonal esquerda para tras
                if(i==1 && chess.board[lline-i][ccolumn-i].state && chess.board[lline-i][ccolumn-i].color!=ccolor && (chess.board[lline-i][ccolumn-i].type == 'p' || chess.board[lline-i][ccolumn-i].type == 'P' || chess.board[lline-i][ccolumn-i].type == 'k' || chess.board[lline-i][ccolumn-i].type == 'K')) {
                    return true;
                }
                if(chess.board[lline-i][ccolumn-i].state && v8 == 0) {
                    if (chess.board[lline-i][ccolumn-i].color!=ccolor && (chess.board[lline-i][ccolumn-i].type == 'q' || chess.board[lline-i][ccolumn-i].type == 'Q' || chess.board[lline-i][ccolumn-i].type == 'b' || chess.board[lline-i][ccolumn-i].type == 'B')) {
                        return true;
                    }
                    else{
                        v8 = 1;
                    }
                }
            }
            i++;
        }
        
        //verificam as posições do cavalo
        if (lline+2<8 && ccolumn+1<8) {
            if(chess.board[lline+2][ccolumn+1].state && chess.board[lline+2][ccolumn+1].color!=ccolor && (chess.board[lline+2][ccolumn+1].type == 'h' || chess.board[lline+2][ccolumn+1].type == 'H' )) {
                return true;
            }
        }
        if (lline+2<8 && ccolumn-1>=0) {
            if(chess.board[lline+2][ccolumn-1].state && chess.board[lline+2][ccolumn-1].color!=ccolor && (chess.board[lline+2][ccolumn-1].type == 'h' || chess.board[lline+2][ccolumn-1].type == 'H' )) {
                return true;
            }
        }
        if (lline-2>=0 && ccolumn+1<8) {
            if(chess.board[lline-2][ccolumn+1].state && chess.board[lline-2][ccolumn+1].color!=ccolor && (chess.board[lline-2][ccolumn+1].type == 'h' || chess.board[lline-2][ccolumn+1].type == 'H' )) {
                return true;
            }
        }
        if (lline-2>=0 && ccolumn-1>=0) {
            if(chess.board[lline-2][ccolumn-1].state && chess.board[lline-2][ccolumn-1].color!=ccolor && (chess.board[lline-2][ccolumn-1].type == 'h' || chess.board[lline-2][ccolumn-1].type == 'H' )) {
                return true;
            }
        }
        if (lline+1<8 && ccolumn+2<8) {
            if(chess.board[lline+1][ccolumn+2].state && chess.board[lline+1][ccolumn+2].color!=ccolor && (chess.board[lline+1][ccolumn+2].type == 'h' || chess.board[lline+1][ccolumn+2].type == 'H' )) {
                return true;
            }
        }
        if (lline+1<8 && ccolumn-2>=0) {
            if(chess.board[lline+1][ccolumn-2].state && chess.board[lline+1][ccolumn-2].color!=ccolor && (chess.board[lline+1][ccolumn-2].type == 'h' || chess.board[lline+1][ccolumn-2].type == 'H' )) {
                return true;
            }
        }
        if (lline-1>=0 && ccolumn+2<8) {
            if(chess.board[lline-1][ccolumn+2].state && chess.board[lline-1][ccolumn+2].color!=ccolor && (chess.board[lline-1][ccolumn+2].type == 'h' || chess.board[lline-1][ccolumn+2].type == 'H' )) {
                return true;
            }
        }
        if (lline-1>=0 && ccolumn-2>=0) {
            if(chess.board[lline-1][ccolumn-2].state && chess.board[lline-1][ccolumn-2].color!=ccolor && (chess.board[lline-1][ccolumn-2].type == 'h' || chess.board[lline-1][ccolumn-2].type == 'H' )) {
                return true;
            }
        }
        return false;
    }
}
