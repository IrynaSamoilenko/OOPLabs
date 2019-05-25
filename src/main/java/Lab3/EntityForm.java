package Lab3;

public abstract class EntityForm {
    private String name;
    private Coordinates coordinates;
    private static int nextID=0;
    private int id;
    private double distance;

    //констркуктор по умолчанию
    public EntityForm(){
        this.name = "Noname";
        this.coordinates = new Coordinates();
        this.id = nextID++;
        this.distance = Math.round(Math.sqrt
                (Math.pow(coordinates.getX(), 2)+Math.pow(coordinates.getY(),2)));

    }

    //конструктор с параметрами
    public EntityForm(String name, Coordinates coordinates) {
        this.name = name;
        this.coordinates = coordinates;
        this.id = nextID++;
        this.distance = Math.round(Math.sqrt
                (Math.pow(coordinates.getX(), 2)+Math.pow(coordinates.getY(),2)));

    }

    //конструктор клонирования
    public EntityForm(EntityForm ef){
        this.name = new String(ef.getName());
        this.id = ef.getId();
        this.coordinates = ef.getCoordinates();
        this.distance = Math.round(Math.sqrt
                (Math.pow(coordinates.getX(), 2)+Math.pow(coordinates.getY(),2)));

    }

    public String getName() { return name; }
    public static int getNextID() { return nextID; }
    public int getId() { return id; }
    public Coordinates getCoordinates() { return coordinates; }
    public double getDistance() { return distance; }


    public void setName(String name) { this.name = name; }
    public static void setNextID(int nextID) { nextID = nextID; }
    public void setId (int id) { this.id = id; }
    public void setCoordinates(Coordinates coordinates) { this.coordinates = coordinates; }
    public void setDistance(double distance) { this.distance = distance; }

    public abstract void move();

}
