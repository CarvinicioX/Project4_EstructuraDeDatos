package project4_estructuradedatos;

import java.io.Serializable;

/**
 *
 * @author Vinicio
 */
public class Paramedic implements Serializable {

    private String name = "", id = "", ranking = "";
    private int age = 0;
    private boolean available = true;

    public Paramedic(String name, String id, String ranking, int age) {
        this.name = name;
        this.id = id;
        this.ranking = ranking;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRanking() {
        return ranking;
    }

    public void setRanking(String ranking) {
        this.ranking = ranking;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void work(boolean available) {
        this.available = available;
    }

    public boolean isWorking() {
        return available;
    }
}
