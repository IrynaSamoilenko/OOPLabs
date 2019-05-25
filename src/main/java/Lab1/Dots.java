package Lab1;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonView;

import java.io.Serializable;
import java.util.Scanner;

public class Dots implements Serializable {
    @JsonProperty("dots")
    @JsonView
    private Dot[] dots;
    @JsonIgnore
    public static int size;
    @JsonIgnore
    public static int counter = 0;

    public Dots(){
        this.size = 0;
        this.dots = new Dot[this.size];
    }

    public Dots(int size) {
        this.size = size;
        this.dots = new Dot[this.size];
    }

    public Dots(int size, Dot[] dots) {
        super();
        this.size = size;
        this.dots = dots;
    }

    public Dot[] getDots() {
        return dots;
    }
    public static int getCounter() { return counter; }
    public static int getSize() { return size; }

    public void setDots(Dot[] dots) { this.dots = dots; }
    public static void setSize(int size) { Dots.size = size; }
    public static void setCounter(int counter) { Dots.counter = counter; }

    //метод отримання та встановлення координати Х
    public int setX() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter X => ");
        int x = sc.nextInt();
        return x;
    }

    //метод отримання та встановлення координати Y
    public int setY() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Y => ");
        int y = sc.nextInt();
        return y;
    }


    //метод довання точки у кінець
    public void appendDot(int x, int y) {
        if (counter < size) {
            dots[counter++] = new Dot(x, y);
        } else {
            System.out.println("Container is full!");
        }
    }

    //метод додавання точки після індексу К
    public void appendDot(int k) {
         try {
             if (k + 1 < size) {
                 int x = setX();
                 int y = setY();
                 dots[++k] = new Dot(x, y);
             }
         } catch (IndexOutOfBoundsException e) {
                 System.out.println(e.getMessage());
         }
    }

    //метод видалення точки після індексу К
    public void deleteDot(int k)  {
        try {
            if (k + 1 < size) {
                dots[++k] = new Dot();
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }


    //метод підрахування кількості точок, віддалених більше заданої відстані
    public int counterNumberOfRemoteDots(int distance){
        int counter = 0;
        for (Dot dot: dots) {
            if (dot.getDistance() > (double)distance) {
                ++counter;
            }
        } return counter;
    }


    //метод заповнення контейнера повністю
    public void fullContainer() {
        while (counter < size) {
            appendDot(setX(), setY());
            System.out.print("\n");
        }
    }

    //метод виведення на екран вмісту контейнера
    public void print() {
        for (Dot dot : dots) {
            if (dot != null) {
                System.out.println(dot.toString());
            } else {
                System.out.println("Not coordinates");
            }

        }
    }

    // перегружений метод toString відображення інформації про об'єкт
    @Override
    public String toString() {
        if(counter!=0) {
            for (Dot dot : dots) {
                if (dot != null) {
                    return dot.toString();
                } else {
                    return "Not coordinates";
                }
            }
        }
        return "Not coordinates";

    }

}
