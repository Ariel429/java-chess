package chess.domain.piece;

import chess.domain.player.Player;
import chess.domain.position.Position;

public class Rook extends Piece {

    private Rook(Position position, Player player) {
        super(position, player);
    }

    public static Piece of(Position position, Player player) {
        return new Rook(position, player);
    }
}
