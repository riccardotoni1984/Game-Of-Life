import javafx.geometry.Pos;

import java.util.HashMap;
import java.util.Map;

public class Universe {

    private Map<Position, Cell> universe;

    public Universe(int size) {
        universe = new HashMap<>();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                universe.put(new Position(i, j), new DeadCell());
            }
        }
    }

    public Universe(int size, Position... positions) {
        this(size);
        for (Position position : positions) {
            universe.replace(position, new AliveCell());
        }
    }

    public Map<Position, Cell> getUniverse() {
        return universe;
    }

    public int countLivingNeighbours(Position position) {
        int numberOfLivingNeighbours = 0;
        for (Position neighbour : position.getNeighbours()) {
            if (universe.get(neighbour) instanceof AliveCell) {
                numberOfLivingNeighbours++;
            }
        }
        return numberOfLivingNeighbours;
    }

    public void nextGeneration() {
        Map<Position, Cell> futureUniverse = new HashMap<>();

        for (Position position : universe.keySet()) {
            int livingNeighbours = countLivingNeighbours(position);
            Cell currentCell = universe.get(position);
            Cell futureCell = currentCell.nextGeneration(livingNeighbours);
            futureUniverse.put(position, futureCell);
        }
        universe = futureUniverse;
    }
}
