package valuablePattaradanai;
import static utilPattaradanai.Tool057.*;

public class Item057 {
    private final String name;
    private final int amount;

    private Item057(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public static Item057 create(String name, int amount) {
        if(!isUsable057(name) && amount < 0) return null;
        return new Item057(name, amount);
    }

    public int add(Item057 item) {
        return this.amount += item.amount;
    }

    public boolean isMatched(Item057 item) {
        if(!this.name.equals(item.name)) return false;
        return true;
    }

    @Override
    public String toString() {
        return String.format("(%s, %d)",this.name,this.amount);
    }


}
