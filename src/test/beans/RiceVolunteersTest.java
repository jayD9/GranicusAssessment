package test.beans;

import beans.RiceVolunteers;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

/**
 * author JD
 * created 1/14/21 2:19 PM
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class RiceVolunteersTest {

    RiceVolunteers riceVolunteers;

    @Test
    public void testBagsStillNeeded(){
        riceVolunteers = new RiceVolunteers(10,20,18,"Monday");
        riceVolunteers.calculateBagsStillNeeded();
        assertEquals( 2, riceVolunteers.getBagsStillNeeded(), "The bags needed for day one was incorrect");

        riceVolunteers = new RiceVolunteers(12,25,15);
        riceVolunteers.calculateBagsStillNeeded();
        assertEquals( 10, riceVolunteers.getBagsStillNeeded(), "The bags needed for day one was incorrect");
    }

    @Test
    public void testBagsStockedPerVolunteer() {
        riceVolunteers = new RiceVolunteers(10,20,18,"Monday");
        riceVolunteers.calculateBagsStockedPerVolunteer();
        assertEquals(1.80,riceVolunteers.getBagsStockedPerVolunteer(),0.01,"The bags stocked per volunteer on day one was incorrect");

        riceVolunteers = new RiceVolunteers(12,25,15);
        riceVolunteers.calculateBagsStockedPerVolunteer();
        assertEquals(1.25,riceVolunteers.getBagsStockedPerVolunteer(),0.01,"The bags stocked per volunteer on day one was incorrect");
    }

    @Test
    public void testVolunteersNeeded() {
        riceVolunteers = new RiceVolunteers(10,20,18,"Monday");
        riceVolunteers.calculateBagsStillNeeded();
        riceVolunteers.calculateBagsStockedPerVolunteer();
        riceVolunteers.calculateVolunteersNeeded();
        assertEquals( 1.11, riceVolunteers.getVolunteersNeeded(), 0.01, "The volunteers needed for day one is incorrect");

        riceVolunteers = new RiceVolunteers(12,25,15,"Monday");
        riceVolunteers.calculateBagsStillNeeded();
        riceVolunteers.calculateBagsStockedPerVolunteer();
        riceVolunteers.calculateVolunteersNeeded();
        assertEquals( 8.0, riceVolunteers.getVolunteersNeeded(), 0.01, "The volunteers needed for day one is incorrect");

    }
}