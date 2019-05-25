package Lab3;

public class Victim extends Entity {
    private static int maxAge = 50;

    public Victim(){
        super();
        super.setMaxAge(maxAge);
    }

    public Victim(String name, int age, Coordinates coordinates){ super(name, age, maxAge, coordinates); }

    public Victim (Victim v) {
        super(v.getName(), v.getAge(), v.getMaxAge(), v.getCoordinates());
        super.setId(v.getId());
    }

    public void increment() {
        super.setAge(getAge()+1);
    }

    public int subtr(Entity o2) {
        return super.getAge()-o2.getAge();
    }
}
