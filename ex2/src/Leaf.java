import java.util.List;

public class Leaf extends Component {

    public Leaf(int value) {
        super(value);
    }

    @Override
    public void add(Component c) {
        System.out.println("Cannot add to a leaf");
    }

    @Override
    public void remove(Component c) {
        System.out.println("Cannot remove from a leaf");
    }

    @Override
    public void display(int level) {
        System.out.println("Level:" + level + ", Value:" + this.value);
    }

    @Override
    public int getSum() {
        return this.value;
    }

    @Override
    public List<Component> getChildren() {
        return null;
    }

}
