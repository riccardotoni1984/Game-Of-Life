import java.util.List;
import java.util.Objects;

import static java.util.Arrays.asList;

public class Position {

    private int x;
    private int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public List<Position> getNeighbours() {
        return asList(
                applyVector(1, 0),
                applyVector(0, 1),
                applyVector(1, 1),
                applyVector(0, -1),
                applyVector(-1, 0),
                applyVector(-1, -1),
                applyVector(1, -1),
                applyVector(-1, 1)
        );
    }

    private Position applyVector(int vectorX, int vectorY) {
        return new Position(x + vectorX, y + vectorY);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return x == position.x &&
                y == position.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "Position{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
