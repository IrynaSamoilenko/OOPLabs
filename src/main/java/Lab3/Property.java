package Lab3;

import java.util.PropertyResourceBundle;

public class Property extends EntityForm {

    public Property(){ super(); }

    public Property(String name, Coordinates coordinates) {
        super(name, coordinates);
    }

    public Property(Property pr) { super(pr.getName(), pr.getCoordinates());}


    // перегрузка методу equal(аналог оператора == )
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj ==null||this.getClass()!=obj.getClass())
            return false;
        Property other = (Property) obj;
        if (this.getName()!=other.getName()){
            return false;
        }
        return this.getCoordinates()==other.getCoordinates();
    }

    // перегрузка форматного виводу (визначена у супер-класі)
    @Override
    public String toString(){
        return super.toString();
    }

    @Override
    public void move(){
        System.out.println(super.getCoordinates());
    }
}
