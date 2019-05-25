package Lab3;

public class Wild extends Entity {
    private static int maxAge = 90;

    public Wild(){
        super();
        super.setMaxAge(maxAge);
    }

    public Wild(String name, int age, Coordinates coordinates){ super(name, age, maxAge, coordinates); }

    public Wild(Wild w) {
        super(w.getName(), w.getAge(), w.getMaxAge(), w.getCoordinates());
        super.setId(w.getId());
    }

    public void increment() { super.setAge(getAge()+1); }

    public int subtr(Entity o2){ return super.getAge()-o2.getAge(); }
}
