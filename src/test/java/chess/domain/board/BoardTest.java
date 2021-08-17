package chess.domain.board;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BoardTest {

    @Test
    @DisplayName("초기 체스판이 BoardRepositoryInitializer 를 통해 객체 생성되었는지 확인한다.")
    void boardInitTest() {
        assertThat(Board.of(new BoardRepositoryInitializer()))
                .isInstanceOf(Board.class);
    }
}
