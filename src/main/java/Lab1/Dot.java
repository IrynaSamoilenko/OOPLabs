package Lab1;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.Serializable;
import java.util.Comparator;


@JsonPropertyOrder({"id", "x", "y"})
public class Dot implements Serializable, Comparable<Dot> {

    @JsonIgnore
    private static int counter = 1;
    @JsonProperty("ID")
    private int id;
    @JsonProperty("x")
    private int x;
    @JsonProperty("y")
    private int y;
    @JsonProperty("d")
    private double distance;


    public Dot(){
        this.id = counter++;
        this.x = 0;
        this.y = 0;
        this.distance = 0;
    }

    public Dot(int x, int y) {
        this.id = counter++;
        this.x = x;
        this.y = y;
        this.distance = Math.round(Math.sqrt(Math.pow(x, 2)+Math.pow(y,2)));
    }


    public static int getCounter() { return counter; }
    public int getId() {
        return id;
    }
    public int getX() { return x; }
    public int getY() { return y; }
    public double getDistance() { return distance; }

    public static void setCounter(int counter) { Dot.counter = counter; }
    public void setId(int id) { this.id = id; }
    public void setX(int x) { this.x = x; }
    public void setY(int y) { this.y = y; }
    public void setDistance(double distance) { this.distance = distance; }

    @Override
    public String toString() {
        return "ID#" + id +
                ": x=" + x +
                ", y=" + y +
                ", d=" + distance +
                "; \n";
    }


    @Override
    public int compareTo(Dot anyDot) {
        if (this.distance==anyDot.getDistance()) {
            return 0;
        } else if (this.distance<anyDot.getDistance()){
            return -1;
        } else {
            return 1;
        }
    }
}
