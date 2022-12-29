import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterators {
    public static void main(String[] args) {
        List<Integer> ages = new ArrayList<>();

        ages.add(12);
        ages.add(-23);
        ages.add(99);
        ages.add(0);

        ages.forEach(System.out::println);
        System.out.println("...........");

        // OR
        Iterator<Integer> i = ages.iterator();

        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
