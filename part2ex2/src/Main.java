import java.util.Arrays;
import java.util.Hashtable;

public class Main {

    public static void main(String[] args) {

        String[] words = {"java", "jjava", "vaj", "aavj", "j", "vjaa", "dan", "and", "ddan"};

        Hashtable<Integer, MyValue> hash = new Hashtable<Integer, MyValue>();
        MyValue val;
        int asci;


        for (String word : words) {

            asci = Arrays.stream(word.split("")).mapToInt(value -> ((int) value.charAt(0))).sum();

            if (hash.containsKey(asci))
                val = hash.get(asci);
            else
                val = new MyValue();

            val.add(word);
            hash.put(asci, val);

        }

        System.out.println(hash.toString());

    }


}

