package Lab3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Field {
    private ArrayList<EntityForm> entities;


    public Field(){ this.entities = new ArrayList<EntityForm>(); }

    public Field(ArrayList<EntityForm> entities) { this.entities = entities; }

    public ArrayList<EntityForm> getEntities() { return entities; }


    public void setEntities(ArrayList<EntityForm> entities) { this.entities = entities; }


    public String getEntityFormById(int id){
        Iterator<EntityForm> iterator = entities.iterator();
        while (iterator.hasNext()) {
            EntityForm entity = (EntityForm) iterator.next();
            if (entity.getId() == id){
                return entity.getClass().getSimpleName();
            }
        } return "No element with such id";
    }

    public static <T extends EntityForm>  int genericCounterWithFixedValue(ArrayList<T> obj) {
        int counter = 0;
        int val = 5;
        for (T elem: obj) {
            if (elem.getDistance() < val) {
                counter++;
            }
        } return counter;
    }

    public static <T extends EntityForm, Type extends Number>  int genericCounterWithGenValue(ArrayList<T> obj, Type x, Type y) {
        int counter = 0;
        for (T elem: obj) {
                if (elem.getDistance() < genericValue(x, y)) {
                    counter++;
            }
        } return counter;
    }

    public static <T> double genericValue(T x, T y) {
        if (x instanceof Number && y instanceof Number){
            double res = Math.round(Math.sqrt(Math.pow(((Number) x).doubleValue(), 2)
                    +Math.pow(((Number) y).doubleValue(),2)));
            return res;
        } else {
            return 0;
        }
    }


}
