package Lab1.Utils;

import java.util.Comparator;
import Lab1.Dot;

public class DotComparator implements Comparator<Dot> {
    @Override
    public int compare(Dot dot1, Dot dot2) {
        Dot d1 = (Dot) dot1;
        Dot d2 = (Dot) dot2;
        return d1.compareTo(d2);

    }

}
