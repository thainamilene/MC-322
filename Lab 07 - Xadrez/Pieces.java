public class Pieces {
	char color;
	boolean state;
	int line;
	int column;
	char type;

	Pieces(char color, boolean state, int line, int column, char type) {
		this.color = color;
		this.state = state;
		this.line = line;
		this.column = column;
		this.type = type;
	}

	Pieces(int line, int column){
		this.line = line;
		this.column = column;
		color = '-';
		state = false;
		type = '-';
	}
	boolean checkMoviment(int fline, int fcolumn, Chessboard chess, boolean transforms, char newtype) {
		return false;
	}
}
