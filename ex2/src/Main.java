import java.util.List;

public class Main {

    public static void main(String[] args) {


        Composite root = new Composite(2);
        root.add(new Leaf(2));
        root.add(new Leaf(6));

        root.display(1);
        System.out.println("Sum: " + root.getSum());
        System.out.println("IsEven: " + isEven(root));

        Composite comp = new Composite(4);
//        comp.add(new Leaf(5));
        comp.add(new Leaf(6));
        root.add(comp);

        root.display(1);
        System.out.println("Sum: " + root.getSum());
        System.out.println("IsEven: " + isEven(root));

    }

    static boolean isEven(Component component) {

        if (component == null)
            return false;

        List<Component> children = component.getChildren();

        // Leaf
        if (children == null)
            return (component.getValue() % 2 == 0);

        boolean flag = true;
        for (Component comp : children) {
            flag = flag && isEven(comp);
        }

        return flag;
    }


}

