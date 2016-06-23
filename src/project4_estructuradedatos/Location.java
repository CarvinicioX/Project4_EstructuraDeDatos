package project4_estructuradedatos;

import java.io.Serializable;

/**
 *
 * @author Vinicio
 */
public class Location implements Serializable {

    private String name = "";

    public Location(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
