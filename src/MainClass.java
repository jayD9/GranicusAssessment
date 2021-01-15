import beans.RiceVolunteers;
import calculator.RiceVolunteersCalculator;

/**
 * author JD
 * created 1/14/21 8:08 AM
 */
public class MainClass {

    public static void main(String[] args) {
        RiceVolunteersCalculator calculator = new RiceVolunteersCalculator(args[0]);
        calculator.processFile();
        calculator.sortList();
        int day = 0;

        for(RiceVolunteers riceVolunteers : calculator.getList())
            System.out.println(riceVolunteers.getVolunteersNeeded()+" volunteers are needed for " +((riceVolunteers.getDay() != null) ? riceVolunteers.getDay() : "day "+(++day) ));

    }

}
