package project4_estructuradedatos;

/**
 *
 * @author Vinicio
 */
public class Ambulance {

    private String plate = "";
    private int year = 0, maxVelocity = 0;

    public Ambulance(String plate, int year, int maxVelocity) {
        this.plate = plate;
        this.year = year;
        this.maxVelocity = maxVelocity;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMaxVelocity() {
        return maxVelocity;
    }

    public void setMaxVelocity(int maxVelocity) {
        this.maxVelocity = maxVelocity;
    }
}
