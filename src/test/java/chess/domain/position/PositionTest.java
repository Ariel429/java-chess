package chess.domain.position;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class PositionTest {

    @ParameterizedTest
    @ValueSource(strings = {"a1", "A8", "h1", "H8"})
    @DisplayName("체스 위치를 생성한다.")
    void create(String input) {
        assertThat(Position.of(input)).isEqualTo(Position.of(input));
    }
}