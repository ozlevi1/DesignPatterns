import java.lang.reflect.Array;
import java.util.ArrayList;

public class MyValue {

    private ArrayList<String> arr;
    private int count;

    public MyValue() {
        this.count = 0;
        this.arr = new ArrayList<String>();
    }

    public int getCount() {
        return this.count;
    }

    public void add(String str) {
        this.arr.add(str);
        this.count++;
    }

    @Override
    public String toString() {
        return "Count:" + this.count + " " + "List: " + arr.toString();
    }

}
