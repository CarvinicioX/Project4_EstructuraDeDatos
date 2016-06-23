package project4_estructuradedatos;

import java.io.Serializable;

/**
 *
 * @author Vinicio
 */
public class Ambulance implements Serializable {

    private String plate = "";
    private int year = 0, maxVelocity = 0;
    private boolean available = true;

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

    public void work(boolean available) {
        this.available = available;
    }

    public boolean isWorking() {
        return available;
    }
}
