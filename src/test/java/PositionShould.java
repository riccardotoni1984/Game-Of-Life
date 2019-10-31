import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PositionShould {
    @Test
    void return_its_neighbours() {
        List<Position> actualNeighbours = new Position(2,2).getNeighbours();
        List<Position> expectedNeighbours = asList(
                new Position(3, 2),
                new Position(2, 3),
                new Position(3, 3),
                new Position(2, 1),
                new Position(1, 2),
                new Position(1, 1),
                new Position(3, 1),
                new Position(1, 3)
                );
        assertEquals(expectedNeighbours, actualNeighbours);
    }

}

