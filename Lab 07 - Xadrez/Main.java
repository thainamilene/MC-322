//Thaina Milene de Oliveira - ra244570
class Main{
    static void createPieces(Chessboard chess){
        chess.board[0][0] = new Tower('B', true, 0, 0, 't');
        chess.board[0][1] = new Horse('B', true, 0, 1, 'h');
        chess.board[0][2] = new Bishop('B', true, 0, 2, 'b');
        chess.board[0][3] = new Queen('B', true, 0, 3, 'q');
        chess.board[0][4] = new King('B', true, 0, 4, 'k');
        chess.board[0][5] = new Bishop('B', true, 0, 5, 'b');
        chess.board[0][6] = new Horse('B', true, 0, 6, 'h');
        chess.board[0][7] = new Tower('B', true, 0, 7, 't');
        chess.board[1][0] = new Paw('B', true, 1, 0, 'p');
        chess.board[1][1] = new Paw('B', true, 1, 1, 'p');
        chess.board[1][2] = new Paw('B', true, 1, 2, 'p');
        chess.board[1][3] = new Paw('B', true, 1, 3, 'p');
        chess.board[1][4] = new Paw('B', true, 1, 4, 'p');
        chess.board[1][5] = new Paw('B', true, 1, 5, 'p');
        chess.board[1][6] = new Paw('B', true, 1, 6, 'p');
        chess.board[1][7] = new Paw('B', true, 1, 7, 'p');

        chess.board[7][0] = new Tower('P', true, 7, 0, 'T');
        chess.board[7][1] = new Horse('P', true, 7, 1, 'H');
        chess.board[7][2] = new Bishop('P', true, 7, 2, 'B');
        chess.board[7][3] = new King('P', true, 7, 3, 'K');
        chess.board[7][4] = new Queen('P', true, 7, 4, 'Q');
        chess.board[7][5] = new Bishop('P', true, 7, 5, 'B');
        chess.board[7][6] = new Horse('P', true, 7, 6, 'H');
        chess.board[7][7] = new Tower('P', true, 7, 7, 'T');
        chess.board[6][0] = new Paw('P', true, 6, 0, 'P');
        chess.board[6][1] = new Paw('P', true, 6, 1, 'P');
        chess.board[6][2] = new Paw('P', true, 6, 2, 'P');
        chess.board[6][3] = new Paw('P', true, 6, 3, 'P');
        chess.board[6][4] = new Paw('P', true, 6, 4, 'P');
        chess.board[6][5] = new Paw('P', true, 6, 5, 'P');
        chess.board[6][6] = new Paw('P', true, 6, 6, 'P');
        chess.board[6][7] = new Paw('P', true, 6, 7, 'P');
        
        System.out.println("Tabuleiro inicial:");
        chess.printOut();
    }
    static void moves(Commands[] commands, Chessboard chess){
        boolean v = false;
        for (int i = 0; i < commands.length; i++) {
            System.out.println("Source: " + commands[i].source2);
            System.out.println("Target: " + commands[i].target2);
            if(commands[i] instanceof Moviment){
                v = chess.board[commands[i].source[0]][commands[i].source[1]].checkMoviment(commands[i].target[0], commands[i].target[1], chess, false, chess.board[commands[i].source[0]][commands[i].source[1]].type);
            }
            else if (commands[i] instanceof Transforms) {
                v = chess.board[commands[i].source[0]][commands[i].source[1]].checkMoviment(commands[i].target[0], commands[i].target[1], chess, false, commands[i].newtype);
            }
            if (v==false){
                System.out.println("Jogada Inválida");
            }
        }
    }
    
    public static void main(String[] args){
        Chessboard chess = new Chessboard();
        createPieces(chess);
        Commands csv = new Commands();
		csv.setDataSource("./arq001.csv");
        Commands commands[] = csv.requestCommands(0);
        moves(commands, chess);
    }
    
}