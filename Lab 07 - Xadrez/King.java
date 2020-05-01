public class King extends Pieces{ 
    
    public King (char color, boolean state, int line, int column, char type) {
        super(color, state, line, column, type);
    }
    boolean checkMoviment(int fline, int fcolumn, Chessboard chess, boolean transforms, char newtype) {
        if((line-fline)*(line-fline)>1 || (column-fcolumn)*(column-fcolumn)>1) {//verifica se o rei anda uma casa
            return false;
        } 
        if (chess.board[fline][fcolumn].state == true && chess.board[fline][fcolumn].color == color) {//verifica se o destino ha uma peca da mesma cor
            return false;
        }
        chess.moviment(line, column, fline, fcolumn, type);
        return true;
    }       
    boolean checkCheck(int lline, int ccolumn, Chessboard chess){
        int i = 1;
        while(i<8){
            if (lline+i<8) {//mesma coluna indo para frente
                if(chess.board[lline+i][ccolumn].state && chess.board[lline+i][ccolumn].color!=chess.board[lline][ccolumn].color && (chess.board[lline+i][ccolumn].type == 'q' || chess.board[lline+i][ccolumn].type == 'Q' || chess.board[lline+i][ccolumn].type == 't' || chess.board[lline+i][ccolumn].type == 'T')) {
                    return true;
                }
            }
            if (lline-i>=0) {//mesma coluna indo para tras
                if(chess.board[lline-i][ccolumn].state && chess.board[lline-i][ccolumn].color!=chess.board[lline][ccolumn].color && (chess.board[lline-i][ccolumn].type == 'q' || chess.board[lline-i][ccolumn].type == 'Q' || chess.board[lline-i][ccolumn].type == 't' || chess.board[lline-i][ccolumn].type == 'T')) {
                    return true;
                }
            }
            if (ccolumn+i<8) {//mesma linha indo para direita
                if(chess.board[lline][ccolumn+i].state && chess.board[lline][ccolumn+i].color!=chess.board[lline][ccolumn].color && (chess.board[lline][ccolumn+i].type == 'q' || chess.board[lline][ccolumn+i].type == 'Q' || chess.board[lline][ccolumn+i].type == 't' || chess.board[lline][ccolumn+i].type == 'T')) {
                    return true;
                }
            }
            if (ccolumn-i>=0) {//mesma linha indo para esquerda
                if(chess.board[lline][ccolumn-i].state && chess.board[lline][ccolumn-i].color!=chess.board[lline][ccolumn].color && (chess.board[lline][ccolumn-i].type == 'q' || chess.board[lline][ccolumn-i].type == 'Q' || chess.board[lline][ccolumn-i].type == 't' || chess.board[lline][ccolumn-i].type == 'T')) {
                    return true;
                }
            }
            if (lline+i<8 && ccolumn+i<8) {//diagonal direita para frente
                if(i==1 && chess.board[lline+i][ccolumn+i].state && chess.board[lline+i][ccolumn+i].color!=chess.board[lline][ccolumn].color && (chess.board[lline+i][ccolumn+i].type == 'p' || chess.board[lline+i][ccolumn+i].type == 'P' )){
                    return true;
                }
                if(chess.board[lline+i][ccolumn+i].state && chess.board[lline+i][ccolumn+i].color!=chess.board[lline][ccolumn].color && (chess.board[lline+i][ccolumn+i].type == 'q' || chess.board[lline+i][ccolumn+i].type == 'Q' || chess.board[lline+i][ccolumn+i].type == 'b' || chess.board[lline+i][ccolumn+i].type == 'B')) {
                    return true;
                }
            }
            if (lline+i<8 && ccolumn+i>=0) {//diagonal esquerda para frente
                if(i==1 && chess.board[lline+i][ccolumn-i].state && chess.board[lline+i][ccolumn-i].color!=chess.board[lline][ccolumn].color && (chess.board[lline+i][ccolumn-i].type == 'p' || chess.board[lline+i][ccolumn-i].type == 'P' )){
                    return true;
                }
                if(chess.board[lline+i][ccolumn-i].state && chess.board[lline+i][ccolumn-i].color!=chess.board[lline][ccolumn].color && (chess.board[lline+i][ccolumn-i].type == 'q' || chess.board[lline+i][ccolumn-i].type == 'Q' || chess.board[lline+i][ccolumn-i].type == 'b' || chess.board[lline+i][ccolumn-i].type == 'B')) {
                    return true;
                }
            }
            if (lline+i>=0 && ccolumn+i<8) {//diagonal direita para tras
                if(i==1 && chess.board[lline-i][ccolumn+i].state && chess.board[lline-i][ccolumn+i].color!=chess.board[lline][ccolumn].color && (chess.board[lline-i][ccolumn+i].type == 'p' || chess.board[lline-i][ccolumn+i].type == 'P' )){
                    return true;
                }
                if(chess.board[lline-i][ccolumn+i].state && chess.board[lline-i][ccolumn+i].color!=chess.board[lline][ccolumn].color && (chess.board[lline-i][ccolumn+i].type == 'q' || chess.board[lline-i][ccolumn+i].type == 'Q' || chess.board[lline-i][ccolumn+i].type == 'b' || chess.board[lline-i][ccolumn+i].type == 'B')) {
                    return true;
                }
            }
            if (lline+i>=0 && ccolumn+i>=0) {//diagonal esquerda para tras
                if(i==1 && chess.board[lline-i][ccolumn-i].state && chess.board[lline-i][ccolumn-i].color!=chess.board[lline][ccolumn].color && (chess.board[lline-i][ccolumn-i].type == 'p' || chess.board[lline-i][ccolumn-i].type == 'P' )){
                    return true;
                }
                if(chess.board[lline-i][ccolumn-i].state && chess.board[lline-i][ccolumn-i].color!=chess.board[lline][ccolumn].color && (chess.board[lline-i][ccolumn-i].type == 'q' || chess.board[lline-i][ccolumn-i].type == 'Q' || chess.board[lline-i][ccolumn-i].type == 'b' || chess.board[lline-i][ccolumn-i].type == 'B')) {
                    return true;
                }
            }
            i++;
        }
        //fazer verificacao do cavalo, e parar quando encontrar outras pecas na direcao
        return false;
    }
}
