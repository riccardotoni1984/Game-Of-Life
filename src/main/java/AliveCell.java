import java.util.Objects;

public class AliveCell implements Cell {

    @Override
    public Cell nextGeneration(int neighboursCount) {
        if(neighboursCount == 2 || neighboursCount == 3) return this;
        return new DeadCell();
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof AliveCell;
    }

}
