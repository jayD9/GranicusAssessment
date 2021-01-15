package beans;

/**
 * author JD
 * created 1/14/21 9:45 AM
 */
public class RiceVolunteers {

    private Integer bagsStillNeeded;
    private Double bagsStockedPerVolunteer;
    private Double volunteersNeeded;
    private Integer volunteers;
    private Integer goalBags;
    private Integer actualBags;
    private String day;

    public RiceVolunteers(Integer volunteers, Integer goalBags, Integer actualBags, String day) {
        this.volunteers = volunteers;
        this.goalBags = goalBags;
        this.actualBags = actualBags;
        this.day = day;
    }

    public RiceVolunteers(Integer volunteers, Integer goalBags, Integer actualBags) {
        this.volunteers = volunteers;
        this.goalBags = goalBags;
        this.actualBags = actualBags;
    }

    public Integer getBagsStillNeeded() {
        return bagsStillNeeded;
    }

    public void setBagsStillNeeded(Integer bagsStillNeeded) {
        this.bagsStillNeeded = bagsStillNeeded;
    }

    public Double getBagsStockedPerVolunteer() {
        return bagsStockedPerVolunteer;
    }

    public void setBagsStockedPerVolunteer(Double bagsStockedPerVolunteer) {
        this.bagsStockedPerVolunteer = bagsStockedPerVolunteer;
    }

    public Double getVolunteersNeeded() {
        return volunteersNeeded;
    }

    public void setVolunteersNeeded(Double volunteersNeeded) {
        this.volunteersNeeded = volunteersNeeded;
    }

    public Integer getVolunteers() {
        return volunteers;
    }

    public void setVolunteers(Integer volunteers) {
        this.volunteers = volunteers;
    }

    public Integer getGoalBags() {
        return goalBags;
    }

    public void setGoalBags(Integer goalBags) {
        this.goalBags = goalBags;
    }

    public Integer getActualBags() {
        return actualBags;
    }

    public void setActualBags(Integer actualBags) {
        this.actualBags = actualBags;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "RiceVolunteers{" +
                "bagsStillNeeded=" + bagsStillNeeded +
                ", bagsStockedPerVolunteer=" + bagsStockedPerVolunteer +
                ", volunteersNeeded=" + volunteersNeeded +
                ", Volunteers=" + volunteers +
                ", goalBags=" + goalBags +
                ", actualBags=" + actualBags +
                ", day='" + day + '\'' +
                '}';
    }

    public void calculateBagsStillNeeded() {
        this.bagsStillNeeded = this.goalBags - this.actualBags;
    }

    public void calculateBagsStockedPerVolunteer() { this.bagsStockedPerVolunteer = (double) this.actualBags / this.volunteers; }

    public void calculateVolunteersNeeded() {
        this.volunteersNeeded = (double) this.bagsStillNeeded / this.bagsStockedPerVolunteer;
        this.volunteersNeeded = Math.round(this.volunteersNeeded * 100.0)/100.0;
    }
}
