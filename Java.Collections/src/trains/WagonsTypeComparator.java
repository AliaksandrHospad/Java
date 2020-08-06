package trains;

import java.util.Comparator;

public class WagonsTypeComparator implements Comparator<Train> {
    @Override
    public int compare(Train o1, Train o2) {
        return o1.getType().compareTo(o2.getType());
    }
}
