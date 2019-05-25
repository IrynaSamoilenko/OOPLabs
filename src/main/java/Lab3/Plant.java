package Lab3;

public class Plant extends EntityForm {

    public Plant(){
        super();
    }

    public Plant(String name, Coordinates coordinates) {
        super(name, coordinates);
    }

    public Plant(Plant pl) { super(pl.getName(), pl.getCoordinates());}
    @Override
    public void move(){
        System.out.println(super.getCoordinates());
    }
}
