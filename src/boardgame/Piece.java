package boardgame;

public class Piece {
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null; // nao precisa colocar, é só pra ser didatico
	}

	protected Board getBoard() {
		return board;
	}

	
}
