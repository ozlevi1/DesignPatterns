import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {

    private List<Component> children = new ArrayList<Component>();

    public Composite(int value) {
        super(value);
    }

    @Override
    public void add(Component c) {
        this.children.add(c);
    }

    @Override
    public void remove(Component c) {
        this.children.remove(c);
    }

    @Override
    public void display(int level) {

        System.out.println("Level:" + level + ", Value:" + this.value);

        for (Component component : this.children) {
            component.display(level + 1);
        }
    }

    @Override
    public int getSum() {

        int sum = this.value;
        for (Component component : this.children) {
            sum += component.getSum();
        }
        return sum;
    }

    @Override
    public List<Component> getChildren() {
        return this.children;
    }
}
