package chess.domain.board;

import chess.domain.piece.*;
import chess.domain.player.Player;
import chess.domain.position.Position;

public enum InitialBoardRepository {

    WHITE_PAWN_1(Position.of("A2"), Pawn.of(Position.of("A2"), Player.WHITE)),
    WHITE_PAWN_2(Position.of("B2"), Pawn.of(Position.of("B2"), Player.WHITE)),
    WHITE_PAWN_3(Position.of("C2"), Pawn.of(Position.of("C2"), Player.WHITE)),
    WHITE_PAWN_4(Position.of("D2"), Pawn.of(Position.of("D2"), Player.WHITE)),
    WHITE_PAWN_5(Position.of("E2"), Pawn.of(Position.of("E2"), Player.WHITE)),
    WHITE_PAWN_6(Position.of("F2"), Pawn.of(Position.of("F2"), Player.WHITE)),
    WHITE_PAWN_7(Position.of("G2"), Pawn.of(Position.of("G2"), Player.WHITE)),
    WHITE_PAWN_8(Position.of("H2"), Pawn.of(Position.of("H2"), Player.WHITE)),
    WHITE_ROOK_1(Position.of("A1"), Rook.of(Position.of("A1"), Player.WHITE)),
    WHITE_KNIGHT_1(Position.of("B1"), Knight.of(Position.of("B1"), Player.WHITE)),
    WHITE_BISHOP_1(Position.of("C1"), Bishop.of(Position.of("C1"), Player.WHITE)),
    WHITE_QUEEN(Position.of("D1"), Queen.of(Position.of("D1"), Player.WHITE)),
    WHITE_KING(Position.of("E1"), King.of(Position.of("E1"), Player.WHITE)),
    WHITE_BISHOP_2(Position.of("F1"), Bishop.of(Position.of("F1"), Player.WHITE)),
    WHITE_KNIGHT_2(Position.of("G1"), Knight.of(Position.of("G1"), Player.WHITE)),
    WHITE_ROOK_2(Position.of("H1"), Rook.of(Position.of("H1"), Player.WHITE)),
    BLACK_PAWN_1(Position.of("A7"), Pawn.of(Position.of("A7"), Player.BLACK)),
    BLACK_PAWN_2(Position.of("B7"), Pawn.of(Position.of("B7"), Player.BLACK)),
    BLACK_PAWN_3(Position.of("C7"), Pawn.of(Position.of("C7"), Player.BLACK)),
    BLACK_PAWN_4(Position.of("D7"), Pawn.of(Position.of("D7"), Player.BLACK)),
    BLACK_PAWN_5(Position.of("E7"), Pawn.of(Position.of("E7"), Player.BLACK)),
    BLACK_PAWN_6(Position.of("F7"), Pawn.of(Position.of("F7"), Player.BLACK)),
    BLACK_PAWN_7(Position.of("G7"), Pawn.of(Position.of("G7"), Player.BLACK)),
    BLACK_PAWN_8(Position.of("H7"), Pawn.of(Position.of("H7"), Player.BLACK)),
    BLACK_ROOK_1(Position.of("A8"), Rook.of(Position.of("A8"), Player.BLACK)),
    BLACK_KNIGHT_1(Position.of("B8"), Knight.of(Position.of("B8"), Player.BLACK)),
    BLACK_BISHOP_1(Position.of("C8"), Bishop.of(Position.of("C8"), Player.BLACK)),
    BLACK_QUEEN(Position.of("D8"), Queen.of(Position.of("D8"), Player.BLACK)),
    BLACK_KING(Position.of("E8"), King.of(Position.of("E8"), Player.BLACK)),
    BLACK_BISHOP_2(Position.of("F8"), Bishop.of(Position.of("F8"), Player.BLACK)),
    BLACK_KNIGHT_2(Position.of("G8"), Knight.of(Position.of("G8"), Player.BLACK)),
    BLACK_ROOK_2(Position.of("H8"), Rook.of(Position.of("H8"), Player.BLACK));

    private Position position;
    private Piece piece;

    InitialBoardRepository(Position position, Piece piece) {
        this.position = position;
        this.piece = piece;
    }

    public Position getPosition() {
        return position;
    }

    public Piece getPiece() {
        return piece;
    }
}