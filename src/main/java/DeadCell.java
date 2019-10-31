import java.util.Objects;

public class DeadCell implements Cell {
    private Position position;

    public DeadCell(Position position) {

        this.position = position;
    }

    @Override
    public Cell nextGeneration(int neighboursAmmount) {
        if (neighboursAmmount == 3)
            return new AliveCell(position);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DeadCell deadCell = (DeadCell) o;
        return Objects.equals(position, deadCell.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(position);
    }


    @Override
    public String toString() {
        return "DeadCell{" +
                "position=" + position +
                '}';
    }
}
