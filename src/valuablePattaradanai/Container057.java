package valuablePattaradanai;
import static utilPattaradanai.Tool057.*;

import java.util.Arrays;

public class Container057 {

    private final Item057[] items = new Item057[57];

    @Override
    public String toString() {
        return "count: " + count057(items) + " items: " + Arrays.toString(items);
    }

    public boolean add(Item057 item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i].isMatched(item)) return false;
            items[i] = item;
        }

        return true;
    }

    public boolean remove(Item057 item) {
        for (int i = 0; i < items.length; i++) {
            if(items[i].equals(item)) items[i] = null;
            return true;
        }
        return false;
    }
}
