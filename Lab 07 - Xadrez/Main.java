//Thaina Milene de Oliveira - ra244570
class Main{
    static void createPieces(Chessboard chess){
        chess.board[0][0] = new Tower('B', true, 0, 0, 't');
        chess.board[0][1] = new Horse('B', true, 0, 0, 'h');
        chess.board[0][2] = new Bishop('B', true, 0, 0, 'b');
        chess.board[0][3] = new Queen('B', true, 0, 0, 'q');
        chess.board[0][4] = new King('B', true, 0, 0, 'k');
        chess.board[0][5] = new Bishop('B', true, 0, 0, 'b');
        chess.board[0][6] = new Horse('B', true, 0, 0, 'h');
        chess.board[0][7] = new Tower('B', true, 0, 0, 't');
        chess.board[1][0] = new Paw('B', true, 0, 0, 'p');
        chess.board[1][1] = new Paw('B', true, 0, 0, 'p');
        chess.board[1][2] = new Paw('B', true, 0, 0, 'p');
        chess.board[1][3] = new Paw('B', true, 0, 0, 'p');
        chess.board[1][4] = new Paw('B', true, 0, 0, 'p');
        chess.board[1][5] = new Paw('B', true, 0, 0, 'p');
        chess.board[1][6] = new Paw('B', true, 0, 0, 'p');
        chess.board[1][7] = new Paw('B', true, 0, 0, 'p');

        chess.board[7][0] = new Tower('P', true, 0, 0, 'T');
        chess.board[7][1] = new Horse('P', true, 0, 0, 'H');
        chess.board[7][2] = new Bishop('P', true, 0, 0, 'B');
        chess.board[7][3] = new King('P', true, 0, 0, 'K');
        chess.board[7][4] = new Queen('P', true, 0, 0, 'Q');
        chess.board[7][5] = new Bishop('P', true, 0, 0, 'B');
        chess.board[7][6] = new Horse('P', true, 0, 0, 'H');
        chess.board[7][7] = new Tower('P', true, 0, 0, 'T');
        chess.board[6][0] = new Paw('P', true, 0, 0, 'P');
        chess.board[6][1] = new Paw('P', true, 0, 0, 'P');
        chess.board[6][2] = new Paw('P', true, 0, 0, 'P');
        chess.board[6][3] = new Paw('P', true, 0, 0, 'P');
        chess.board[6][4] = new Paw('P', true, 0, 0, 'P');
        chess.board[6][5] = new Paw('P', true, 0, 0, 'P');
        chess.board[6][6] = new Paw('P', true, 0, 0, 'P');
        chess.board[6][7] = new Paw('P', true, 0, 0, 'P');
        
        System.out.println("Tabuleiro inicial:");
        chess.printOut();
    }
    static void rounds(Commands[] commands, Chessboard chess){

    }
    
    public static void main(String[] args){
        Chessboard chess = new Chessboard();
        createPieces(chess);
        Commands csv = new Commands();
		csv.setDataSource("./arq001.csv");
        Commands commands[] = csv.requestCommands(0);
        rounds(commands, chess);
    }
    
}