import java.util.List;

abstract public class Component {

    protected int value;

    public Component(int value) {
        this.value = value;
    }

    public abstract void add(Component c);

    public abstract void remove(Component c);

    public abstract void display(int level);

    public abstract int getSum();

    public abstract List<Component> getChildren();

    public int getValue() {
        return this.value;
    }


}