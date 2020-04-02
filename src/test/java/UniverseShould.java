
import org.junit.jupiter.api.Test;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UniverseShould {

    @Test
    void cells_are_dead_by_default() {
        Universe universe = new Universe(3);
        Map<Position, Cell> testingUniverseMap = universe.getUniverse();
        int actualNumberOfDeadCells = 0;
        for (Cell cell: testingUniverseMap.values()) {
            if(cell instanceof DeadCell){
                actualNumberOfDeadCells++;
            }
        }
        assertEquals(9,actualNumberOfDeadCells);
    }

    @Test
    void add_living_cells_while_creating_a_new_universe() {
        Universe universe = new Universe(3, new Position(0,0));
        Map<Position, Cell> testingUniverseMap = universe.getUniverse();
        int actualNumberOfDeadCells = 0;
        for (Cell cell: testingUniverseMap.values()) {
            if(cell instanceof DeadCell){
                actualNumberOfDeadCells++;
            }
        }
        assertEquals(8,actualNumberOfDeadCells);
    }

    @Test
    void count_living_neighbours() {
        Universe universe = new Universe(4, new Position(0,0), new Position(1,0), new Position(0,4));
        assertEquals(2, universe.countLivingNeighbours(new Position(1,1)));
    }

    @Test
    void a_single_cell_should_die_on_next_generation() {
        Universe universe = new Universe(3,
                new Position(0,0));
        universe.nextGeneration();
        Map<Position, Cell> testingUniverseMap = universe.getUniverse();
        int actualNumberOfDeadCells = 0;
        for (Cell cell: testingUniverseMap.values()) {
            if(cell instanceof DeadCell){
                actualNumberOfDeadCells++;
            }
        }
        assertEquals(9,actualNumberOfDeadCells);
    }

    @Test
    void a_cell_with_3_neighbours_should_live_on_next_generation() {
        Universe universe = new Universe(3,
                new Position(0,0),
                new Position(0,1),
                new Position(1,0));
        universe.nextGeneration();
        Map<Position, Cell> testingUniverseMap = universe.getUniverse();
        int actualNumberOfDeadCells = 0;
        for (Cell cell: testingUniverseMap.values()) {
            if(cell instanceof DeadCell){
                actualNumberOfDeadCells++;
            }
        }
        assertEquals(5, actualNumberOfDeadCells);
    }
}
