
public class DeadCell implements Cell {

    @Override
    public Cell nextGeneration(int neighboursAmmount) {
        if (neighboursAmmount == 3)
            return new AliveCell();
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof DeadCell;
    }
}
