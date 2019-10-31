import javafx.geometry.Pos;
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


//    @Test
//    void count_living_neighbours() {
//        assertEquals(1, universe.countNeighboursOf(new Position(0,0)));
//    }

}
