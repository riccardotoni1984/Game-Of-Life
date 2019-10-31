import java.util.Objects;

public class AliveCell implements Cell {
    private Position position;

    public AliveCell(Position position) {

        this.position = position;
    }

    @Override
    public Cell nextGeneration(int neighboursCount) {
        if(neighboursCount == 2) return this;
        return new DeadCell(position);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AliveCell aliveCell = (AliveCell) o;
        return Objects.equals(position, aliveCell.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(position);
    }

    @Override
    public String toString() {
        return "AliveCell{" +
                "position=" + position +
                '}';
    }
}
