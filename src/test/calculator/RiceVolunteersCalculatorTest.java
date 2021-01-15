package test.calculator;

import calculator.RiceVolunteersCalculator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * author JD
 * created 1/14/21 2:21 PM
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class RiceVolunteersCalculatorTest {

    RiceVolunteersCalculator riceVolunteersCalculator;

    @Test
    public void testReadFile() throws IOException {
        riceVolunteersCalculator = new RiceVolunteersCalculator("src/resources/food_shelf_north.txt");
        riceVolunteersCalculator.readFile();
        System.out.println("---->"+riceVolunteersCalculator.getList());
        assertEquals( 10, riceVolunteersCalculator.getList().get(0).getVolunteers(), "First data value is incorrect.");
        assertEquals( 40, riceVolunteersCalculator.getList().get(0).getGoalBags(), "Second data value is incorrect.");
        assertEquals( 21, riceVolunteersCalculator.getList().get(0).getActualBags(), "Third data value is incorrect.");

    }

    @Test
    public void testProcessFile() {
        riceVolunteersCalculator = new RiceVolunteersCalculator("src/resources/food_shelf_north.txt");
        riceVolunteersCalculator.processFile();
        assertEquals( 5, riceVolunteersCalculator.getList().size(), "The schedule length in food_shelf_north.txt was incorrect");

        riceVolunteersCalculator = new RiceVolunteersCalculator("src/resources/food_shelf_south.txt");
        riceVolunteersCalculator.processFile();
        assertEquals( 3, riceVolunteersCalculator.getList().size(), "The schedule length in food_shelf_south.txt was incorrect");
    }
}