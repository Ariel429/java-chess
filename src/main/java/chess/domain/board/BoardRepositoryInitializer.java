package chess.domain.board;

import chess.domain.piece.Piece;
import chess.domain.position.Position;

import java.util.HashMap;
import java.util.Map;

public class BoardRepositoryInitializer implements ChessBoardInitializer {

    @Override
    public Map<Position, Piece> create() {
        Map<Position, Piece> initialBoard = new HashMap<>();
        for (InitialBoardRepository boardRepository : InitialBoardRepository.values()) {
            initialBoard.put(boardRepository.getPosition(), boardRepository.getPiece());
        }
        return initialBoard;
    }


}
