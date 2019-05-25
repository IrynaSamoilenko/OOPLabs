package Lab2;

import java.util.Arrays;

public class Entity {
    private String name;
    private int age;
    private Coordinates coordinates;

    public Entity() {
        this.name = "Unnamed";
        this.age = 0;
        this.coordinates = new Coordinates(0,0);
    }

    public Entity(String name, int age, Coordinates coordinates) {
        this.name = name;
        this.age = age;
        this.coordinates = coordinates;
    }

    public void move() {
            coordinates.setX(coordinates.getX()+1);
            coordinates.setY(coordinates.getY()+1);
    }

    @Override
    public String toString() {
        return "Entity{" +
                "name = '" + name + '\'' +
                ", age = " + age +
                ", coordinates = " + coordinates +
                '}';
    }

    public void printAll() {
        System.out.println(toString());
    }


    public void printMain(){
        System.out.println("Class name is '" + getClass().getSimpleName() + "', name = " + name);
    }
}
