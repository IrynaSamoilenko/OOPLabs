package Lab2;

public class Main {
    public static void main(String[] args) {
        Entity testInstanceEmpty = new Entity();
        Entity testInstance = new Entity("FirstName", 25, new Coordinates(0,3));
        testInstance.printAll();
        testInstanceEmpty.printAll();
        testInstance.printMain();
        testInstanceEmpty.printMain();

        testInstance.move();
        testInstance.printAll();
    }
}
