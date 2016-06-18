package project4_estructuradedatos;

import java.util.ArrayList;

/**
 *
 * @author Vinicio
 */
public class Hospital {

    private String name = "", address = "", ranking = "";
    private int maxParamedicCapacity = 0, maxAmbulanceCapacity = 0;
    private ArrayList<Paramedic> paramedics = null;
    private ArrayList<Ambulance> ambulances = null;

    public Hospital(String name, String address, String ranking, int maxParamedicCapacity, int maxAmbulanceCapacity) {
        this.name = name;
        this.address = address;
        this.ranking = ranking;
        this.maxParamedicCapacity = maxParamedicCapacity;
        this.maxAmbulanceCapacity = maxAmbulanceCapacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRanking() {
        return ranking;
    }

    public void setRanking(String ranking) {
        this.ranking = ranking;
    }

    public int getMaxParamedicCapacity() {
        return maxParamedicCapacity;
    }

    public void setMaxParamedicCapacity(int maxParamedicCapacity) {
        this.maxParamedicCapacity = maxParamedicCapacity;
    }

    public int getMaxAmbulanceCapacity() {
        return maxAmbulanceCapacity;
    }

    public void setMaxAmbulanceCapacity(int maxAmbulanceCapacity) {
        this.maxAmbulanceCapacity = maxAmbulanceCapacity;
    }

    public ArrayList<Paramedic> getParamedics() {
        return paramedics;
    }

    public void setParamedics(ArrayList<Paramedic> paramedics) {
        this.paramedics = paramedics;
    }

    public ArrayList<Ambulance> getAmbulances() {
        return ambulances;
    }

    public void setAmbulances(ArrayList<Ambulance> ambulances) {
        this.ambulances = ambulances;
    }

    @Override
    public String toString() {
        return name;
    }
}
