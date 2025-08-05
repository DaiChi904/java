package examination.end_term;

import java.util.HashSet;
import java.util.Set;

public class Bag {
    public static void main(String[] args) {
        Item apple = new Item(" Apple ");
        Item ringo = new Item(" Apple ");

        Set<Item> bag = new HashSet<>();
        bag.add(apple);

        System.out.println(" equals : " + apple.equals(ringo));
        System.out.println(" contains : " + bag.contains(ringo));
    }
}

class Item {
    private String name;

    Item(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Item)) {
            return false;
        }
        Item other = (Item) obj;
        return name.equals(other.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}