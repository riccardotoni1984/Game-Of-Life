



import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CellShould {

    private Universe universe;

    @Test
    void living_cell_with_0_neighbour_should_die_on_next_generation() {
        Position position = new Position(0,0);
        Cell expectedCell = new DeadCell(position);
        Cell actualCell = new AliveCell(position);
        actualCell = actualCell.nextGeneration(0);
        assertEquals(expectedCell, actualCell);
    }

    @Test
    void living_cell_with_1_neighbour_should_die_on_next_generation() {
        Position position = new Position(0,0);
        Cell expectedCell = new DeadCell(position);
        Cell actualCell = new AliveCell(position);
        actualCell = actualCell.nextGeneration(1);
        assertEquals(expectedCell, actualCell);
    }

    @Test
    void living_cell_with_2_neighbour_should_live_on_next_generation() {
        Position position = new Position(0,0);
        Cell expectedCell = new AliveCell(position);
        Cell actualCell = new AliveCell(position);
        actualCell = actualCell.nextGeneration(2);
        assertEquals(expectedCell, actualCell);
    }

    @Test
    void living_cell_with_3_neighbour_should_live_on_next_generation() {
        Position position = new Position(0,0);
        Cell expectedCell = new AliveCell(position);
        Cell actualCell = new AliveCell(position);
        actualCell = actualCell.nextGeneration(3);
        assertEquals(expectedCell, actualCell);
    }

    @Test
    void death_cell_should_live_at_next_generation() {
        Position position = new Position(0,0);
        Cell expectedCell = new AliveCell(position);
        Cell actualCell = new DeadCell(position);
        actualCell = actualCell.nextGeneration(0);
        assertEquals(expectedCell, actualCell);
    }
}
