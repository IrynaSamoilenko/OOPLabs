package Lab3;

public class Entity extends EntityForm {
    private int age;
    private int maxAge;
    private int live;

    //констркуктор по умолчанию
    public Entity() {
        super();
        this.age = 0;
        this.maxAge = 0;
        this.live = 0;
    }

    //конструктор с параметрами
    public Entity(String name, int age, int maxAge, Coordinates coordinates) {
        super(name, coordinates);
        this.age = age;
        this.maxAge = maxAge;
        if (age < maxAge) {
            this.live = 1;
        } else {
            this.live = 0;
        }
    }

    //конструктор клонирования
    public Entity(Entity en){
        super(en.getName(), en.getCoordinates());
        this.age = en.getAge();
        this.maxAge = en.getMaxAge();
        this.live = en.getLive();
    }

    public int getMaxAge() {
        return maxAge;
    }
    public int getLive() { return live; }
    public int getAge() { return age; }

    public void setAge(int age) { this.age = age; }
    public void setLive(int live) { this.live = live; }
    public void setMaxAge(int maxAge) { this.maxAge = maxAge; }

    public void move() {
        if (age < maxAge) {
            setCoordinates(new Coordinates(getCoordinates().getX()+1,
                                                getCoordinates().getY()+1));
            age++;
        } else {
            live = 0;
        }
    }

    // перегрузка форматного виводу
    @Override
    public String toString() {
        return "Entity {" +
                super.getName() + '\'' +
                "id='" + super.getId() + '\'' +
                ", age=" + age +
                ", maxAge=" + maxAge +
                ", live=" + live +
                ", distance=" + getDistance() +
                ", coordinates=" + getCoordinates() +
                '}';
    }

    // друкування на екран форматного виводу
    public void printAll() { System.out.println(toString()); }

    // друкування головних якостей на екран
    public void printMain(){
        System.out.println("Class name is '" + getClass().getSimpleName() +
                            "', name = " + getName() +
                            ", live =" + live);
    }
}
