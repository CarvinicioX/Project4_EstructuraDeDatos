package project4_estructuradedatos;

import java.io.Serializable;

/**
 *
 * @author Vinicio
 */
public class Length implements Serializable {

    Location A = null, B = null;
    int Length;

    public Length(int Length, Location A, Location B) {
        this.Length = Length;
        this.A = A;
        this.B = B;
    }

    public Location getA() {
        return A;
    }

    public void setA(Location A) {
        this.A = A;
    }

    public Location getB() {
        return B;
    }

    public void setB(Location B) {
        this.B = B;
    }

    public int getLength() {
        return Length;
    }

    public void setLength(int Length) {
        this.Length = Length;
    }

    @Override
    public String toString() {
        return Length + "";
    }
}
