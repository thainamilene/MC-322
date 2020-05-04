public class Pieces {
	char color;
	boolean state;
	int line;
	int column;
	char type;
	int count;

	Pieces(char color, boolean state, int line, int column, char type, int count) {
		this.color = color;
		this.state = state;
		this.line = line;
		this.column = column;
		this.type = type;
		this.count = count;
	}

	Pieces(int line, int column) {
		this.line = line;
		this.column = column;
		color = '-';
		state = false;
		type = '-';
	}
	boolean checkMoviment(int fline, int fcolumn, Chessboard chess, boolean transforms, char newtype) {
		return false;
	}
	boolean checkCheck(int lline, int ccolumn, Chessboard chess, char ccolor) {
		return true;
	}
}
