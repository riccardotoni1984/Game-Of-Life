import java.util.HashMap;
import java.util.Map;

public class Universe {

    private Map<Position, Cell> universe;

    public Universe(int size) {
        universe = new HashMap<>();
        for (int i = 0; i <size ; i++) {
            for (int j = 0; j < size; j++) {
                universe.put(new Position(i,j), new DeadCell());
            }
        }
    }

    public Map<Position,Cell> getUniverse() {
        return universe;
    }


//    public int countNeighboursOf(Position position) {
//        return 1;
//    }
}
