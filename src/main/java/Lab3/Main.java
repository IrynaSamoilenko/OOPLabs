package Lab3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------------------MOVING----------------------");
        Entity wildEmpty = new Wild();
        Entity wild = new Wild("Wolf", 89, new Coordinates (2,3));
        wild.printAll();
        wild.move();
        wild.printAll();
        System.out.println("-----------------------DEATH----------------------");
        wild.move();
        wild.printAll();

        System.out.println("-------------------CLONING------------------------");
        Victim v1 = new Victim("Bunny", 4, new Coordinates(2, 2));
        Victim v2 = new Victim(v1);
        System.out.println(v1);
        System.out.println(v2);

        System.out.println("--------------CREATE AND PRINT FIELD--------------");
        Field field = new Field();
        field.getEntities().add(wild);
        field.getEntities().add(v1);
        field.getEntities().add(v2);

        for (EntityForm ef: field.getEntities()) {
            System.out.println(ef);
        }
        System.out.println("---------------ENTITY FORM OF ID------------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your id ->");
        int id = sc.nextInt();
        System.out.println(field.getEntityFormById(id));


        System.out.println("--------------OVERLOADING INCREMENT----------------");
        System.out.println(v1);
        v1.increment();
        System.out.println(v1);

        System.out.println("--------------OVERLOADING SUBTRACTION--------------");
        System.out.println("Bunny#2's age - Wolf's#1 age = " + v1.subtr(wild));

        System.out.println("--------------GENERIC WITH FIXED MAX DISTANCE VALUE 5-------------");
        System.out.println(Field.genericCounterWithFixedValue(field.getEntities()));

        System.out.println("--------------GENERIC WITH  GENERIC VALUE------------");
        System.out.println(Field.genericCounterWithGenValue(field.getEntities(), 1.2, 1));


    }
}
